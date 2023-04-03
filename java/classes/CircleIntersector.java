package classes;

public class CircleIntersector {
    private int x1;
    private int y1;
    private int r1;
    private int x2;
    private int y2;
    private int r2;

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {
        this.x1 = x1;
        this.y1 = y1;
        this.r1 = r1;
        this.x2 = x2;
        this.y2 = y2;
        this.r2 = r2;
    }

    @Override
    public String toString() {
        int dx = x1 - x2;
        int dy = y1 - y2;
        int radiiSum = r1 + r2;
        if (dx * dx + dy * dy <= radiiSum * radiiSum) {
            return "intersects";
        } else {
            return "not intersects";
        }
    }
}
