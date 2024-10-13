package love.seeyoufxp.recursion;

public class ReversePrintString {
    public static void main(String[] args) {
        String str = "Hello World";
//        reversePrint(str.length(), str);
        reversePrint(0, str);
    }

//    public static void reversePrint(int n, String str) {
//        System.out.print(str.charAt(n - 1));
//        if (n == 1) {
//            return;
//        }
//        reversePrint(--n, str);
//    }

    public static void reversePrint(int n, String str) {
        if (n == str.length()) {
            return;
        }
        reversePrint(n + 1, str);
        System.out.println(str.charAt(n));
    }
}
