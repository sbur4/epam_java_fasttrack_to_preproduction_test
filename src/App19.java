import java.util.TreeSet;

public class App19 {
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<>();
        TreeSet<String> subs = new TreeSet<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("e");
        subs = (TreeSet) s.subSet("b", true, "d", true);
        s.add("g");
        s.pollFirst();
        s.pollFirst();
        s.add("g");
        System.out.println(s.size() + " " + subs.size());
    }
}

// Answer - 4 7 /-/ 4 2 /+/ -> +