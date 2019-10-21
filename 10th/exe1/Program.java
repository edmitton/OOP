public class Program{
    public static void main(String[] args){

        Track a  = new Track(500);
        String name_a = a.getName();
        int tire_a = a.getTire();
        int load_a = a.getLoad();

        Wagon b = new Wagon("ワゴン", 8);
        String name_b = b.getName();
        int tire_b = b.getTire();
        int num_b=b.getNum();        

        System.out.println("車a：" + name_a + "、タイヤ"+tire_a+"個、積載量"+ load_a +"Kg");
        System.out.println("車b：" + name_b + "、タイヤ"+tire_b+"個、"+ num_b +"人乗り");
    }
}
