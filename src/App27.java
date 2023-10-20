import java.util.ArrayList;

public class App27 {

    public static void main(String[] args) {
        ArrayList<String> sea = new ArrayList<>();
        sea.add(1, "Sp");
        sea.add(2, "Ep");
        sea.add(3, "Ap");
        sea.add(4, "Tp");
        sea.remove(2);
        for (String s : sea)
            System.out.println(s + ", ");
    }
}

// - /-/ RE /+/ -> +