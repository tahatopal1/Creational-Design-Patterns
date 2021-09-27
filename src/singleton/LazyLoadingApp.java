package singleton;

public class LazyLoadingApp {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            LazyLoadingSingleton singleton = LazyLoadingSingleton.getSingleton();
        }
    }
}
