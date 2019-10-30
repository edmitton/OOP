public class Calc1 implements Equation{
  private int y;
  public Calc1(int y){
      this.y = y;
  }  
  @Override
  public void display(){
      System.out.print("足し算:");
      System.out.println(add(y));
  }
}