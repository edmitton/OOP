public class Practice02 {
  public static void main(String[] args) {
    Human[] humans = new Human[2];

    humans[0] = new Human("生産 太郎", 50);
    humans[1] = new Wizard("日本 花子", 95, 170, "ナオール");

    System.out.println("名前：" + humans[0].getName() + ", HP：" + humans[0].getHp());
    System.out.println("名前：" + humans[1].getName() + ", HP：" + humans[1].getHp() + ", MP：" + ((Wizard)humans[1]).getMp() + ", 魔法：" + ((Wizard)humans[1]).getSpell());
    
    for (int i = 0; i < humans.length; i++) {
      System.out.println(humans[i].action());
    }

    System.out.println("名前：" + humans[0].getName() + ", HP：" + humans[0].getHp());
    System.out.println("名前：" + humans[1].getName() + ", HP：" + humans[1].getHp() + ", MP：" + ((Wizard)humans[1]).getMp() + ", 魔法：" + ((Wizard)humans[1]).getSpell());
  }
}
