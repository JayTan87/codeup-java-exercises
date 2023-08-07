public class MethodPractice {
    //        public static String returnName() {
//        String name = "Jeremy";
//            return name;
//        }
//        public static String returnLongerString(String a, String b) {
//            String longString;
//            if(a.length() > b.length()){
//                longString = a;
//            }
//            else {
//                longString = b;
//            }
//            return longString;
//        }
//
//        public static boolean canBeHalved(int num) {
//            if(num % 2 == 0) {
//                return true;
//            }
//            else
//                return false;
//        }
//
//        public static String sayName(String name1) {
//            return "Hello " + name1;
//        }
//        public static String sayName(String name1, String name2) {
//            return "Hello " + name1 + " " + name2;
//        }
//
//    public static void main(String[] args) {
////        System.out.println(returnName());
////        System.out.println(returnLongerString("ShortWord", "LongWord"));
////        System.out.println(canBeHalved(3));
//        System.out.println(sayName("Jeremy", "Tanner"));
//    }
    class ArithmeticSample {
        public static void main(String[] args) {
            int x = 5 * 4 % 3;
            System.out.println(x);
        }
    }
}
