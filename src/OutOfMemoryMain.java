import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class OutOfMemoryMain {
    public static void main(String args[]) throws Exception
    {
        Map<Integer,String> m = new HashMap<>();
        Random r = new Random();

        while (true) {
            m.put(r.nextInt(), "randomValue");
        }
    }
}
