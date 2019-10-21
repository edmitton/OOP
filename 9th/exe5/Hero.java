import java.util.Random;

public class Hero {
  private String name;
  private int hp;
  private static Random r = new Random();

  public Hero(String name, int hp) {
    this.name = name;
    this.hp   = hp;
  }

  public boolean fight(Hero op) {
    do {
      int x[] = calcDamage();
      int y[] = calcDamage();

      displayDamage(x);
      setHp(x);

      displayStatus();
      op.displayStatus();
      if(op.getHp == 0) return true;

      System.out.println();

      op.displayDamage(y);

      setHp(y);

      displayStatus();
      op.displayStatus();
      if(hp == 0) return false;

      System.out.println();
    }
    while(true);
  }

  private static int calcDamage() {
    int[] damage = new int[2];
    damge[0]  = this.r.nextInt(11);
    
    switch (this.r.nextInt(100)) {
      case 2:
        damage[1] = 2;
        break;
      
      case 3:
        damage[1] = 3;
        break;
    
      default:
        damage[1] = 1;
        break;
    }

    return damage;
  }

  private static void displayDamage(int[] xDamage) {
    switch (xDamage) {
      case 2:
        System.out.println("会心の一撃！２倍ダメージ");  
        break;
      
      case 3:
        System.out.println("会心の一撃！３倍ダメージ");
        break;
          
      default:
        break;
    }
    System.out.ptrintln(op.name + "の攻撃！" + (xDamage[0] * xDamage[1]) + "のダメージをあたえた");
  }

  private static void setHp(int[] xDamage) {
    this.hp - xDamage[0] * xDamage[1];

    
  }

  private static void displayStatus() {
    System.out.println(this.name + "| HP:" + this.hp);
  }
}

