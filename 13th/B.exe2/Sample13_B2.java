public class Sample13_B2 {

  pubic static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    GQIntegration gq = new GQIntegration(-2.0, 0.5);
    System.out.println(gq.evaluate(n));
  }
}