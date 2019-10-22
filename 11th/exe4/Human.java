public class Human {
  private String name;
  protected int hp;

  public Human(String name, int hp) {
    this.name = name;
    this.hp   = hp;
  }

  public String getName() {
    return name;
  }

  public int getHp() {
    return hp;
  }

  public String action() {
    java.util.Random r = new java.util.Random();
    int value =  r.nextInt(40) + 5;
    this.hp += value;

    return "食事をしてHPを" + value + "回復した";
  }

  @Override
  public String toString() {
    return ("名前：" + getName() + ", HP：" + getHp());
  }
}
