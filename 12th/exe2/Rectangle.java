public class Rectangle extends Figure {

  private double height;
  private double width;

  public Rectangle(double height, double width, double x, double y) {
    super(x, y);
    this.height = height;
    this.width = width;
  }

  public double getHight() {
    return height;
  }

  public double getWidth() {
    return width;
  }

  @Override
  public double getArea() {
    return this.height * this.width;
  }
}
