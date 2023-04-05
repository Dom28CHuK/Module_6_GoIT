import classes.GameMenu;
import classes.LevelLoader;

public class Main {
    public static void main(String[] args) {
        GameMenu menu = new GameMenu();

        //options
        menu.act(new GameMenu.Options());

        //start
        menu.act(new GameMenu.Start());

        //exit
        menu.act(new GameMenu.Exit());

        LevelLoader levelLoader = new LevelLoader();

        //Loading level Startlevel ...
        System.out.println(levelLoader.load("StartLevel"));

        System.out.println(LevelLoader.getInstance().load("StartLevel"));
        System.out.println(LevelLoader.getInstance() == LevelLoader.getInstance());
    }
}
