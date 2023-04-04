package classes;

import java.util.Arrays;

public class Level {
    private LevelInfo levelInfo;
    private Point[] points;

    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    public int calculateLevelHash() {
        int hash = 0;
        for (Point point : points) {
            hash += point.getX() * point.getY();
        }
        return hash;
    }

    public static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public static class LevelInfo {
        private String name;
        private String difficulty;

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelInfo.name +
                ", difficulty is " + levelInfo.difficulty +
                ", point count is " + points.length;
    }
}
