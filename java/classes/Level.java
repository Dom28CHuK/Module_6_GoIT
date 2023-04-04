package classes;

import java.util.Arrays;

public class Level {
    private String levelName;
    private Point[] points;

    public Level(String levelName, Point[] points) {
        this.levelName = levelName;
        this.points = points;
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

    @Override
    public String toString() {
        return "Quarke level, name is " + levelName + ", point count is " + points.length;
    }
}
