public class Practice00{
    public static void main(String[] args){
        Fruits[] juice = new Fruits[2];

        juice[0]=new Orange("強い");
        juice[1]=new Apple("青森","赤");
        for (int i=0; i<2; i++){
            juice[i].display();
        }
        String sanmi = ((Orange)juice[0]).getTangy();
        System.out.println("オレンジの酸味は"+sanmi);
    }
}
