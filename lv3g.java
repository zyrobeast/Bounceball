//AUTHOR:ABHISEK SINGH
//GAME NAME:BOUNCE BALL
//PLEASE DO NOT CHANGE THE CODE
class lv3g {
    static int x = 600;
    static boolean a, b;

    public static void change() {
        if (x == 600) {
            b = false;
            a = true;
        } else if (x == 1300) {
            b = true;
            a = false;
        }
        if (a == true)
            x += 5;
        else if (b == true)
            x -= 5;
    }
}