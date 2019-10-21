public class Supermarket {
  public static int sumPrice = 0;
  private int price;
  private int number;

  public Supermarket(int value_p, int value_n) {
    this.price = value_p;
    this.number = value_n;

    sumPrice += price * number;
  }

  public int getPrice() {
    return this.price;
  }

  public int getNum() {
    return this.number;
  }

  public static int getSum() {
    return sumPrice;
  }
}
