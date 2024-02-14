package lsp1.view;

import lsp1.shape.Rectangle;
import lsp1.shape.ShapeFigure;

public class ShapeView {
    private ShapeFigure shapeFigure;

    public ShapeView(Rectangle rectangle) {
        this.shapeFigure = shapeFigure;
    }

    public void showArea() {
        System.out.print("Area of rectangle equal:");
        System.out.println(shapeFigure.getArea());
    }
}
