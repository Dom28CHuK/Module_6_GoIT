package classes;

public class Hero {
    private String name;
    private int hp;

    public Hero(String name, int hp) {
        if (hp >= 0 & hp <= 200) {
            this.name = name;
            this.hp = hp;
        } else if (hp > 200) {
            this.name = name;
            this.hp = 200;
        } else if (hp < 0) {
            this.name = name;
            this.hp = 0;
        }
    }

    public Hero() {
        this("Paratrooper", 100);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}
