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
 }
