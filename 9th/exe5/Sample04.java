public class Sample04 {
  public static void main(String[] args) {
    Hero heroA = new Hero("パイソン", 20);
    Hero heroB = new Hero("ジャヴァ", 25);
    
    if (heroA.fight(heroB)) {
      System.put.println(heroA.getName() + "の勝利！");
    } else {
      System.out.println(heroB.getName() + "の勝利！");
    }
  }
}