import java.util.Random;

public class MyRandom {
  public int generate(int max) {
    Random r = new Random();
    return r.nextInt(max+1);
  }

  public int generate(int min, int max) {
    Random r = new Random();
    return r.nextInt(max+1)+min;
  }
}
