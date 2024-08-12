package Main;

public class MathOperators {
    static String[] sArr;

    public static void add(String str) {

        if (str.contains(" + ")) {
            sArr = str.split(" \\+ ");
            System.out.println(kavichki(sArr[0] + sArr[1]));
        }
    }


    public static void sub(String str) {
        if (str.contains(" - ")) {
            sArr = str.split(" - ");
            int a = sArr[0].indexOf(sArr[1]);
            if (a == -1) {

            } else {
                String result = sArr[0].substring(0, a);
                result += sArr[0].substring(a + sArr[1].length());
                System.out.println(kavichki(result));
            }
        }
    }


    public static void mult(String str) {
        if (str.contains(" * ")) {
            str = str.replace(" * ", " ");
            sArr = str.split(" ");

            int a = Integer.parseInt(sArr[1]);
            String s = "";
            char[] c;

            for (int i = 0; i < a; i++) {
                s += sArr[0];
            }

            if (s.length() > 40) {
                String s1 = "";
                c = s.toCharArray();
                for (int i = 0; i < 40; i++) {
                    s1 += c[i];
                }
                s1 = s1 + "...";
                System.out.println(kavichki(s1));
            } else {
                System.out.println(kavichki(s));
            }
        }
    }


    public static void div(String str) {
        if (str.contains(" / ")) {
            str = str.replace(" / ", " ");
            sArr = str.split(" ");

            int a = sArr[0].length();
            int b = Integer.parseInt(sArr[1]);
            int sum = a / b;
            String s = "";
            char[] c = str.toCharArray();

            for (int i = 0; i < sum; i++) {
                s += c[i];
            }
            System.out.println(kavichki(s));
        }

    }


    public static String kavichki(String str) {
        return "\"" + str + "\"";
    }
}