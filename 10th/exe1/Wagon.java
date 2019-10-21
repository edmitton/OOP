public class Wagon extends Car {
  private int people;

  public Wagon(String name, int people) {
    super(name);
    this.people = people;
  }

  public int getNum() {
    return people;
  }
}
