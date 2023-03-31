package classes;

public class Circle extends Shape {
    private float radius;

    public Circle(float radius) {
        super("Circle");
        this.radius = radius;

        System.out.println("Call in Circle");
    }
}
