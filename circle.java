package shape;

public class circle extends shape {
    @Override
    public void draw() {
        System.out.println("画圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦圆形");
    }
}
