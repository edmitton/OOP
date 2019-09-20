public class Exe01_2 {
  public static void main(String[] args) {
    for (int i = 0; i <= 100; i++) {
      if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Bazz");
      } else if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBazz");
        System.out.println("OKKKKKKKKKKKKKKKKKKKK");
      } else {
        System.out.println(i);
      }
    }
  }
}