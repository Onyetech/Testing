import java.io.IOException;

public class MultithreadingMain {
    public static void main(String[] args) throws IOException {
        MultithreadingClient multithreadingClient = new MultithreadingClient(6060);
        new Thread(MultithreadingClient).start();
    }
}
