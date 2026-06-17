//AUTHOR:ABHISEK SINGH
//GAME NAME:BOUNCE BALL
//PLEASE DO NOT CHANGE THE CODE
class lv5b {
    int x, y, c, k = 0;
    boolean a, l;

    public lv5b(int x, int y) {
        this.x = x;
        this.y = y;
        this.c = y;
    }

    public void change(int a, int b) {
        if ((a + 45 >= x) && (a <= x + 145) && (b == y - 50))
            this.l = true;
        if ((l == true) && (k == 25))
            this.a = true;
        else if ((l == true) && (k < 25))
            k++;
        if (this.a == true)
            this.y += 10;
    }

    public void ini() {
        a = false;
        y = c;
        k = 0;
        l = false;
    }

    public boolean check(int a, int b) {
        boolean m = false;
        if ((a + 45 >= x) && (a <= x + 145) && (b == y - 50))
            m = true;
        return m;
    }
}