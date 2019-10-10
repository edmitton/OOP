public class Ken {
  private int code;
  private String kencho;

  private Ken(){}

  public Ken(int code_value, String kencho_value){
    this.code = code_value;
    this.kencho = kencho_value;
  }

  public int getCode() {
    return this.code;
  }

  public String getKencho() {
    return this.kencho;
  }
}
