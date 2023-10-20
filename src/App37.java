class Base {
    public String name = "Base";
    public String getName() {
        return name;
    }
}

public class App37 extends Base {
    public String name = "Sub";

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        App37 s = new App37();
        Base b = s;
        System.out.println(s.name + b.name);
    }
}

// /-/ SubBase /+/ -> +