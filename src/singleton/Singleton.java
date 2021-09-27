package singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private static int counter = 0;

    private Singleton(){
        System.out.println("Singleton object is created!");
    }

    public static Singleton getSingleton(){
        System.out.println(++counter);
        return singleton;
    }

}
