//AUTHOR:ABHISEK SINGH
//GAME NAME:BOUNCE BALL
//PLEASE DO NOT CHANGE THE CODE
class lv3t {
    int x, y, y2, k;
    int b, c;
    boolean a = false;

    public lv3t(int x, int y, int y2, int k) {
        this.x = x;
        this.b = x;
        this.y = y;
        this.c = y;
        this.y2 = y2;
        this.k = k;
    }

    public void change(int x) {
        if (x + 50 == this.x)
            a = true;
        if ((a == true) && (this.y < this.y2))
            this.y += k;
    }

    public void ini() {
        y = c;
        x = b;
        a = false;
    }
}