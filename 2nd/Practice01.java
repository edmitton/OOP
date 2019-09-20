import java.util.Random;

public class Practice01 {
  public static void main(String[] args) {
    final int N = 5;
    int sum = 0;
    int maxScore = 0;
    int minScore = 100;

    Random r = new Random();

    for (int i = 0; i < N; i++) {
      int score = r.nextInt(101);
      System.out.println(i + "：" + score);
      sum += score;
      maxScore = Math.max(score, maxScore);
      minScore = Math.min(score, minScore);
    }

    double average = sum / (double) N;

    System.out.println("平均点：" + average);
    System.out.println("最高点：" + maxScore);
    System.out.println("最低点：" + minScore);
  }
}