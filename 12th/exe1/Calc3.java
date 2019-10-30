public class Calc3 implements Equation{
  private int y;
  public Calc3(int y){
      this.y = y;
  }  
  @Override
  public void display(){
      System.out.print("課題の答え:");
      System.out.println(add(y) * multiple(y));
  }
}
