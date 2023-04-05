package classes;

public class LevelLoader {
    private static LevelLoader instance = new LevelLoader();

    public static LevelLoader getInstance() {
        return instance;
    }
    public String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }
}
