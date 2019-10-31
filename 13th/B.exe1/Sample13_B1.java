public class Sample13_B1 {

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    TFIntegration tf = new TFIntegration(-5.0, 3.0);
    System.out.println(tf.evaluate(n));
  }
}
