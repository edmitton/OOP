public interface Equation {
    int x = 2;

    default public int add(int y){
        return x+y;
    }
    default public int multiple(int y){
        return x*y;
    }
    public abstract void display();
}
