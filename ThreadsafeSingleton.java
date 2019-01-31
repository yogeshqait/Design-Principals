public class ThreadsafeSingleton {

    private static ThreadsafeSingleton instance;

    private ThreadsafeSingleton(){
        
    }

    public static synchronized ThreadsafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadsafeSingleton();
        }
        return instance;
    }
}