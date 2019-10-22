public class Apple extends Fruits {
  private String color;

  public Apple(String made, String color) {
    super(made);
    this.color = color;
  }

  @Override
  public void display(){
    System.out.print("原料は" + color + "りんごです。");
    super.display();
  }
}
