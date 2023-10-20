//
//interface Rideable {
//    String ride();
//}
//class Horse implements Readable {
//    String ride() {
//        return "cantering";
//    }
//}
//
//class Icelandic extends Horse {
//    String ride() {
//        return "tolting";
//    }
//}
//
//public class App1 {
//    public static void main(String[] args) throws Exception {
//        Readable r1 = new Icelandic();
//        Readable r2 = new Horse();
//        Horse h1 = new Icelandic();
//        System.out.println(r1.ride() + r2.ride + h1.ride());
//    }
//}
//
//// Answer - tolting cantering tolting /-/ Runtime error /+/ -> -