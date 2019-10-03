public class Practice04 {
  public static void main(String[] args) {
    final int N = Integer.parseInt(args[0]);
    final int M = Integer.parseInt(args[1]);

    double[][] aMat = MatVec.input(N, M);
    double[] bVec   = MatVec.input(M);
    double[] cVec   = MatVec.input(M);

    MatVec mv = new MatVec();
    double[] ab = mv.prov(aMat, bVec);
    double bc = mv.prov(bVec,cVec);

    System.out.println("A * b = ");
    mv.display(ab);
    System.out.println("(b, c) = " + bc);
  }
}
