package singleton;

public class LazyLoadingSingleton {

    private static LazyLoadingSingleton singleton;

    private static int counter = 0;

    private LazyLoadingSingleton(){
        System.out.println("Singleton object is created!");
    }

    public static LazyLoadingSingleton getSingleton(){

        if (singleton == null){ // Double checked locking for preventing performance loss caused by synchronized method
            synchronized (LazyLoadingSingleton.class){ // Synchronizing for multi-threaded environments
                if (singleton == null){ // Control for lazy-loading
                    singleton = new LazyLoadingSingleton();
                }
            }
        }

        System.out.println(++counter);
        return singleton;
    }
}
