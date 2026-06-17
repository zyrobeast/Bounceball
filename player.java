//AUTHOR:ABHISEK SINGH
//GAME NAME:BOUNCE BALL
//PLEASE DO NOT CHANGE THE CODE

import java.awt.*;

class player {
    public int x, y, a;
    boolean k, m;

    public player(int x, int y) {
        this.x = x;
        this.y = y;
        this.a = 0;
    }

    public void draw(Graphics g) {
        if (
                a == 0) {
            g.setColor(Color.red);
            g.fillOval(150, y, 50, 50);
        } else if ((a >= 1) && (k == true)) {
            g.setColor(Color.red);
            g.fillOval(150, y + 15, 50, 35);
            a--;
        } else if ((a >= 1) && (m == true)) {
            g.setColor(Color.red);
            g.fillOval(150, y + 8, 50, 42);
            a--;
        }
    }

    public void change(int l) {
        if (l > 19) {
            k = true;
            m = false;
        } else if (l > 0) {
            k = false;
            m = true;
        } else {
            k = false;
            m = false;
        }
    }
}