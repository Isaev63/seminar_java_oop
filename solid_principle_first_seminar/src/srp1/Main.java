package srp1;

import srp1.figure.Point;
import srp1.figure.Square;
import srp1.figure.SquereDrawer;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1, 1), 5);
        System.out.printf("Square area: %d \n", square.getArea());

        SquereDrawer squareDrawer = new SquereDrawer();
        squareDrawer.draw(square);
    }
}
