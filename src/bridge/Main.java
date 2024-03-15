package bridge;

public class Main {
    public static void main(String[] args) {
        Shape tri = new Triangle( new GreenColor() );
        tri.applyColor();

        Shape pent = new Pentagon( new RedColor() );
        pent.applyColor();
    }
}