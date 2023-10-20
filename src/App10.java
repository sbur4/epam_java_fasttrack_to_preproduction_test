import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class App10 {
    public static void main(String[] args) throws Exception {
        HashMap props = new HashMap();
        props.put("key45", "some value");
        props.put("key12", "some other value");
        props.put("key39", "some another value");
        Set s = props.keySet();

        // Collection.sort(s); -
        s = new TreeSet(s);
        System.out.println(s);
        // s = new SortedSet(s); -
        // [key12, key39, key45]
    }
}

// Answer - s = new SortedSet(s); /-/ s = new TreeSet(s); /+/ -> -