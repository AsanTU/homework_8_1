package kg.geektech.game.players;

public abstract class Hero extends kg.geektech.game.players.GameEntity
        implements kg.geektech.game.players.HavingSuperAbility {
    private kg.geektech.game.players.SuperAbility power;

    public Hero(String name, int health, int damage, kg.geektech.game.players.SuperAbility power) {
        super(name, health, damage);
        this.power = power;
    }

    public void hit(Boss boss) {
        if (this.getHealth() > 0 && boss.getHealth() > 0) {
            boss.setHealth(boss.getHealth() - this.getDamage());
        }
    }

    public void applySuperPower(Hero[] heroes, Boss boss) {
    }
}
