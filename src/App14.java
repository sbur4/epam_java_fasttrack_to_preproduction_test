public class App14 {
    public static void m(Object o) {
        System.out.println("Obj");
    }

    public static void m(Number n) {
        System.out.println("num");
    }

    public static void m(Integer o) {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        Number n = new Integer("10");
        m(n);
    }
}

// Answer - num /-/ CE /+/ -> -