public class Orange extends Fruits {
    private String tangy;

    public Orange(String tangy){
        this.tangy = tangy;        
    }
    
    public String getTangy(){
        return tangy;
    }
    
    @Override
    public void display(){
        System.out.println("原料は酸味の"+tangy+"オレンジです。");
    }
}
