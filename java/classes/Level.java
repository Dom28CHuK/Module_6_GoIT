package classes;

public class Level {
    private String levelName;

    public Level(String levelName) {
        this.levelName = levelName;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelName;
    }
}
