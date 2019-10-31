public abstract class TrapezoidFormula implements Evaluation {

  private double xMin;
  private double xMax;
  
  public TrapezoidFormula(double xMin, double xMax) {
    this.xMin = xMin;
    this.xMax = xMax;
  }

  @Override
  public double evaluate(int n) {
    double total = (xMin + xMax) * 1/2;
    double h = (xMax - xMin)/n;

    for (int i = 1; i < n; i++) {
      total  += f(xMin + h * i);
    }

    return h * total;
  }
}
