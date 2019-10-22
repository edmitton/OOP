 public class Wizard extends Human {
  private int mp;
  private String spell;

  public Wizard(String name, int hp, int mp, String spell){
    super(name, hp);
    this.mp = mp;
    this.spell = spell;
  }

  public int getMp() {
    return mp;
  }

  public String getSpell() {
    return spell;
  }

  @Override
  public String action() {
    java.util.Random r = new java.util.Random();
    int value =  r.nextInt(35) + 25;
    super.hp += value;
    this.mp -= 6;
    
    return spell + "を唱えてHPが" + value + "回復した";
  }

  @Override
  public String toString() {
    return ("名前：" + getName() + ", HP：" + getHp() + ", MP：" + getMp() + ", 魔法：" + getSpell());
  }
 }
