public class Kanto {
  public static void main(String[] args) {
    Ken chiba = new Ken(12, "CHIBA");
    Ken kanagawa = new Ken(11, "SAITAMA");
    Ken saitama = new Ken(14, "YOKOHAMA");

    System.out.println("千葉県：" + chiba.getKencho() + "(" + chiba.getCode() + ")");
    System.out.println("埼玉県：" + saitama.getKencho() + "(" + saitama.getCode() + ")");
    System.out.println("神奈川県：" + kanagawa.getKencho() + "(" + kanagawa.getCode() + ")");
  }
}