package classes;

public class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean canPlaceInto(Rectangle anotherRect) {
        if (this.a <= anotherRect.a && this.b <= anotherRect.b) {
            return true;
        } else if (this.a <= anotherRect.b && this.b <= anotherRect.a) {
            return true;
        }
        return false;
    }
}
