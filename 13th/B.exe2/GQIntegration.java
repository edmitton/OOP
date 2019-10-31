public class GQIntegration extends GaussianQuadrature {

  public GQIntegration(double xMin, double xMax) {
    super(xMin, xMax);
  }

  public double f(double x) {
   double ans =  Math.pow(x, 2) * (Math.sin(x) + Math.cos(x))
  }
}