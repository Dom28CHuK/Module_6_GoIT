import classes.Hero;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Stranger", -250);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());
    }
}
