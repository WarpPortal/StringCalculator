package Main;

class SupportChecker {

    static String[] sArr;
    public static String mathProverka(String str) throws Exception {
        if (str.contains(" + ") || str.contains(" - ") || str.contains(" * ") || str.contains(" / ")) {
            return str;
        } else {
            throw new Exception("Недопустимое математическое действие");
        }
    }


    public static String longProberka(String str) throws Exception {
        String str1 = str;
        str1 = str1.replace(" + ", " ");
        str1 = str1.replace(" - ", " ");
        str1 = str1.replace(" * ", " ");
        str1 = str1.replace(" / ", " ");
        str1 = str1.replace("\"", "");

        sArr = str1.split(" ");

        if (sArr[0].length() > 10 || sArr[1].length() > 10) {
            throw new Exception("Количество символов в одно строке не должно быть больше 10");
        } else {
            return str;
        }
    }


    public static String stringProverka(String str) throws Exception {
        if (str.contains(" + ")) {
            str = str.replace(" + ", " ");
            sArr = str.split(" ");
            if (sArr[0].contains("\"") && sArr[1].contains("\"")) {
                return str;
            } else {
                throw new Exception("Складывать можно только строки");
            }
        }


        if (str.contains(" - ")) {
            str = str.replace(" - ", " ");
            sArr = str.split(" ");
            if (sArr[0].contains("\"") && sArr[1].contains("\"")) {
                return str;
            } else {
                throw new Exception("Вычитать можно только строки");
            }
        }


        if (str.contains(" * ")) {
            str = str.replace(" * ", " ");
            sArr = str.split(" ");
            if (sArr[0].contains("\"")) {
            } else {
                throw new Exception("Первый множитель должен быть строкой");
            }
            if (sArr[1].contains("\"")) {
                throw new Exception("Второй множитель должен быть числом");
            } else {
            }
            int diapazonChisel = Integer.parseInt(sArr[1]);
            if (diapazonChisel >= 1 && diapazonChisel <= 10) {
                return str;
            } else {
                throw new Exception("Можно умножать только на числа от 1 до 10");
            }
        }


        if (str.contains(" / ")) {
            str = str.replace(" / ", " ");
            sArr = str.split(" ");
            if (sArr[0].contains("\"")) {
            } else {
                throw new Exception("Делимое должно быть строкой");
            }
            if (sArr[1].contains("\"")) {
                throw new Exception("Делитель должен быть числом");
            } else {
            }
            int diapazonChisel = Integer.parseInt(sArr[1]);
            if (diapazonChisel >= 1 && diapazonChisel <= 10) {
                return str;
            } else {
                throw new Exception("Можно делить только на числа от 1 до 10");
            }
        }


        else {
            return str;
        }
    }
}
