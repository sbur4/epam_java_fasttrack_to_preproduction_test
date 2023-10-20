public class App24 {

    public static void main(String[] args) {
        int a = 9;
        boolean div = false;
        while (!div) {
            System.out.println(a);
            if (a % 7 == 0)
                div = true;
            --a;
        }
    }
}

// Answer 987 /-/ 987/+/ -> +