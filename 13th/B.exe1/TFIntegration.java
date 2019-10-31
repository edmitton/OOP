public class TFIntegration extends TrapezoidFormula {

  public TFIntegration(double xMin, double xMax) {
    super(xMin, xMax);
  }

  @Override
  public double f(double x) {
    double ans = 1/(Math.pow(x+2, 2) + 0.0001) + 1/(Math.pow(x-0.5, 2) + 0.005) + Math.pow(x, 2) + 5;

    return ans;
  }
}