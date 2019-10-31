public interface NodesWeightsTable {

  double[][] nodes = {
    //n=2
    {-Math.sqrt(3.0)/3.0, Math.sqrt(3.0)/3.0},

    //n=3
    {-Math.sqrt(15.0)/5.0, 0.0, Math.sqrt(15.0)/5.0},

    //n=4
    {-Math.sqrt(525.0 + 70.0 * Math.sqrt(30.0))/35.0,
     -Math.sqrt(525.0 - 70.0 * Math.sqrt(30.0))/35.0,
     Math.sqrt(525.0 - 70.0 * Math.sqrt(30.0))/35.0,
     Math.sqrt(525.0 + 70.0 * Math.sqrt(30.0))/35.0},

    //n=5
    {-Math.sqrt(245.0 + 14.0 * Math.sqrt(70.0))/21.0,
     -Math.sqrt(245.0 - 14.0 * Math.sqrt(70.0))/21.0,
     0.0,
     Math.sqrt(245.0 - 14.0 * Math.sqrt(70.0))/21.0,
     Math.sqrt(245.0 + 14.0 * Math.sqrt(70.0))/21.0}
  };

  double[][] weights = {
    //n=2
    {1.0, 1.0},
    
    //n=3
    {5.0/9.0, 8.0/9.0, 5.0/9.0},

    //n=4
    {(18.0 - Math.sqrt(30.0))/36.0,
     (18.0 + Math.sqrt(30.0))/36.0,
     (18.0 + Math.sqrt(30.0))/36.0,
     (18.0 - Math.sqrt(30.0))/36.0},
    
    //n=5
    {(322.0 - 13.0 * Math.sqrt(70.0))/900.0,
     (322.0 + 13.0 * Math.sqrt(70.0))/900.0,
     128.0/225.0,
     (322.0 + 13.0 * Math.sqrt(70.0))/900.0,
     (322.0 - 13.0 * Math.sqrt(70.0))/900.0}
  };
}