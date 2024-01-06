
public class App {
    public static void main(String[] args) throws Exception {
        MultithreadDemo mn  = new MultithreadDemo("Thread1");
        MultithreadDemo mn2 = new MultithreadDemo("Thread2");

        mn.start();
        mn2.start();
    
    }
}
