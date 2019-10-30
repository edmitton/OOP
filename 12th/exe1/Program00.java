public class Program00{
	public static void main(String[]args){
			Equation[] aaa = new Equation[3];
			aaa[0] = new Calc1(5);
			aaa[1] = new Calc2(3);
			aaa[2] = new Calc3(2);
			for (int i=0; i<aaa.length; i++){
					aaa[i].display();
			}

			System.out.println("Equationに属するかチェック");
			for (int i=0; i<aaa.length; i++){
					if (aaa[i] instanceof Equation){
							System.out.println("i="+i);
					}
			}

			System.out.println("Calc1に属するかチェック");
			for (int i=0; i<aaa.length; i++){
					if (aaa[i] instanceof Calc1){
							System.out.println("i="+i);
					}
			}
	}
}