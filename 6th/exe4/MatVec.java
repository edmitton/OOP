import java.util.Scanner;

public class MatVec {
  public static double[][] input(int row, int column){
    Scanner scan = new Scanner(System.in);
    double[][] matrix = new double[row][column];
    System.out.println(row + "×" + column + "行列の入力：");

    for (int i = 0; i < row; i++) {
      System.out.println(i+1 + "行目：");
      for (int j = 0; j < column; j++) {
        matrix[i][j] = scan.nextDouble();
      }
    }
    return matrix;
  }

  public static double[] input(int number){
    Scanner scan = new Scanner(System.in);
    double[] vec = new double[number];
    System.out.println(number + "次元ベクトルの入力：");

    for (int i = 0; i < number; i++) {
      vec[i] = scan.nextDouble();
    }
    return vec;
  }

  public double[] prov(double[][] matrix, double[] b) {
    double[] ans = new double[matrix.length];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < b.length; j++) {
        ans[i] += matrix[i][j]*b[j];
      }
    }
    return ans;
  }

  public double prov(double[] b, double[] c) {
    double ans = 0;

    for (int i = 0; i < b.length; i++) {
      ans += b[i]*c[i];
    }
    return ans;
  }

  public void display(double[] ans) {
    for (double value : ans) {
      System.out.println(value); 
    }
  }
}
