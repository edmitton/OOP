public class Practice01 {
  public static void main(String[] args) {
    double[] aVec = {0.0, 2.0, 3.0};
    double[] bVec = {2.5, -1.0, 1.0};

    Calculation cal = new Calculation();
    double[] nVec = cal.cross(aVec, bVec);

    for(double value : nVec) {
      System.out.println(value);
    }
  }
}
