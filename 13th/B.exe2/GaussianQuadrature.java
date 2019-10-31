public abstract class GaussianQuadrature implements Evaluation, NodesWeightTable {

  private double xMin;
  private double xMax;
  private double alpha;
  private double beta;

  public GaussianQuadrature(double xMin, double xMax) {
    this.xMin = xMin;
    this.xMax = xMax;
    
  }

  public double evaluate(int n) {
    
  }

  private double[] getNodes(int n) {
    
  }
  
  private double getWeight(int n) {
    
  }
}