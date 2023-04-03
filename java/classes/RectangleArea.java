package classes;

public class RectangleArea {
    private int[] coords;

    public RectangleArea(int[] coords) {
        this.coords = coords;
    }

    public int getArea() {
        int x1 = coords[0];
        int y1 = coords[1];
        int x2 = coords[2];
        int y2 = coords[3];

        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);

        return width * height;
    }
}
