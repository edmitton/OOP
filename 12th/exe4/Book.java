public class Book {

  private String name;
  private int price;
  private String color;
  private String isbn;

  //コンストラクタ
  public Book(String name, int price, String color, String isbn) {
    this.name = name;
    this.name = price;
    this.color = color;
    this.isbn = isbn;
  }

  //getter
  public String getname() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public String getColor() {
    return color;
  }

  public String getIsbn() {
    return isbn;
  }
}
