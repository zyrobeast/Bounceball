//AUTHOR:ABHISEK SINGH
//GAME NAME:BOUNCE BALL
//PLEASE DO NOT CHANGE THE CODE

class gem {
    public int x, y, a;
    boolean alive = true;

    public gem(int x, int y) {
        this.a = x;
        this.y = y;
        this.x = x;
    }

    public void changex(int x) {
        this.x = a + x;
    }
}