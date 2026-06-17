//AUTHOR:ABHISEK SINGH
//GAME NAME:BOUNCE BALL
//PLEASE DO NOT CHANGE THE CODE
public class chek {
    public static int check(String a) {
        int pas4 = 0;
        for (int i = 0; i <= a.length() - 1; i++) {
            pas4 += (int) a.charAt(i);
        }
        return pas4;
    }
}
