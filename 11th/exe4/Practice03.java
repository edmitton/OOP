public class Practice03 {
  public static void main(String[] args) {
    Human[] humans = new Human[3];

    humans[0] = new Human("生産 太郎", 50);
    humans[1] = new Wizard("日本 花子", 95, 170, "ナオール");
    humans[2] = new Wizard("数情 理", 100, 100, "ヤスーム");

    for (int i = 0; i < humans.length; i++) {
      System.out.println(humans[i]);
    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < humans.length; j++) {
        System.out.println(humans[j].action());  
      }
    }

    for (int i = 0; i < humans.length; i++) {
      System.out.println(humans[i]);
    }
  }
}
