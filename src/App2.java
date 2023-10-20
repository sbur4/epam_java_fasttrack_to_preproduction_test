public class App2 {
    public static void main(String[] args) throws Exception {
        String line1 = "123";
        String line2 = new String("123");
        System.out.println(line1 == "123");
        System.out.println(line1 == line2);
    }
}

// Answer - true true /-/ true false /+/ -> +