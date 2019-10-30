public class Calc2 implements Equation{
	private int y;
	public Calc2(int y){
			this.y = y;
	}  
	@Override
	public void display(){
			System.out.print("掛け算:");
			System.out.println(multiple(y));
	}
}