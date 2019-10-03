public class Practice03 {
  public static void main(String[] args) {
    MyRandom rand = new MyRandom();
    if (args.length == 2) {
      int rMax = Integer.parseInt(args[0]);
      int numOfRand = Integer.parseInt(args[1]);
      for (int i = 0; i < numOfRand; i++) {
        System.out.println(rand.generate(rMax));
      }
    } else if(args.length == 3) {
      int rMin = Integer.parseInt(args[0]);
      int rMax = Integer.parseInt(args[1]);
      int numOfRand = Integer.parseInt(args[2]);
      for (int i = 0; i < numOfRand; i++) {
        System.out.println(rand.generate(rMin, rMax));
      }
    } else {
      System.out.println("引数が２つまたは３つ必要です");
    }
  }
}