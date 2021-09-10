package shape;

public class Triangle extends shape {
    @Override
    public void draw() {
        System.out.println("画三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦三角形");
    }
}
