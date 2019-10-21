public class Shopping{
    public static void main(String args[]){

        Supermarket apple = new Supermarket(200, Integer.parseInt(args[0]));
        System.out.println("リンゴ: "+apple.getPrice()+"円, "+apple.getNum()+"個");

        Supermarket sarmon = new Supermarket(500, Integer.parseInt(args[1]));
        System.out.println("サケ: "+sarmon.getPrice()+"円, "+sarmon.getNum()+"匹");
        
        Supermarket milk = new Supermarket(100, Integer.parseInt(args[2]));
        System.out.println("牛乳: "+milk.getPrice()+"円, "+milk.getNum()+"本");

        System.out.println("合計金額: "+Supermarket.getSum()+"円");

    }
}
