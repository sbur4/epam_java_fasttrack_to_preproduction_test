//class Plant {
//    public void smell() {
//        System.out.println("Smells");
//    }
//}
//
//class Rose extends Plant {
//    public void prick() {
//        System.out.println("Prickles");
//    }
//}
//
//public class App9 extends Plant {
//    public void cure() {
//        System.out.println("Cures");
//    }
//
//    public static void main(String[] args) throws Exception {
//        Plant[] plant = { new App9(), new Rose() };
//        for (Plant p : plant) {
//            if (p instanceof Rose) {
//                ((App9) p).prick();
//                p.smell();
//            }
//
//        }
//    }
//}
//
//// Answer - Prickles Smells /-/ Compilation error /+/ -> +