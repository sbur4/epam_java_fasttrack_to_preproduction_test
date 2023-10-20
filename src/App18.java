import java.util.Arrays;
import java.util.List;

public class App18 {
    public static void main(String[] args) {
        String hello = "hello";
        String world = "world";
        StringBuffer helloworld = new StringBuffer(hello + world);
        List<String> list = Arrays.asList(hello, world, helloworld.toString());
        helloworld.append("!");
        list.remove(0);
        System.out.println(list);
    }
}

// Answer - hello, world, helloworld /-/ RE /+/ -> +