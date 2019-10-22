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
    super.hp += 35;
    this.mp -= 6;
    
    return spell + "を唱えてHPが35回復した";
  }

  @Override
  public String toString() {
    
  }
 }
