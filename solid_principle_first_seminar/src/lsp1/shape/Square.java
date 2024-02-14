package lsp1.shape;

public class Square extends ShapeFigure {

    private int side;

    public Square(int side) {}

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(side, 2);
    }
}
