package singleton;

public class Singleton {
    
    private static Singleton instance;

    //The constructor must be private to prevent instatiation from other classes
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton instance is working");
    }
}

public class main {

    public static void main(String[] args) {
        
    }
}
