import java.util.Scanner;

public class Sample12Ver2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Input student ID --> ");
    int studentID = scan.nextInt();

    System.out.print("Input name --> ");
    String name = scan.next();

    System.out.print("Input GPA --> ");
    double gpa = scan.nextDouble();

    System.out.println("学生番号：" + studentID + "名前：" + name + "GPA：" + gpa);

  }
}