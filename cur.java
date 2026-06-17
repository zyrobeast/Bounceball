//AUTHOR:ABHISEK SINGH
//GAME NAME:BOUNCE BALL
//PLEASE DO NOT CHANGE THE CODE
public class cur {
    static int a = 0;
    static boolean b;

    public static void and() {
        if (a == 0) {
            b = true;
        } else if (a == 20) {
            b = false;
            a = 25;
        }
        if (a > 20)
            a--;
        if (b == true)
            a++;
        else if (b == false)
            a--;
    }
}