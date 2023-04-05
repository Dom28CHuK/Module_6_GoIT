package classes;

public class AIPlayer {
    private int hp;

    public AIPlayer() {}

    public AIPlayer(int hp) {
        if (hp < 0 || hp > 100) {
            throw new IllegalArgumentException("invalid value");
        }
        this.hp = hp;
    }

    public void setHp(int hp) {
        if (hp < 0 || hp > 100) {
            throw new IllegalArgumentException("Invalid value");
        }
        this.hp = hp;
    }
}
