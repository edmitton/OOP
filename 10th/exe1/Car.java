public class Car{
    private int tire;
    private String name;

   public Car(){
        this.tire=4;
        this.name = "トラック"; 
    }
    public Car(String name){
        this.tire=4;
        this.name = name; 
    }
    public int getTire(){
        return tire;
    }
    public String getName(){
        return name;
    }
}
