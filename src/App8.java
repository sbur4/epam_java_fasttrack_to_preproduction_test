public class App8 {
    public static void main(String[] args) {
        int num = 9;
        boolean divisible7 = false;
        while (!divisible7) {
            System.out.println(num);
            if (num % 7 == 0)
                divisible7 = true;
            --num;
        }
    }
}

// Answer - 987 /-/ 987 /+/ -> +