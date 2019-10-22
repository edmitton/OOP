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
    this.hp += 20;

    return "食事をしてHPを20回復した";
  }
}
