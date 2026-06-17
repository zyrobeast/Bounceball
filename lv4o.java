//AUTHOR:ABHISEK SINGH
//GAME NAME:BOUNCE BALL
//PLEASE DO NOT CHANGE THE CODE
public class lv4o {
    static public boolean a1, a2, a3, a4;
    static int a;

    public static void change(int b) {
        if (b == 1)
            a1 = true;
        else if (b == 2)
            a2 = true;
        else if (b == 3)
            a3 = true;
        else if (b == 4)
            a4 = true;
        a = b;
    }

    public static void ini() {
        a1 = false;
        a2 = false;
        a3 = false;
        a4 = false;
    }

    public static boolean check() {
        boolean aloo = false;
        if ((a1 == true) && (a2 == true) && (a3 == true) && (a4 == true))
            aloo = true;
        return aloo;
    }
}