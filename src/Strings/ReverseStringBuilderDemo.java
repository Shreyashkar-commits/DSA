//package Strings;
//
////public class ReverseStringBuilderDemo {
////    public static void main(String[] args) {
////        String s = "Shreyashkar";
////        java.lang.StringBuilder sb =
////                new java.lang.StringBuilder(s);
////     sb.reverse();
////        int i = 0;
////        int j = sb.length() - 1;
////        while (i < j) {
////            char temp1 = sb.charAt(i);
////            char temp2 = sb.charAt(j);
////            sb.setCharAt(i, temp2);
////            sb.setCharAt(j, temp1);
////            i++;
////            j--;
////        }
////        sb.deleteCharAt(1);// costly process this deletion O(n)
////        sb.insert(1,'e');
////        sb.delete(3,6); // 3 to 5 ko delete
////        System.out.println(sb);
//        package Strings;
//        public class ReverseStringBuilderDemo {
//            public static void main(String[] args) {
//                String s = "shrey";
//                java.lang.StringBuilder sb =
//                        new java.lang.StringBuilder(s);
//                sb.reverse();
//                s = sb.toString();
//                System.out.println(s);
//            }
//        }
//    }
//}