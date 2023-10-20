class Monster {
}

class Dragon extends Monster {
    public void say() {
        System.out.println("Dragon");
    }

}

class Orc extends Monster {
    public void say() {
        System.out.println("Orc");
    }

}

public class App12 {

    public static void main(String[] args) throws Exception {
        Monster monster1 = new Dragon();
        Monster monster2 = new Orc();
        ((Orc) monster1).say();
        ((Dragon) monster2).say();
    }
}

// Answer - Dragon Orc /-/ RE /+/ -> +