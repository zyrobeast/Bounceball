//AUTHOR:ABHISEK SINGH
//GAME NAME:BOUNCE BALL
//PLEASE DO NOT CHANGE THE CODE
class lv4e {
    int x, y, y2, k;
    int b, c;
    boolean a = true;

    public lv4e(int x, int y, int y2, int k) {
        this.x = x;
        this.b = x;
        this.y = y;
        this.c = y;
        this.y2 = y2;
        this.k = k;
    }

    public void change() {
        if ((a == true) && (this.y < this.y2))
            this.y += k;
        if (y == y2)
            ini();
    }

    public void ini() {
        y = c;
        x = b;
    }
}