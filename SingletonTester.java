public class SingletonTester {
    public static void main(String[] args) {
        EagerSingleton eagerinstance1 = EagerSingleton.getInstance();
        EagerSingleton eagerinstance2 = EagerSingleton.getInstance();
        System.out.println("Instance 1 of EagerSingleton hash:" + eagerinstance1.hashCode());
        System.out.println("Instance 2 of EagerSingleton hash:" + eagerinstance2.hashCode());  

        LazySingleton lazyinstance1 = LazySingleton.getInstance();
        LazySingleton lazyinstance2 = LazySingleton.getInstance();
        System.out.println("Instance 1 of LazySingleton hash:" + lazyinstance1.hashCode());
        System.out.println("Instance 2 of LazySingleton hash:" + lazyinstance2.hashCode()); 

        ThreadsafeSingleton threadsafeinstance1 = ThreadsafeSingleton.getInstance();
        ThreadsafeSingleton threadsafeinstance2 = ThreadsafeSingleton.getInstance();
        System.out.println("Instance 1 of ThreadsafeSingleton hash:" + threadsafeinstance1.hashCode());
        System.out.println("Instance 2 of ThreadsafeSingleton hash:" + threadsafeinstance2.hashCode()); 
    }
 }