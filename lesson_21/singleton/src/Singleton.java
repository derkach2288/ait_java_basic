public class Singleton {
    public final static String MESSAGE = "dddddd";
    private static Singleton INSTANCE=null;

    public int temp;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if(INSTANCE==null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void print(){
        System.out.println(temp);
    }
}
