public class Sample01{
  public static void main(String[] args) {
    System.out.println(Pen.getSum());
    Pen[] pens = new Pen[2];
    pens[0] = new     ;
    pens[1] = pens[0];

    for (int i = 0; i < pens.length; i++) {
      System.out.print(pens[i].getColor());
      System.out.println(pens[i].getLength());
    }
    System.out.println(Pen.getSum());
  }
}