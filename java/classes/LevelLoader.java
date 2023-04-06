package classes;

public class LevelLoader {
    public void load(Level level) throws LevelTooBigException {
        if (level.getArea() > 100000) {
            throw new LevelTooBigException("Level too big");
        }
        System.out.println("Level loaded");
    }
}
