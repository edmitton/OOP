class Practice02 {
  public static void main(String[] args) {
    Human h = new Human("生産 太郎", 50);
    Wizard w = new Wizard("日本 花子", 95, 170, "ナオール");

    System.out.println("名前：" + h.getName() + ", HP：" + h.getHp());
    System.out.println("名前：" + w.getName() + ", HP：" + w.getHp() + ", MP：" + w.getMp() + ", 魔法：" + w.getSpell());
  }
}
