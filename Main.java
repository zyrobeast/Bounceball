import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;

public class Main extends Canvas implements Runnable, MouseListener, KeyListener {
    public int score = 0;
    Thread th;
    int in;
    boolean a = false, loaded;
    Font f = new Font("Sans Serif", Font.BOLD, 20);
    Image i, j, k, l, m, n, o, r, heart, s, q, pass, gem, lv4, kl, hart, gam, k2, ead;
    int pas = 0;
    boolean lv4d1, lv4d2, lv4d3, lv4d4;
    String pas2 = " ";
    boolean w1, w2, w3, w4, w5;
    boolean g1, g2, g3, g4, g5;
    AudioClip audio, gameover, losthealth, click, gotitem;
    player p = new player(0, 0);
    gem gem1 = new gem(320, 460);
    gem gem2 = new gem(460, 400);
    gem gem3 = new gem(760, 320);
    gem gem4 = new gem(1600, 260);
    gem gem5 = new gem(2250, 540);
    lv3t th1 = new lv3t(2650, -30, 400, 10);
    lv3t th2 = new lv3t(2700, -30, 400, 10);
    lv3t th3 = new lv3t(2750, -30, 400, 10);
    lv3t th4 = new lv3t(2800, -30, 400, 10);
    lv3t th5 = new lv3t(2850, -30, 400, 10);
    lv3e th6 = new lv3e(250, 0, 510, 10);
    lv3t th7 = new lv3t(3100, -30, 400, 10);
    lv3t th8 = new lv3t(3150, -30, 400, 10);
    lv3t th9 = new lv3t(3200, -30, 400, 10);
    lv3t th10 = new lv3t(3250, -30, 400, 10);
    lv3t th11 = new lv3t(3300, -30, 400, 10);
    lv3e th12 = new lv3e(450, -30, 510, 10);
    lv3t th13 = new lv3t(3550, -30, 400, 10);
    lv3t th14 = new lv3t(3600, -30, 400, 10);
    lv3t th15 = new lv3t(3650, -30, 400, 10);
    lv3t th16 = new lv3t(3700, -30, 400, 10);
    lv3t th17 = new lv3t(3750, -30, 400, 10);
    lv3e th18 = new lv3e(1600, -30, 510, 10);
    lv3t th19 = new lv3t(4000, -30, 400, 10);
    lv3t th20 = new lv3t(4050, -30, 400, 10);
    lv3t th21 = new lv3t(4100, -30, 400, 10);
    lv3t th22 = new lv3t(4150, -30, 400, 10);
    lv3t th23 = new lv3t(4200, -30, 400, 10);
    lv3e th24 = new lv3e(1750, 0, 510, 10);
    lv3e th25 = new lv3e(1900, -30, 510, 10);
    lv4e th26 = new lv4e(300, 0, 510, 10);
    lv4e th27 = new lv4e(350, -30, 510, 10);
    lv4e th28 = new lv4e(1100, 0, 510, 10);
    lv4e th29 = new lv4e(1150, -30, 510, 10);
    lv4e th30 = new lv4e(1900, 0, 510, 10);
    lv4e th31 = new lv4e(1950, -30, 510, 10);
    lv4e th32 = new lv4e(2700, 0, 510, 10);
    lv4e th33 = new lv4e(2750, -30, 510, 10);
    lv5b b1 = new lv5b(400, 550);
    lv5b b2 = new lv5b(600, 450);
    lv5b b3 = new lv5b(800, 350);
    lv5b b4 = new lv5b(1000, 250);
    lv5b b5 = new lv5b(1200, 150);
    lv5b b6 = new lv5b(1400, 150);
    lv5b b7 = new lv5b(1600, 250);
    lv5b b8 = new lv5b(1800, 350);
    lv5b b9 = new lv5b(2000, 450);
    lv5b b10 = new lv5b(2200, 550);
    lv5b b11 = new lv5b(2600, 450);
    lv5b b12 = new lv5b(2800, 350);
    lv5b b13 = new lv5b(3000, 250);
    lv5b b14 = new lv5b(3200, 150);
    lv5e th34 = new lv5e(3775, 0, 1500, 10);
    lv5e th35 = new lv5e(3975, 0, 1500, 10);
    lv5e th36 = new lv5e(4175, 0, 1500, 10);
    lv5e th37 = new lv5e(4375, 0, 1500, 10);
    lv5e th38 = new lv5e(4575, 0, 1500, 10);
    boolean ground, falling, right, left, up;
    boolean lv2d, lv2g, lv2o;
    int savex, savey;
    int gemx, gemy;
    int health;
    int up3;
    boolean lv5vi;
    boolean credits;
    JFrame frame;
    private Image i2;
    private int x, up2;
    private Graphics db;
    private boolean p1, p2, p3, p4, p5;
    private boolean q1, q2, q3, q4, q5, check, w;

    public static void main(String[] args) {
        new Main().start();
    }

    public void loadpic() {
        i = new ImageIcon("images//lvl1//block1.png").getImage();
        j = new ImageIcon("images//lvl1//block2.png").getImage();
        k = new ImageIcon("images//lvl1//block3.png").getImage();
        l = new ImageIcon("images//lvl1//end.png").getImage();
        ;
        s = new ImageIcon("images//start//start.png").getImage();
        ;
        m = new ImageIcon("images//lvl1//tu.png").getImage();
        ;
        n = new ImageIcon("images//lvl1//td.png").getImage();
        ;
        o = new ImageIcon("images//clouds//cloud2.png").getImage();
        ;
        kl = new ImageIcon("images//clouds//cloud1.png").getImage();
        ;
        lv4 = new ImageIcon("images///lvl2//block5.png").getImage();
        ;
        r = new ImageIcon("images//lvl1//grass.png").getImage();
        ;
        heart = new ImageIcon("images//lvl1//heart.png").getImage();
        ;
        gem = new ImageIcon("images//lvl1//gem.png").getImage();
        ;
        hart = new ImageIcon("images//lvl2//heart.png").getImage();
        ;
        gam = new ImageIcon("images//lvl2//gem.png").getImage();
        ;
        k2 = new ImageIcon("images//lvl3//keyu.png").getImage();
        ;
        ead = new ImageIcon("images//lvl2//end.png").getImage();
        ;
    }

    public void loadmisc() {
        URL url = Main.class.getResource("sound/jump.wav");
        audio = Applet.newAudioClip(url);
        url = Main.class.getResource("sound/select.wav");
        click = Applet.newAudioClip(url);
        url = Main.class.getResource("sound/gotitem.wav");
        gotitem = Applet.newAudioClip(url);
        url = Main.class.getResource("sound/losthealth.wav");
        losthealth = Applet.newAudioClip(url);
    }

    public void start() {
        frame = new JFrame("BALLBOUNCE");
        this.loadpic();
        try {
            FileReader file = new FileReader("images/start/readme.txt");
            BufferedReader b = new BufferedReader(file);
            String l = null;
            for (int i = 1; i < 100; i++)
                b.readLine();
            in = Integer.parseInt(b.readLine());
            b.close();
        } catch (Exception e) {
        }
        this.loadmisc();
        this.setFont(this.f);
        frame.setResizable(false);
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.setSize(900, 620);
        frame.setVisible(true);
        this.addKeyListener(this);
        this.setFocusable(true);
        this.addMouseListener(this);
        this.setFocusable(true);
        th = new Thread(this);
        th.start();
    }

    public void run() {
        while (true) {
            frame.setSize(900, 625);
            repaint();
            if (p1 == true) {
                q1 = true;
                gem1.alive = true;
                gem2.alive = true;
                gem3.alive = true;
                gem4.alive = true;
                gem5.alive = true;
                gem1.a = 320;
                gem1.y = 460;
                gem2.a = 460;
                gem2.y = 400;
                gem3.a = 1000;
                gem3.y = 280;
                gem4.a = 1600;
                gem4.y = 260;
                gem5.a = 2250;
                gem5.y = 540;
                health = 1;
                x = 0;
                p.x = 150;
                p.y = -50;
                savex = 0;
                savey = 510;
                health = 1;
                x = 0;
                p.x = 150;
                p.y = -50;
                savex = 0;
                savey = 510;
                w = false;
                while ((q1 == true) && (p1 == true)) {
                    frame.setSize(900, 625);
                    repaint();
                    if (in >= 1) {
                        q1 = false;
                        pas = 0;
                        pas2 = "";
                    }
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                    if (p1 == false)
                        break;
                }
                x = -2600;
                while ((x < 0) && (p1 == true)) {
                    frame.setSize(900, 625);
                    repaint();
                    x += 5;
                    gem1.changex(x);
                    gem2.changex(x);
                    gem3.changex(x);
                    gem4.changex(x);
                    gem5.changex(x);
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                }
                while ((g1 == false) && (p1 == true)) {
                    frame.setSize(900, 625);
                    repaint();
                    if ((p.y == 510) && (p.x + 30 >= 1500) && (p.x <= 1700)) {
                        p.y = 0;
                        p.x = 1700;
                        x = -1700 + 150;
                    }
                    if (((p.x >= -45) && (p.x + 50 <= 345) && (p.y == 510))
                            || ((p.x >= 255) && (p.x + 50 <= 445) && (p.y == 430))
                            || ((p.x >= 405) && (p.x + 50 <= 595) && (p.y == 370))
                            || ((p.x >= 555) && (p.x + 50 <= 745) && (p.y == 330))
                            || ((p.x >= 705) && (p.x + 50 <= 895) && (p.y == 290))
                            || ((p.x >= 855) && (p.x + 50 <= 1145) && (p.y == 250))
                            || ((p.x >= 1055) && (p.x + 50 <= 1445) && (p.y == 510))
                            || ((p.x >= 1555) && (p.x + 50 <= 1945) && (p.y == 230))
                            || ((p.x >= 2155) && (p.x + 50 <= 2545) && (p.y == 510))
                    ) {
                        ground = true;
                        falling = false;
                        if (up3 >= 1) {
                            p.change(up3);
                            up3 = 0;
                            p.a = 20;
                        }
                    } else {
                        ground = false;
                        falling = true;
                    }
                    if (((p.x + 50 == 300) && (p.y + 50 >= 480) && (p.y <= 520))
                            || ((p.x + 50 == 450) && (p.y + 50 >= 420) && (p.y <= 460))
                            || ((p.x + 50 == 600) && (p.y + 50 >= 380) && (p.y <= 420))
                            || ((p.x + 50 == 750) && (p.y + 50 >= 340) && (p.y <= 380))
                            || ((p.x + 50 == 900) && (p.y + 50 >= 300) && (p.y <= 600))
                    )
                        right = false;
                    if (((p.x == 400) && (p.y + 50 >= 480) && (p.y <= 520))
                            || ((p.x == 5500) && (p.y + 50 >= 420) && (p.y <= 460))
                            || ((p.x == 700) && (p.y + 50 >= 380) && (p.y <= 420))
                            || ((p.x == 850) && (p.y + 50 >= 340) && (p.y <= 380))
                            || ((p.x == 1100) && (p.y + 50 >= 300) && (p.y <= 600))
                    )
                        left = false;
                    if (right == true) {
                        p.x += 5;
                        x -= 5;
                    }
                    if (left == true) {
                        p.x -= 5;
                        x += 5;
                    }
                    if ((up == true) && (up2 > 0)) {
                        p.y -= 10;
                        up2 -= 1;
                        falling = false;
                    }
                    if (falling == true) {
                        p.y += 10;
                        up3++;
                    }
                    if (gem1.alive == true) {
                        gem1.changex(x);
                    }
                    if (gem2.alive == true) {
                        gem2.changex(x);
                    }
                    if (gem3.alive == true) {
                        gem3.changex(x);
                    }
                    if (gem4.alive == true) {
                        gem4.changex(x);
                    }
                    if (gem5.alive == true) {
                        gem5.changex(x);
                    }
                    if ((gem1.alive == true) && ((p.x + 45 == gem1.a) || (p.x + 5 == gem1.a + 20) || ((p.x + 5 <= gem1.a) && (p.x + 45 >= gem1.a + 20))) && (p.y == 430)) {
                        gotitem.play();
                        score++;
                        gem1.alive = false;
                    }
                    if ((gem2.alive == true) && ((p.x + 45 == gem2.a) || (p.x + 5 == gem2.a + 20) || ((p.x + 5 <= gem2.a) && (p.x + 45 >= gem2.a + 20))) && (p.y == 370)) {
                        gotitem.play();
                        score++;
                        gem2.alive = false;
                    }
                    if ((gem3.alive == true) && ((p.x + 45 == gem3.a) || (p.x + 5 == gem3.a + 20) || ((p.x + 5 <= gem3.a) && (p.x + 45 >= gem3.a + 20))) && (p.y == 250)) {
                        gotitem.play();
                        score++;
                        gem3.alive = false;
                    }
                    if ((gem4.alive == true) && ((p.x + 45 == gem4.a) || (p.x + 5 == gem4.a + 20) || ((p.x + 5 <= gem4.a) && (p.x + 45 >= gem4.a + 20))) && (p.y == 230)) {
                        gotitem.play();
                        score++;
                        gem4.alive = false;
                    }
                    if ((gem5.alive == true) && ((p.x + 45 == gem5.a) || (p.x + 5 == gem5.a + 20) || ((p.x + 5 <= gem5.a) && (p.x + 45 >= gem5.a + 20))) && (p.y == 510)) {
                        gotitem.play();
                        score++;
                        gem5.alive = false;
                    }
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                    if ((p.x >= 2350) && (score == 5)) {
                        w1 = true;
                        g1 = true;
                        p1 = false;
                    }
                    if (p.y == 600) {
                        health--;
                        losthealth.play();
                        long lo = 0;
                        while (lo++ <= 40l) {
                            repaint();
                            try {
                                Thread.sleep(15);
                            } catch (Exception e) {
                            }
                        }
                        if (health > 0) {
                            x = -savex;
                            p.x = savex + 150;
                            p.y = savey;
                        } else if (p.y == 600) {
                            losthealth.play();
                            p1 = false;
                            g1 = true;
                        }
                    }
                }
                while ((g1 == true) && (p1 == false)) {
                    repaint();
                    if ((w1 == true) && (in <= 1)) {
                        String a = "";
                        try {
                            FileReader file = new FileReader("images/start/readme.txt");
                            BufferedReader b = new BufferedReader(file);
                            for (int i = 1; i <= 11; i++) {
                                String l = b.readLine();
                                a += l + "\r\n";
                            }
                            for (int i = 1; i < 100 - 11; i++)
                                a += "\r\n";
                            a += 2;
                            b.close();
                        } catch (Exception e) {
                        }
                        File fnew = new File("images/start/readme.txt");
                        FileWriter f2;
                        try {
                            f2 = new FileWriter(fnew, false);
                            f2.write(a);
                            f2.close();
                        } catch (Exception e) {
                        }
                        in = 2;
                    }
                    frame.setSize(900, 625);
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                }
                p1 = false;
                check = false;
            } else if (p2 == true) {
                q2 = true;
                gem1.alive = true;
                gem2.alive = true;
                gem3.alive = true;
                gem4.alive = true;
                gem5.alive = true;
                gem1.a = 420;
                gem1.y = 380;
                gem2.a = 620;
                gem2.y = 380;
                gem3.a = 1200;
                gem3.y = 310;
                gem4.a = 250;
                gem4.y = 540;
                gem5.a = 1900;
                gem5.y = 380;
                health = 3;
                p.x = 150;
                p.y = -50;
                savex = 0;
                savey = 210;
                while ((p2 == true) && (q2 == true)) {
                    repaint();
                    frame.setSize(900, 625);
                    if ((in >= 2)) {
                        q2 = false;
                        pas = 0;
                        pas2 = "";
                    }
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                    if (p2 == false) break;
                }
                x = -1800;
                while ((x < 0) && (p2 == true)) {
                    frame.setSize(900, 620);
                    repaint();
                    x += 5;
                    gem1.changex(x);
                    gem2.changex(x);
                    gem3.changex(x);
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                }
                while ((g2 == false) && (p2 == true)) {
                    repaint();
                    frame.setSize(900, 620);
                    if ((lv2d == false) && (gem1.alive == true) && ((p.x + 45 == gem1.a) || (p.x + 5 == gem1.a + 20) || ((p.x + 5 <= gem1.a) && (p.x + 45 >= gem1.a + 20))) && (p.y == 350)) {
                        score++;
                        gotitem.play();
                        gem1.alive = false;
                    }
                    if ((lv2d == false) && (gem2.alive == true) && ((p.x + 45 == gem2.a) || (p.x + 5 == gem2.a + 20) || ((p.x + 5 <= gem2.a) && (p.x + 45 >= gem2.a + 20))) && (p.y == 350)) {
                        score++;
                        gotitem.play();
                        gem2.alive = false;
                    }
                    if ((lv2d == false) && (gem3.alive == true) && ((p.x + 45 == gem3.a) || (p.x + 5 == gem3.a + 20) || ((p.x + 5 <= gem3.a) && (p.x + 45 >= gem3.a + 20))) && (p.y == 280)) {
                        score++;
                        gotitem.play();
                        gem3.alive = false;
                    }
                    if ((lv2d == true) && (gem4.alive == true) && ((p.x + 45 == gem4.a) || (p.x + 5 == gem4.a + 20) || ((p.x + 5 <= gem4.a) && (p.x + 45 >= gem4.a + 20))) && (p.y == 510)) {
                        score++;
                        gotitem.play();
                        gem4.alive = false;
                    }
                    if ((lv2d == true) && (gem5.alive == true) && ((p.x + 45 == gem5.a) || (p.x + 5 == gem5.a + 20) || ((p.x + 5 <= gem5.a) && (p.x + 45 >= gem5.a + 20))) && (p.y == 350)) {
                        score++;
                        gotitem.play();
                        gem5.alive = false;
                    }
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                    if ((lv2d == true) && (p.x >= 1700) && (p.x + 10 <= 1850) && (p.y == 20))
                        lv2o = true;
                    if ((p.x >= 2160) && (score == 5) && (p.y == 350) && (lv2o == true)) {
                        w2 = true;
                        g2 = true;
                        p2 = false;
                    }
                    if ((lv2d == false) && (right == true) && (((p.x == -50) && (p.y + 50 >= 300) && (p.y <= 600))
                            || ((p.x == 350) && (p.y + 50 >= 400) && (p.y <= 440))
                            || ((p.x == 550) && (p.y + 50 >= 400) && (p.y <= 440))
                            || ((p.x == 750) && (p.y + 50 >= 400) && (p.y <= 440))
                            || ((p.x == 950) && (p.y + 50 >= 330) && (p.y <= 530))
                            || ((p.x == 940) && (p.y + 50 >= 590) && (p.y <= 610))))
                        right = false;
                    else if ((lv2d == true) && (right == true) && (((p.x == -50) && (p.y + 50 >= 480) && (p.y <= 520))
                            || ((p.x == 350) && (p.y + 50 >= 480) && (p.y <= 520))
                            || ((p.x == 350) && (p.y + 50 >= 480) && (p.y <= 520))
                            || ((p.x == 350) && (p.y + 50 >= 480) && (p.y <= 520))
                            || ((p.x == 350) && (p.y + 50 >= 480) && (p.y <= 520))
                            || ((p.x == 350) && (p.y + 50 >= 480) && (p.y <= 520))
                            || ((p.x == 350) && (p.y + 50 >= 480) && (p.y <= 520))
                            || ((p.x == 350) && (p.y + 50 >= 480) && (p.y <= 520))))
                        right = false;
                    if ((lv2d == false) && (left == true) && (((p.x == 300) && (p.y + 50 >= 300) && (p.y <= 600))
                            || ((p.x == 500) && (p.y + 50 >= 400) && (p.y <= 440))
                            || ((p.x == 700) && (p.y + 50 >= 400) && (p.y <= 440))
                            || ((p.x == 900) && (p.y + 50 >= 400) && (p.y <= 440))
                            || ((p.x == 1400) && (p.y + 50 >= 330) && (p.y <= 530))))
                        left = false;
                    else if ((lv2d == true) && (left == true) && (((p.x == -50) && (p.y + 50 >= 480) && (p.y <= 520))
                            || ((p.x == 350) && (p.y + 50 >= 480) && (p.y <= 520))
                            || ((p.x == 350) && (p.y + 50 >= 480) && (p.y <= 520))
                            || ((p.x == 350) && (p.y + 50 >= 480) && (p.y <= 520))
                            || ((p.x == 350) && (p.y + 50 >= 480) && (p.y <= 520))
                            || ((p.x == 350) && (p.y + 50 >= 480) && (p.y <= 520))
                            || ((p.x == 350) && (p.y + 50 >= 480) && (p.y <= 520))
                            || ((p.x == 350) && (p.y + 50 >= 480) && (p.y <= 520))))
                        left = false;
                    if ((lv2d == false) && (((p.x >= -45) && (p.x + 50 <= 345) && (p.y == 210))
                            || ((p.x >= 355) && (p.x + 50 <= 545) && (p.y == 350))
                            || ((p.x >= 555) && (p.x + 50 <= 745) && (p.y == 350))
                            || ((p.x >= 755) && (p.x + 50 <= 945) && (p.y == 350))
                            || ((p.x >= 955) && (p.x + 50 <= 1445) && (p.y == 280))
                            || ((p.x >= 945) && (p.x + 50 <= 1285) && (p.y == 540)))) {
                        ground = true;
                        falling = false;
                        if (up3 >= 1) {
                            p.change(up3);
                            up3 = 0;
                            p.a = 20;
                        }
                    } else if ((lv2d != false) && (((p.x >= -45) && (p.x + 50 <= 345) && (p.y == 510))
                            || ((p.x >= 1755) && (p.x + 50 <= 2450) && (p.y == 350)))) {
                        ground = true;
                        falling = false;
                        if (up3 >= 1) {
                            p.change(up3);
                            up3 = 0;
                            p.a = 20;
                        }
                    } else {
                        ground = false;
                        falling = true;
                    }
                    if ((lv2d == true) && (p.y >= 0) && (((p.x + 20 >= 400) && (p.x <= 500))
                            || ((p.x + 20 >= 700) && (p.x <= 800))
                            || ((p.x + 20 >= 1000) && (p.x <= 1100))
                            || ((p.x + 20 >= 1300) && (p.x <= 1400))
                            || ((p.x + 20 >= 1600) && (p.x <= 1720))))
                        p.y -= 20;
                    if (right == true) {
                        p.x += 5;
                        x -= 5;
                    }
                    if (left == true) {
                        p.x -= 5;
                        x += 5;
                    }
                    if ((lv2d == false) && (up == true) && (p.x >= 955) && (p.x + 50 <= 1285) && (p.y == 530))
                        up = false;
                    if ((lv2d == false) && (p.x >= 1090) && (p.x <= 1200) && (p.y == 540)) {
                        lv2d = true;
                        x = 0;
                        p.x = 150;
                        p.y = 0;
                    }
                    if ((up == true) && (up2 >= 1)) {
                        p.y -= 10;
                        up2 -= 1;
                        falling = false;
                    }
                    if (falling == true) {
                        p.y += 10;
                        up3++;
                    }
                    if ((lv2d == true) && (((p.x >= 400) && (p.x <= 1680) && (p.y == 20)) || ((p.x >= 400) && (p.x <= 1850) && (p.y + 50 == 580)) || (p.y == 600))) {
                        health--;
                        losthealth.play();
                        long lo = 0;
                        while (lo++ <= 40l) {
                            repaint();
                            try {
                                Thread.sleep(15);
                            } catch (Exception e) {
                            }
                        }
                        if (health > 0) {
                            p.x = savex + 150;
                            p.y = savey;
                            x = -savex;
                        } else if (lv2d == true) {
                            p2 = false;
                            g2 = true;
                        }
                    }
                    if ((lv2d == false) && (p.y == 600)) {
                        health--;
                        losthealth.play();
                        long lo = 0;
                        while (lo++ <= 40l) {
                            repaint();
                            try {
                                Thread.sleep(15);
                            } catch (Exception e) {
                            }
                        }
                        if (health > 0) {
                            p.x = savex + 150;
                            p.y = savey;
                            x = -savex;
                        } else {
                            losthealth.play();
                            p2 = false;
                            g2 = true;
                        }
                    }
                    if ((p.x == 1700)) {
                        savex = 100;
                        savey = 230;
                    }
                    if ((lv2d == false) && (gem1.alive == true)) {
                        gem1.changex(x);
                    }
                    if ((lv2d == false) && (gem2.alive == true)) {
                        gem2.changex(x);
                    }
                    if ((lv2d == false) && (gem3.alive == true)) {
                        gem3.changex(x);
                    }
                    if ((lv2d == true) && (gem4.alive == true)) {
                        gem4.changex(x);
                    }
                    if ((lv2d == true) && (gem5.alive == true)) {
                        gem5.changex(x);
                    }
                }
                while ((g2 == true) && (p2 == false)) {
                    repaint();
                    frame.setSize(900, 620);
                    if ((w2 == true) && (in <= 2)) {
                        String a = "";
                        try {
                            FileReader file = new FileReader("images/start/readme.txt");
                            BufferedReader b = new BufferedReader(file);
                            for (int i = 1; i <= 11; i++) {
                                String l = b.readLine();
                                a += l + "\r\n";
                            }
                            for (int i = 1; i < 100 - 11; i++)
                                a += "\r\n";
                            a += 3;
                            b.close();
                        } catch (Exception e) {
                        }
                        File fnew = new File("images/start/readme.txt");
                        FileWriter f2;
                        try {
                            f2 = new FileWriter(fnew, false);
                            f2.write(a);
                            f2.close();
                        } catch (Exception e) {
                        }
                        in = 3;
                    }
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                }
                p2 = false;
                check = false;
            } else if (p3 == true) {
                q3 = true;
                gem1.alive = true;
                gem2.alive = true;
                gem3.alive = true;
                gem4.alive = true;
                gem5.alive = true;
                gem1.a = 320;
                gem1.y = 540;
                gem2.a = 1700;
                gem2.y = 540;
                gem3.a = 4500;
                gem3.y = 540;
                gem4.a = 4800;
                gem4.y = 490;
                gem5.a = 4800;
                gem5.y = 280;
                health = 3;
                p.x = 150;
                p.y = -50;
                savex = 0;
                savey = 510;
                w = false;
                while ((q3 == true) && (p3 == true)) {
                    repaint();
                    frame.setSize(900, 625);
                    if ((in >= 3)) {
                        q3 = false;
                        pas = 0;
                        pas2 = "";
                    }
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                    if (p3 == false)
                        break;
                }
                x = -5050;
                while ((x < 0) && (p3 == true)) {
                    frame.setSize(900, 625);
                    repaint();
                    x += 5;
                    gem1.changex(x);
                    gem2.changex(x);
                    gem3.changex(x);
                    gem4.changex(x);
                    gem5.changex(x);
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                }
                while ((g3 == false) && (p3 == true)) {
                    repaint();
                    lv3g.change();
                    frame.setSize(900, 625);
                    if ((((th1.y + 45 >= p.y) && (th1.y <= p.y) && (th1.x + 15 <= p.x + 50) && (th1.x + 35 >= p.x))
                            || ((th2.y + 45 >= p.y) && (th2.y <= p.y) && (th2.x + 15 <= p.x + 50) && (th2.x + 35 >= p.x))
                            || ((th3.y + 45 >= p.y) && (th3.y <= p.y) && (th3.x + 15 <= p.x + 50) && (th3.x + 35 >= p.x))
                            || ((th4.y + 45 >= p.y) && (th4.y <= p.y) && (th4.x + 15 <= p.x + 50) && (th4.x + 35 >= p.x))
                            || ((th5.y + 45 >= p.y) && (th5.y <= p.y) && (th5.x + 15 <= p.x + 50) && (th5.x + 35 >= p.x))
                            || ((th6.y + 45 >= p.y) && (th6.y <= p.y) && (th6.x + 15 <= p.x + 50) && (th6.x + 35 >= p.x))
                            || ((th7.y + 45 >= p.y) && (th7.y <= p.y) && (th7.x + 15 <= p.x + 50) && (th7.x + 35 >= p.x))
                            || ((th8.y + 45 >= p.y) && (th8.y <= p.y) && (th8.x + 15 <= p.x + 50) && (th8.x + 35 >= p.x))
                            || ((th9.y + 45 >= p.y) && (th9.y <= p.y) && (th9.x + 15 <= p.x + 50) && (th9.x + 35 >= p.x))
                            || ((th10.y + 45 >= p.y) && (th10.y <= p.y) && (th10.x + 15 <= p.x + 50) && (th10.x + 35 >= p.x))
                            || ((th11.y + 45 >= p.y) && (th11.y <= p.y) && (th11.x + 15 <= p.x + 50) && (th11.x + 35 >= p.x))
                            || ((th12.y + 45 >= p.y) && (th12.y <= p.y) && (th12.x + 15 <= p.x + 50) && (th12.x + 35 >= p.x))
                            || ((th13.y + 45 >= p.y) && (th13.y <= p.y) && (th13.x + 15 <= p.x + 50) && (th13.x + 35 >= p.x))
                            || ((th14.y + 45 >= p.y) && (th14.y <= p.y) && (th14.x + 15 <= p.x + 50) && (th14.x + 35 >= p.x))
                            || ((th15.y + 45 >= p.y) && (th15.y <= p.y) && (th15.x + 15 <= p.x + 50) && (th15.x + 35 >= p.x))
                            || ((th16.y + 45 >= p.y) && (th16.y <= p.y) && (th16.x + 15 <= p.x + 50) && (th16.x + 35 >= p.x))
                            || ((th17.y + 45 >= p.y) && (th17.y <= p.y) && (th17.x + 15 <= p.x + 50) && (th17.x + 35 >= p.x))
                            || ((th18.y + 45 >= p.y) && (th18.y <= p.y) && (th18.x + 15 <= p.x + 50) && (th18.x + 35 >= p.x))
                            || ((th19.y + 45 >= p.y) && (th19.y <= p.y) && (th19.x + 15 <= p.x + 50) && (th19.x + 35 >= p.x))
                            || ((th20.y + 45 >= p.y) && (th20.y <= p.y) && (th20.x + 15 <= p.x + 50) && (th20.x + 35 >= p.x))
                            || ((th21.y + 45 >= p.y) && (th21.y <= p.y) && (th21.x + 15 <= p.x + 50) && (th21.x + 35 >= p.x))
                            || ((th22.y + 45 >= p.y) && (th22.y <= p.y) && (th22.x + 15 <= p.x + 50) && (th22.x + 35 >= p.x))
                            || ((th23.y + 45 >= p.y) && (th23.y <= p.y) && (th23.x + 15 <= p.x + 50) && (th23.x + 35 >= p.x))
                            || ((th24.y + 45 >= p.y) && (th24.y <= p.y) && (th24.x + 15 <= p.x + 50) && (th24.x + 35 >= p.x))
                            || ((th25.y + 45 >= p.y) && (th25.y <= p.y) && (th25.x + 15 <= p.x + 50) && (th25.x + 35 >= p.x))) || (p.y == 600)) {
                        health--;
                        losthealth.play();
                        long lo = 0;
                        while (lo++ <= 40l) {
                            repaint();
                            try {
                                Thread.sleep(15);
                            } catch (Exception e) {
                            }
                        }
                        if (health > 0) {
                            p.x = savex + 150;
                            p.y = savey;
                            x = -savex;
                        } else {
                            losthealth.play();
                            p3 = false;
                            g3 = true;
                        }
                        th1.ini();
                        th2.ini();
                        th3.ini();
                        th4.ini();
                        th5.ini();
                        th7.ini();
                        th8.ini();
                        th9.ini();
                        th10.ini();
                        th11.ini();
                        th13.ini();
                        th14.ini();
                        th15.ini();
                        th16.ini();
                        th17.ini();
                        th19.ini();
                        th20.ini();
                        th21.ini();
                        th22.ini();
                        th23.ini();
                    }
                    th1.change(p.x);
                    th2.change(p.x);
                    th3.change(p.x);
                    th4.change(p.x);
                    th5.change(p.x);
                    th6.change();
                    th7.change(p.x);
                    th8.change(p.x);
                    th9.change(p.x);
                    th10.change(p.x);
                    th11.change(p.x);
                    th12.change();
                    th13.change(p.x);
                    th14.change(p.x);
                    th15.change(p.x);
                    th16.change(p.x);
                    th17.change(p.x);
                    th18.change();
                    th19.change(p.x);
                    th20.change(p.x);
                    th21.change(p.x);
                    th22.change(p.x);
                    th23.change(p.x);
                    th24.change();
                    th25.change();
                    if ((p.x == 4450) && (p.y + 50 > 400) && (p.y < 600))
                        left = false;
                    if (((p.x >= -45) && (p.x + 50 <= 645) && (p.y == 510))
                            || ((p.x >= 1455) && (p.x + 50 <= 2145) && (p.y == 510))
                            || ((p.x >= 2245) && (p.x + 50 <= 2635) && (p.y == 510))
                            || ((p.x >= 2605) && (p.x + 50 <= 2995) && (p.y == 400))
                            || ((p.x >= 3055) && (p.x + 50 <= 3445) && (p.y == 400))
                            || ((p.x >= 3505) && (p.x + 50 <= 3895) && (p.y == 400))
                            || ((p.x >= 3955) && (p.x + 50 <= 4345) && (p.y == 400))
                            || ((p.x >= 4305) && (p.x + 50 <= 4495) && (p.y == 350))
                            || ((p.x >= 4450) && (p.x + 50 <= 4795) && (p.y == 510))
                            || ((p.x >= 4755) && (p.x + 50 <= 4945) && (p.y == 460))
                            || ((p.x >= 4955) && (p.x + 50 <= 6045) && (p.y == 360))
                            || ((p.x >= 4755) && (p.x + 50 <= 4945) && (p.y == 250))
                            || ((p.x >= 4955) && (p.x + 50 <= 5145) && (p.y == 150))
                    ) {
                        ground = true;
                        falling = false;
                        if (up3 >= 1) {
                            p.change(up3);
                            up3 = 0;
                            p.a = 20;
                        }
                    } else {
                        ground = false;
                        falling = true;
                    }
                    if ((p.x + 30 >= lv3g.x) && (p.x <= lv3g.x + 200))
                        p.y -= 10;
                    if (right == true) {
                        p.x += 5;
                        x -= 5;
                    }
                    if (left == true) {
                        p.x -= 5;
                        x += 5;
                    }
                    if ((up == true) && (up2 > 0)) {
                        p.y -= 10;
                        up2 -= 1;
                        falling = false;
                    }
                    if (falling == true) {
                        p.y += 10;
                        up3++;
                    }
                    if ((p.x == 2290)) {
                        savex = 2290;
                        savey = 510;
                    }
                    if (p.x == 4500) {
                        savex = 4500;
                        savey = 510;
                    }
                    if ((p.x >= 5000) && (p.y == 150) && (score == 5)) {
                        w3 = true;
                        g3 = true;
                        p3 = false;
                    }
                    if (gem1.alive == true) {
                        gem1.changex(x);
                    }
                    if (gem2.alive == true) {
                        gem2.changex(x);
                    }
                    if (gem3.alive == true) {
                        gem3.changex(x);
                    }
                    if (gem4.alive == true) {
                        gem4.changex(x);
                    }
                    if (gem5.alive == true) {
                        gem5.changex(x);
                    }
                    if ((gem1.alive == true) && ((p.x + 45 == gem1.a) || (p.x + 5 == gem1.a + 20) || ((p.x + 5 <= gem1.a) && (p.x + 45 >= gem1.a + 20))) && (p.y == 510)) {
                        score++;
                        gotitem.play();
                        gem1.alive = false;
                    }
                    if ((gem2.alive == true) && ((p.x + 45 == gem2.a) || (p.x + 5 == gem2.a + 20) || ((p.x + 5 <= gem2.a) && (p.x + 45 >= gem2.a + 20))) && (p.y == 510)) {
                        score++;
                        gotitem.play();
                        gem2.alive = false;
                    }
                    if ((gem3.alive == true) && ((p.x + 45 == gem3.a) || (p.x + 5 == gem3.a + 20) || ((p.x + 5 <= gem3.a) && (p.x + 45 >= gem3.a + 20))) && (p.y == 510)) {
                        score++;
                        gotitem.play();
                        gem3.alive = false;
                    }
                    if ((gem4.alive == true) && ((p.x + 45 == gem4.a) || (p.x + 5 == gem4.a + 20) || ((p.x + 5 <= gem4.a) && (p.x + 45 >= gem4.a + 20))) && (p.y == 460)) {
                        score++;
                        gotitem.play();
                        gem4.alive = false;
                    }
                    if ((gem5.alive == true) && ((p.x + 45 == gem5.a) || (p.x + 5 == gem5.a + 20) || ((p.x + 5 <= gem5.a) && (p.x + 45 >= gem5.a + 20))) && (p.y == 250)) {
                        score++;
                        gotitem.play();
                        gem5.alive = false;
                    }
                    if ((p.y == 570) && (p.x >= 1490) && (p.x <= 1560)) {
                        x = -1700;
                        p.x = 1700;
                        p.y = 0;
                    }
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                }
                while ((g3 == true) && (p3 == false)) {
                    repaint();
                    frame.setSize(900, 625);
                    if ((w3 == true) && (in <= 3)) {
                        String a = "";
                        try {
                            FileReader file = new FileReader("images/start/readme.txt");
                            BufferedReader b = new BufferedReader(file);
                            for (int i = 1; i <= 11; i++) {
                                String l = b.readLine();
                                a += l + "\r\n";
                            }
                            for (int i = 1; i < 100 - 11; i++)
                                a += "\r\n";
                            a += 4;
                            b.close();
                        } catch (Exception e) {
                        }
                        File fnew = new File("images/start/readme.txt");
                        FileWriter f2;
                        try {
                            f2 = new FileWriter(fnew, false);
                            f2.write(a);
                            f2.close();
                        } catch (Exception e) {
                        }
                        in = 4;
                    }
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                }
                p3 = false;
                check = false;
            } else if (p4 == true) {
                q4 = true;
                gem1.alive = true;
                gem2.alive = true;
                gem3.alive = true;
                gem4.alive = true;
                gem5.alive = true;
                gem1.a = 250;
                gem1.y = 540;
                gem2.a = 950;
                gem2.y = 540;
                gem3.a = 2050;
                gem3.y = 540;
                gem4.a = 250;
                gem4.y = 540;
                gem5.a = 250;
                gem5.y = 540;
                health = 4;
                p.x = 150;
                p.y = -50;
                savex = 0;
                savey = 510;
                lv4d1 = false;
                lv4d2 = false;
                lv4d3 = false;
                lv4d4 = false;
                w = false;
                while ((q4 == true) && (p4 == true)) {
                    repaint();
                    frame.setSize(900, 625);
                    if ((in >= 4)) {
                        q4 = false;
                        pas = 0;
                        pas2 = "";
                    }
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                    if (p4 == false)
                        break;
                }
                x = -3600;
                while ((x < 0) && (p4 == true)) {
                    frame.setSize(900, 625);
                    repaint();
                    x += 5;
                    gem1.changex(x);
                    gem2.changex(x);
                    gem3.changex(x);
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                }
                while ((g4 == false) && (p4 == true)) {
                    frame.setSize(900, 625);
                    repaint();
                    th26.change();
                    th27.change();
                    th28.change();
                    th29.change();
                    th30.change();
                    th31.change();
                    th32.change();
                    th33.change();
                    if ((lv4d1 == true) && (lv4o.a == 1) && (lv4o.check() == true) && (p.x <= 100) && (score == 5) && (p.y == 510)) {
                        w4 = true;
                        g4 = true;
                        p4 = false;
                    }
                    if ((lv4d2 == true) && (lv4o.a == 2) && (lv4o.check() == true) && (p.x <= 100) && (score == 5) && (p.y == 510)) {
                        w4 = true;
                        g4 = true;
                        p4 = false;
                    }
                    if ((lv4d3 == true) && (lv4o.a == 3) && (lv4o.check() == true) && (p.x <= 100) && (score == 5) && (p.y == 510)) {
                        w4 = true;
                        g4 = true;
                        p4 = false;
                    }
                    if ((lv4d4 == true) && (lv4o.a == 4) && (lv4o.check() == true) && (p.x <= 100) && (score == 5) && (p.y == 510)) {
                        w4 = true;
                        g4 = true;
                        p4 = false;
                    }
                    if ((lv4d1 == false) && (lv4d2 == false) && (lv4d3 == false) && (lv4d4 == false) && (p.y == 600) && (p.x >= 700) && (p.x + 50 <= 800)) {
                        lv4d1 = true;
                        x = 0;
                        p.x = 150;
                        p.y = 0;
                    }
                    if ((lv4d1 == false) && (lv4d2 == false) && (lv4d3 == false) && (lv4d4 == false) && (p.y == 600) && (p.x >= 1500) && (p.x + 50 <= 1600)) {
                        lv4d2 = true;
                        x = 0;
                        p.x = 150;
                        p.y = 0;
                    }
                    if ((lv4d1 == false) && (lv4d2 == false) && (lv4d3 == false) && (lv4d4 == false) && (p.y == 600) && (p.x >= 2300) && (p.x + 50 <= 2400)) {
                        lv4d3 = true;
                        x = 0;
                        p.x = 150;
                        p.y = 0;
                    }
                    if ((lv4d1 == false) && (lv4d2 == false) && (lv4d3 == false) && (lv4d4 == false) && (p.y == 600) && (p.x >= 3100) && (p.x + 50 <= 3200)) {
                        lv4d4 = true;
                        x = 0;
                        p.x = 150;
                        p.y = 0;
                    }
                    if (lv4d4 == true) {
                        gem4.changex(x);
                    } else if (lv4d3 == true) {
                        gem5.changex(x);
                    } else if ((lv4d1 == false) && (lv4d2 == false) && (lv4d3 == false) && (lv4d4 == false)) {
                        gem1.changex(x);
                        gem2.changex(x);
                        gem3.changex(x);
                    }
                    if ((lv4d4 == true)) {
                        if ((gem4.alive == true) && ((p.x + 45 == gem4.a) || (p.x + 5 == gem4.a + 20) || ((p.x + 5 <= gem4.a) && (p.x + 45 >= gem4.a + 20))) && (p.y == 510)) {
                            score++;
                            gotitem.play();
                            gem4.alive = false;
                        }
                    } else if (lv4d3 == true) {
                        if ((gem5.alive == true) && ((p.x + 45 == gem5.a) || (p.x + 5 == gem5.a + 20) || ((p.x + 5 <= gem5.a) && (p.x + 45 >= gem5.a + 20))) && (p.y == 510)) {
                            score++;
                            gotitem.play();
                            gem5.alive = false;
                        }
                    } else if ((lv4d1 == false) && (lv4d2 == false) && (lv4d3 == false) && (lv4d4 == false)) {
                        if ((gem1.alive == true) && ((p.x + 45 == gem1.a) || (p.x + 5 == gem1.a + 20) || ((p.x + 5 <= gem1.a) && (p.x + 45 >= gem1.a + 20))) && (p.y == 510)) {
                            score++;
                            gotitem.play();
                            gem1.alive = false;
                        }
                        if ((gem2.alive == true) && ((p.x + 45 == gem2.a) || (p.x + 5 == gem2.a + 20) || ((p.x + 5 <= gem2.a) && (p.x + 45 >= gem2.a + 20))) && (p.y == 510)) {
                            score++;
                            gotitem.play();
                            gem2.alive = false;
                        }
                        if ((gem3.alive == true) && ((p.x + 45 == gem3.a) || (p.x + 5 == gem3.a + 20) || ((p.x + 5 <= gem3.a) && (p.x + 45 >= gem3.a + 20))) && (p.y == 510)) {
                            score++;
                            gotitem.play();
                            gem3.alive = false;
                        }
                    }
                    if ((lv4d1 == false) && (lv4d2 == false) && (lv4d3 == false) && (lv4d4 == false) && (((th26.y + 45 >= p.y) && (th26.y <= p.y) && (th26.x + 15 <= p.x + 50) && (th26.x + 35 >= p.x))
                            || ((th27.y + 45 >= p.y) && (th27.y <= p.y) && (th27.x + 15 <= p.x + 50) && (th27.x + 35 >= p.x))
                            || ((th28.y + 45 >= p.y) && (th28.y <= p.y) && (th28.x + 15 <= p.x + 50) && (th28.x + 35 >= p.x))
                            || ((th29.y + 45 >= p.y) && (th29.y <= p.y) && (th29.x + 15 <= p.x + 50) && (th29.x + 35 >= p.x))
                            || ((th30.y + 45 >= p.y) && (th30.y <= p.y) && (th30.x + 15 <= p.x + 50) && (th30.x + 35 >= p.x))
                            || ((th31.y + 45 >= p.y) && (th31.y <= p.y) && (th31.x + 15 <= p.x + 50) && (th31.x + 35 >= p.x))
                            || ((th32.y + 45 >= p.y) && (th32.y <= p.y) && (th32.x + 15 <= p.x + 50) && (th32.x + 35 >= p.x))
                            || ((th33.y + 45 >= p.y) && (th33.y <= p.y) && (th33.x + 15 <= p.x + 50) && (th33.x + 35 >= p.x)) || (p.y == 600))) {
                        health--;
                        losthealth.play();
                        long lo = 0;
                        while (lo++ <= 40l) {
                            repaint();
                            try {
                                Thread.sleep(15);
                            } catch (Exception e) {
                            }
                        }
                        if (health > 0) {
                            p.x = savex + 150;
                            p.y = savey;
                            x = -savex;
                        } else {
                            losthealth.play();
                            p4 = false;
                            g4 = true;
                        }
                    }
                    if (((lv4d1 == false) || (lv4d2 == false) || (lv4d3 == false) || (lv4d4 == false)) &&
                            (p.y == 600)) {
                        health--;
                        losthealth.play();
                        long lo = 0;
                        while (lo++ <= 40l) {
                            repaint();
                            try {
                                Thread.sleep(15);
                            } catch (Exception e) {
                            }
                        }
                        if (health > 0) {
                            p.x = savex + 150;
                            p.y = savey;
                            x = -savex;
                        } else {
                            losthealth.play();
                            p4 = false;
                            g4 = true;
                        }
                    }
                    if (((lv4d1 == true) || (lv4d2 == true) || (lv4d3 == true) || (lv4d4 == true)) && (p.x >= -45) && (p.x + 50 <= 645) && (p.y == 510)) {
                        ground = true;
                        falling = false;
                        if (up3 >= 1) {
                            p.change(up3);
                            up3 = 0;
                            p.a = 20;
                        }
                    } else if ((lv4d1 == true) || (lv4d2 == true) || (lv4d3 == true) || (lv4d4 == true)) {
                        ground = false;
                        falling = true;
                    }
                    if ((lv4d1 == false) && (lv4d2 == false) && (lv4d3 == false) && (lv4d4 == false) && (((p.x >= -45) && (p.x + 50 <= 345) && (p.y == 510))
                            || ((p.x >= 400 - 45) && (p.x + 50 <= 745) && (p.y == 510))
                            || ((p.x >= 800 - 45) && (p.x + 50 <= 1145) && (p.y == 510))
                            || ((p.x >= 1200 - 45) && (p.x + 50 <= 1545) && (p.y == 510))
                            || ((p.x >= 1600 - 45) && (p.x + 50 <= 1945) && (p.y == 510))
                            || ((p.x >= 2000 - 45) && (p.x + 50 <= 2345) && (p.y == 510))
                            || ((p.x >= 2400 - 45) && (p.x + 50 <= 2745) && (p.y == 510))
                            || ((p.x >= 2800 - 45) && (p.x + 50 <= 3145) && (p.y == 510))
                            || ((p.x >= 3200 - 45) && (p.x + 50 <= 3555) && (p.y == 510)))) {
                        ground = true;
                        falling = false;
                        if (up3 >= 1) {
                            p.change(up3);
                            up3 = 0;
                            p.a = 20;
                        }
                    } else if ((lv4d1 == false) && (lv4d2 == false) && (lv4d3 == false) && (lv4d4 == false)) {
                        ground = false;
                        falling = true;
                    }
                    if ((lv4d1 == false) && (lv4d2 == false) && (lv4d3 == false) && (lv4d4 == false) && (p.x >= 1100)) {
                        savex = 1150;
                        savey = 510;
                    }
                    if ((lv4d1 == false) && (lv4d2 == false) && (lv4d3 == false) && (lv4d4 == false) && (p.x >= 2400)) {
                        savex = 2450;
                        savey = 510;
                    }
                    if (right == true) {
                        p.x += 5;
                        x -= 5;
                    }
                    if (left == true) {
                        p.x -= 5;
                        x += 5;
                    }
                    if ((up == true) && (up2 > 0)) {
                        p.y -= 10;
                        up2 -= 1;
                        falling = false;
                    }
                    if (falling == true) {
                        p.y += 10;
                        up3++;
                    }
                    if ((lv4d1 == true) && (p.x >= 750 - 30) && (p.y == 580)) {
                        x = -600;
                        p.x = 600 + 150;
                        lv4d1 = false;
                        p.y = 0;
                    }
                    if ((lv4d2 == true) && (p.x >= 750 - 30) && (p.y == 580)) {
                        x = -1400;
                        p.x = 1400 + 150;
                        lv4d2 = false;
                        p.y = 0;
                    }
                    if ((lv4d3 == true) && (p.x >= 750 - 30) && (p.y == 580)) {
                        x = -2200;
                        p.x = 2200 + 150;
                        lv4d3 = false;
                        p.y = 0;
                    }
                    if ((lv4d4 == true) && (p.x >= 750 - 30) && (p.y == 580)) {
                        x = -3000;
                        p.x = 3000 + 150;
                        lv4d4 = false;
                        p.y = 0;
                    }
                    if ((lv4d1 == true) && (p.x >= 550) & (p.y == 510))
                        lv4o.change(1);
                    if ((lv4d2 == true) && (p.x >= 550) & (p.y == 510))
                        lv4o.change(2);
                    if ((lv4d3 == true) && (p.x >= 550) & (p.y == 510))
                        lv4o.change(3);
                    if ((lv4d4 == true) && (p.x >= 550) & (p.y == 510))
                        lv4o.change(4);
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                }
                while ((g4 == true) && (p4 == false)) {
                    repaint();
                    frame.setSize(900, 625);
                    if ((w4 == true) && (in <= 4)) {
                        String a = "";
                        try {
                            FileReader file = new FileReader("images/start/readme.txt");
                            BufferedReader b = new BufferedReader(file);
                            for (int i = 1; i <= 11; i++) {
                                String l = b.readLine();
                                a += l + "\r\n";
                            }
                            for (int i = 1; i < 100 - 11; i++)
                                a += "\r\n";
                            a += 5;
                            b.close();
                        } catch (Exception e) {
                        }
                        File fnew = new File("images/start/readme.txt");
                        FileWriter f2;
                        try {
                            f2 = new FileWriter(fnew, false);
                            f2.write(a);
                            f2.close();
                        } catch (Exception e) {
                        }
                        in = 5;
                    }
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                }
                p4 = false;
                check = false;
            } else if (p5 == true) {
                q5 = true;
                gem1.alive = true;
                gem2.alive = true;
                gem3.alive = true;
                gem4.alive = true;
                gem5.alive = true;
                gem1.a = 100;
                gem1.y = 540;
                gem2.a = 250;
                gem2.y = 540;
                gem3.a = 1350;
                gem3.y = 130;
                gem4.a = 2350;
                gem4.y = 540;
                gem5.a = 3350;
                gem5.y = 130;
                health = 3;
                p.x = 150;
                p.y = -50;
                savex = 0;
                savey = 210;
                w = false;
                while ((p5 == true) && (q5 == true)) {
                    repaint();
                    frame.setSize(900, 625);
                    if ((in >= 5)) {
                        q5 = false;
                        pas = 0;
                        pas2 = "";
                    }
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                    if (p5 == false) break;
                }
                x = -5100;
                while ((x < 0) && (p5 == true)) {
                    frame.setSize(900, 625);
                    repaint();
                    x += 5;
                    gem1.changex(x);
                    gem2.changex(x);
                    gem3.changex(x);
                    gem4.changex(x);
                    gem5.changex(x);
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                }
                while ((g5 == false) && (p5 == true)) {
                    repaint();
                    frame.setSize(900, 625);
                    if ((((p.x >= -45) && (p.x + 50 <= 345) && (p.y == 510))
                            || (b1.check(p.x, p.y) == true)
                            || (b2.check(p.x, p.y) == true)
                            || (b3.check(p.x, p.y) == true)
                            || (b4.check(p.x, p.y) == true)
                            || (b5.check(p.x, p.y) == true)
                            || (b6.check(p.x, p.y) == true)
                            || (b7.check(p.x, p.y) == true)
                            || (b8.check(p.x, p.y) == true)
                            || (b9.check(p.x, p.y) == true)
                            || (b10.check(p.x, p.y) == true)
                            || (b11.check(p.x, p.y) == true)
                            || (b12.check(p.x, p.y) == true)
                            || (b13.check(p.x, p.y) == true)
                            || (b14.check(p.x, p.y) == true)
                            || ((p.x >= 1300 - 45) && (p.x + 50 <= 1445) && (p.y == 100))
                            || ((p.x >= 2300 - 45) && (p.x + 50 <= 2645) && (p.y == 510))
                            || ((p.x >= 3300 - 45) && (p.x + 50 <= 3645) && (p.y == 100))
                            || ((p.x >= 3650 - 45) && (p.x + 50 <= 3795) && (p.y == 200))
                            || ((p.x >= 3850 - 45) && (p.x + 50 <= 3995) && (p.y == 200))
                            || ((p.x >= 4050 - 45) && (p.x + 50 <= 4195) && (p.y == 200))
                            || ((p.x >= 4250 - 45) && (p.x + 50 <= 4395) && (p.y == 200))
                            || ((p.x >= 4450 - 45) && (p.x + 50 <= 4595) && (p.y == 200))
                            || ((p.x >= 4700 - 45) && (p.x + 50 <= 5045) && (p.y == 510))
                    )) {
                        ground = true;
                        falling = false;
                        if (up3 >= 1) {
                            p.change(up3);
                            up3 = 0;
                            p.a = 20;
                        }
                    } else {
                        ground = false;
                        falling = true;
                    }
                    if (((b1.y <= p.y + 50) && (b1.y + 40 >= p.y) && (p.x == b1.x - 50))
                            || ((b2.y <= p.y + 50) && (b2.y + 40 >= p.y) && (p.x == b2.x - 50))
                            || ((b3.y <= p.y + 50) && (b3.y + 40 >= p.y) && (p.x == b3.x - 50))
                            || ((b4.y <= p.y + 50) && (b4.y + 40 >= p.y) && (p.x == b4.x - 50))
                            || ((b5.y <= p.y + 50) && (b5.y + 40 >= p.y) && (p.x == b5.x - 50))
                            || ((b6.y < p.y + 50) && (b6.y + 40 > p.y) && (p.x == b6.x - 50))
                            || ((b7.y <= p.y + 50) && (b7.y + 40 >= p.y) && (p.x == b7.x - 50))
                            || ((b8.y <= p.y + 50) && (b8.y + 40 >= p.y) && (p.x == b8.x - 50))
                            || ((b9.y <= p.y + 50) && (b9.y + 40 >= p.y) && (p.x == b9.x - 50))
                            || ((b10.y <= p.y + 50) && (b10.y + 40 >= p.y) && (p.x == b10.x - 50))
                            || ((b11.y <= p.y + 50) && (b11.y + 40 >= p.y) && (p.x == b11.x - 50))
                            || ((b12.y <= p.y + 50) && (b12.y + 40 >= p.y) && (p.x == b12.x - 50))
                            || ((b13.y <= p.y + 50) && (b13.y + 40 >= p.y) && (p.x == b13.x - 50))
                            || ((b14.y <= p.y + 50) && (b14.y + 40 >= p.y) && (p.x == b14.x - 50))
                    )
                        right = false;
                    if (((b1.y <= p.y + 50) && (b1.y + 40 >= p.y) && (p.x == b1.x + 100))
                            || ((b2.y <= p.y + 50) && (b2.y + 40 >= p.y) && (p.x == b2.x + 100))
                            || ((b3.y <= p.y + 50) && (b3.y + 40 >= p.y) && (p.x == b3.x + 100))
                            || ((b4.y <= p.y + 50) && (b4.y + 40 >= p.y) && (p.x == b4.x + 100))
                            || ((b5.y < p.y + 50) && (b5.y + 40 >= p.y) && (p.x == b5.x + 100))
                            || ((b6.y <= p.y + 50) && (b6.y + 40 > p.y) && (p.x == b6.x + 100))
                            || ((b7.y <= p.y + 50) && (b7.y + 40 >= p.y) && (p.x == b7.x + 100))
                            || ((b8.y <= p.y + 50) && (b8.y + 40 >= p.y) && (p.x == b8.x + 100))
                            || ((b9.y <= p.y + 50) && (b9.y + 40 >= p.y) && (p.x == b9.x + 100))
                            || ((b10.y <= p.y + 50) && (b10.y + 40 >= p.y) && (p.x == b10.x + 100))
                            || ((b11.y <= p.y + 50) && (b11.y + 40 >= p.y) && (p.x == b11.x + 100))
                            || ((b12.y <= p.y + 50) && (b12.y + 40 >= p.y) && (p.x == b12.x + 100))
                            || ((b13.y <= p.y + 50) && (b13.y + 40 >= p.y) && (p.x == b13.x + 100))
                            || ((b14.y <= p.y + 50) && (b14.y + 40 >= p.y) && (p.x == b14.x + 100))
                    )
                        left = false;
                    if (right == true) {
                        p.x += 5;
                        x -= 5;
                    }
                    if ((p.y == b11.y + 40) && (p.x + 45 >= b11.x) && (p.x + 5 <= b11.x + 100))
                        up = false;
                    if ((up == true) && (up2 > 0)) {
                        p.y -= 10;
                        up2 -= 1;
                        falling = false;
                    }
                    if (left == true) {
                        p.x -= 5;
                        x += 5;
                    }
                    if (p.x == 2300) {
                        savex = 2300;
                        savey = 400;
                    } else if (p.x == 1200) {
                        savex = 1200;
                        savey = 0;
                    }
                    b1.change(p.x, p.y);
                    b2.change(p.x, p.y);
                    b3.change(p.x, p.y);
                    b4.change(p.x, p.y);
                    b5.change(p.x, p.y);
                    b6.change(p.x, p.y);
                    b7.change(p.x, p.y);
                    b8.change(p.x, p.y);
                    b9.change(p.x, p.y);
                    b10.change(p.x, p.y);
                    b11.change(p.x, p.y);
                    b12.change(p.x, p.y);
                    b13.change(p.x, p.y);
                    b14.change(p.x, p.y);
                    if ((p.y == 600) || ((th34.y + 50 >= p.y) && (th34.y <= p.y) && (th34.x <= p.x + 50) && (th34.x + 50 >= p.x))
                            || ((th35.y + 50 >= p.y) && (th35.y <= p.y) && (th35.x <= p.x + 50) && (th35.x + 50 >= p.x))
                            || ((th36.y + 50 >= p.y) && (th36.y <= p.y) && (th36.x <= p.x + 50) && (th36.x + 50 >= p.x))
                            || ((th37.y + 50 >= p.y) && (th37.y <= p.y) && (th37.x <= p.x + 50) && (th37.x + 50 >= p.x))
                            || ((th38.y + 50 >= p.y) && (th38.y <= p.y) && (th38.x <= p.x + 50) && (th38.x + 50 >= p.x))) {
                        health--;
                        losthealth.play();
                        long lo = 0;
                        while (lo++ <= 40l) {
                            repaint();
                            try {
                                Thread.sleep(15);
                            } catch (Exception e) {
                            }
                        }
                        if (health > 0) {
                            p.x = savex + 150;
                            p.y = savey;
                            x = -savex;
                        } else {
                            losthealth.play();
                            p5 = false;
                            g5 = true;
                        }
                        b1.ini();
                        b2.ini();
                        b3.ini();
                        b4.ini();
                        b5.ini();
                        b6.ini();
                        b7.ini();
                        b8.ini();
                        b9.ini();
                        b10.ini();
                        b11.ini();
                        b12.ini();
                        b13.ini();
                        b14.ini();
                    }
                    th34.change();
                    th35.change();
                    th36.change();
                    th37.change();
                    th38.change();
                    if (falling == true) {
                        p.y += 10;
                        up3++;
                    }
                    if ((p.x >= 4900) && (score == 5) && (p.y == 510)) {
                        w5 = true;
                        g5 = true;
                        p5 = false;
                    }
                    if (gem1.alive == true) {
                        gem1.changex(x);
                    }
                    if (gem2.alive == true) {
                        gem2.changex(x);
                    }
                    if (gem3.alive == true) {
                        gem3.changex(x);
                    }
                    if (gem4.alive == true) {
                        gem4.changex(x);
                    }
                    if (gem5.alive == true) {
                        gem5.changex(x);
                    }
                    if ((gem1.alive == true) && ((p.x + 45 == gem1.a) || (p.x + 5 == gem1.a + 20) || ((p.x + 5 <= gem1.a) && (p.x + 45 >= gem1.a + 20))) && (p.y == 510)) {
                        gotitem.play();
                        score++;
                        gem1.alive = false;
                    }
                    if ((gem2.alive == true) && ((p.x + 45 == gem2.a) || (p.x + 5 == gem2.a + 20) || ((p.x + 5 <= gem2.a) && (p.x + 45 >= gem2.a + 20))) && (p.y == 510)) {
                        score++;
                        gotitem.play();
                        gem2.alive = false;
                    }
                    if ((gem3.alive == true) && ((p.x + 45 == gem3.a) || (p.x + 5 == gem3.a + 20) || ((p.x + 5 <= gem3.a) && (p.x + 45 >= gem3.a + 20))) && (p.y == 100)) {
                        score++;
                        gotitem.play();
                        gem3.alive = false;
                    }
                    if ((gem4.alive == true) && ((p.x + 45 == gem4.a) || (p.x + 5 == gem4.a + 20) || ((p.x + 5 <= gem4.a) && (p.x + 45 >= gem4.a + 20))) && (p.y == 510)) {
                        score++;
                        gotitem.play();
                        gem4.alive = false;
                    }
                    if ((gem5.alive == true) && ((p.x + 45 == gem5.a) || (p.x + 5 == gem5.a + 20) || ((p.x + 5 <= gem5.a) && (p.x + 45 >= gem5.a + 20))) && (p.y == 100)) {
                        score++;
                        gotitem.play();
                        gem5.alive = false;
                    }
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                }
                while ((g5 == true) && (p5 == false)) {
                    repaint();
                    frame.setSize(900, 625);
                    if ((w5 == true) && (in <= 5)) {
                        String a = "";
                        try {
                            FileReader file = new FileReader("images/start/readme.txt");
                            BufferedReader b = new BufferedReader(file);
                            for (int i = 1; i <= 11; i++) {
                                String l = b.readLine();
                                a += l + "\r\n";
                            }
                            for (int i = 1; i < 100 - 11; i++)
                                a += "\r\n";
                            a += 6;
                            b.close();
                        } catch (Exception e) {
                        }
                        File fnew = new File("images/start/readme.txt");
                        FileWriter f2;
                        try {
                            f2 = new FileWriter(fnew, false);
                            f2.write(a);
                            f2.close();
                        } catch (Exception e) {
                        }
                        in = 6;
                    }
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                }
                p5 = false;
                check = false;
            } else if (credits == true) {
                long lo = 0;
                while (lo++ <= 120l) {
                    repaint();
                    frame.setSize(800, 425);
                    try {
                        Thread.sleep(15);
                    } catch (Exception e) {
                    }
                }
                credits = false;
            }
            try {
                Thread.sleep(15);
            } catch (Exception e) {
            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        if ((p1 == true) && (q1 == false)) {
            g.setColor(new Color(134, 220, 253));
            g.fillRect(0, 0, 6000, 6000);
            g.setColor(Color.black);
            g.drawImage(i, x, 560, this);
            g.drawImage(o, x + 200, 40, this);
            g.drawImage(kl, x + 1000, 40, this);
            g.drawImage(o, x + 1800, 40, this);
            g.drawImage(j, x + 300, 480, this);
            g.drawImage(j, x + 450, 420, this);
            g.drawImage(j, x + 600, 380, this);
            g.drawImage(j, x + 750, 340, this);
            g.drawImage(k, x + 900, 300, this);
            g.drawImage(i, x + 1100, 560, this);
            g.drawImage(m, x + 1500, 560, this);
            g.drawImage(i, x + 1600, 280, this);
            g.drawImage(n, x + 1700, 0, this);
            g.drawImage(i, x + 2200, 560, this);
            g.drawImage(l, x + 2300, 360, this);
            g.drawImage(r, x + 50, 460, this);
            g.drawImage(r, x + 450, 320, this);
            g.drawImage(r, x + 750, 240, this);
            g.drawImage(r, x + 1700, 180, this);
            g.drawImage(heart, 800, 0, this);
            g.drawImage(gem, 808, 32, this);
            g.setColor(Color.black);
            if ((p.y == 510) && (p.x == 150))
                g.drawString("PRESS LEFT AND RIGHT ARROW TO MOVE", 0, 250);
            if ((p.y == 510) && (p.x == 250))
                g.drawString("PRESS UP ARROW TO JUMP", 0, 250);
            if ((p.x >= 300) && (p.x + 50 <= 400) && (p.y == 430)) {
                g.drawString("COLLECT ALL YELLOW GEMS TO COMPLETE THE LEVEL", 0, 250);
            }
            if ((p.x >= 900) && (p.x + 50 <= 1100) && (p.y == 250)) {
                g.drawString("THE NUMBER OF LIVES AND GEMS YOU HAVE IS SHOWN IN THE RIGHT SIDE ", 0, 200);
                g.drawString("TOPMOST CORNER OF THE SCREEN ", 0, 220);
                g.drawString("GOOD LUCK", 0, 240);
            }
            if ((p.x >= 1100) && (p.x + 50 <= 1400) && (p.y == 510)) {
                g.drawString("JUMP INTO THE YELLOW TELEPORTER ", 0, 250);
            }
            g.drawString("=" + health, 835, 20);
            g.drawString("=" + score + "/5", 843, 45);
            if (gem1.alive == true) {
                gemx = gem1.x;
                gemy = gem1.y;
                g.drawImage(gem, gemx, gemy, this);
            }
            if (gem2.alive == true) {
                gemx = gem2.x;
                gemy = gem2.y;
                g.drawImage(gem, gemx, gemy, this);
            }
            if (gem3.alive == true) {
                gemx = gem3.x;
                gemy = gem3.y;
                g.drawImage(gem, gemx, gemy, this);
            }
            if (gem4.alive == true) {
                gemx = gem4.x;
                gemy = gem4.y;
                g.drawImage(gem, gemx, gemy, this);
            }
            if (gem5.alive == true) {
                gemx = gem5.x;
                gemy = gem5.y;
                g.drawImage(gem, gemx, gemy, this);
            }
            p.draw(g);
        } else if ((p1 == true) && (q1 == true)) {
            g.setColor(new Color(134, 220, 253));
            g.fillRect(0, 0, 6000, 6000);
            g.setColor(Color.black);
            g.setColor(new Color(255, 128, 0));
            g.fillRect(250, 200, 410, 200);
            g.setColor(Color.black);
            g.drawString("Complete level 1 to play this level", 300, 250);
        } else if (g1 == true) {
            g.setColor(new Color(134, 220, 253));
            g.fillRect(0, 0, 6000, 6000);
            g.setColor(Color.black);
            g.setColor(new Color(255, 128, 0));
            g.fillRect(300, 300, 200, 100);
            g.setColor(Color.black);
            g.drawString("GO BACK", 370, 350);
            if (w1 == true) {
                g.drawImage(new ImageIcon("images//PAS//PAS2.png").getImage(), 300, 100, this);
                g.setColor(Color.red);
                g.drawString("YOU COMPLETED THIS LEVEL", 300, 250);
            } else {
                g.setColor(Color.black);
                g.drawString("YOU LOSE", 300, 250);
            }
        } else if ((p2 == true) && (q2 == false)) {
            if (lv2d == true) {
                g.setColor(new Color(128, 128, 192));
                g.fillRect(0, 0, 6000, 6000);
                g.setColor(Color.black);
                g.drawImage(i, x, 560, this);
                Image blockd = new ImageIcon("images//lvl2//block4.png").getImage();
                Image fu = new ImageIcon("images//lvl2//fanup.png").getImage();
                Image fd = new ImageIcon("images//lvl2//fandown.png").getImage();
                Image thornu = new ImageIcon("images//lvl2//thornu.png").getImage();
                Image thornd = new ImageIcon("images//lvl2//thornd.png").getImage();
                Image key = new ImageIcon("images//lvl2//key.png").getImage();
                Image ead = new ImageIcon("images//lvl2//end.png").getImage();
                Image gem1 = new ImageIcon("images//lvl2//gem.png").getImage();
                Image td = new ImageIcon("images//lvl2//td.png").getImage();
                for (int i = 400; i <= 1650; i += 50)
                    g.drawImage(thornu, x + i, -30, this);
                for (int i = 400; i <= 1850; i += 50)
                    g.drawImage(thornd, x + i, 580, this);
                if (gem4.alive == true) {
                    gemx = gem4.x;
                    gemy = gem4.y;
                    g.drawImage(gem1, gemx, gemy, this);
                }
                if (gem5.alive == true) {
                    gemx = gem5.x;
                    gemy = gem5.y;
                    g.drawImage(gem1, gemx, gemy, this);
                }
                g.drawImage(fu, x + 400, 570, this);
                g.drawImage(td, x + 150, 00, this);
                g.drawImage(fd, x + 550, 0, this);
                g.drawImage(fu, x + 700, 570, this);
                g.drawImage(fd, x + 850, 0, this);
                g.drawImage(fu, x + 1000, 570, this);
                g.drawImage(fd, x + 1150, 0, this);
                g.drawImage(fu, x + 1300, 570, this);
                g.drawImage(fd, x + 1450, 0, this);
                g.drawImage(fu, x + 1600, 570, this);
                g.drawImage(key, x + 1750, 0, this);
                g.drawImage(blockd, x + 1800, 400, this);
                if (lv2o == true)
                    g.drawImage(ead, x + 2150, 200, this);
                g.drawImage(hart, 800, 0, this);
                g.drawImage(gam, 808, 32, this);
                g.drawString("=" + health, 835, 20);
                g.drawString("=" + score + "/5", 843, 45);
                p.draw(g);
            } else {
                g.setColor(new Color(134, 220, 253));
                g.fillRect(0, 0, 6000, 6000);
                g.setColor(Color.black);
                g.drawImage(k, x, 300, this);
                g.drawImage(i, x, 260, this);
                g.drawImage(j, x + 400, 400, this);
                g.drawImage(j, x + 500, 400, this);
                g.drawImage(j, x + 600, 400, this);
                g.drawImage(j, x + 700, 400, this);
                g.drawImage(j, x + 800, 400, this);
                g.drawImage(j, x + 900, 400, this);
                g.drawImage(lv4, x + 1000, 330, this);
                g.drawImage(j, x + 990, 590, this);
                g.drawImage(m, x + 1090, 590, this);
                g.drawImage(r, x + 400, 300, this);
                g.drawImage(r, x + 600, 300, this);
                g.drawImage(r, x + 800, 300, this);
                g.drawImage(o, x + 00, 00, this);
                g.drawImage(kl, x + 600, 00, this);
                g.drawImage(o, x + 1200, 00, this);
                g.drawImage(heart, 800, 0, this);
                g.drawImage(gem, 808, 32, this);
                g.drawString("=" + health, 835, 20);
                g.drawString("=" + score + "/5", 843, 45);
                if (gem1.alive == true) {
                    gemx = gem1.x;
                    gemy = gem1.y;
                    g.drawImage(gem, gemx, gemy, this);
                }
                if (gem2.alive == true) {
                    gemx = gem2.x;
                    gemy = gem2.y;
                    g.drawImage(gem, gemx, gemy, this);
                }
                if (gem3.alive == true) {
                    gemx = gem3.x;
                    gemy = gem3.y;
                    g.drawImage(gem, gemx, gemy, this);
                }
                p.draw(g);
            }
            if (x == 0) {
                g.setColor(Color.red);
                g.drawString("LOST  WORLDS", 100, 150);
            }
        } else if ((p2 == true) && (q2 == true)) {
            g.setColor(new Color(134, 220, 253));
            g.fillRect(0, 0, 6000, 6000);
            g.setColor(Color.black);
            g.setColor(new Color(255, 0, 128));
            g.fillRect(560, 320, 90, 50);
            g.setColor(Color.black);
            g.drawString("GO BACK", 560, 350);
            g.drawString("COMPLETE LEVEL 1 TO PLAY THIS LEVEL", 300, 250);
        } else if ((p2 == false) && (g2 == true)) {
            g.setColor(new Color(134, 220, 253));
            g.fillRect(0, 0, 6000, 6000);
            g.setColor(Color.black);
            g.setColor(new Color(255, 128, 0));
            g.fillRect(300, 300, 200, 100);
            g.setColor(Color.black);
            g.drawString("GO BACK", 370, 350);
            if (w2 == true) {
                g.drawImage(new ImageIcon("images//PAS//PAS2.png").getImage(), 300, 100, this);
                g.setColor(Color.red);
                g.drawString("YOU COMPLETED THIS LEVEL", 300, 250);
            } else {
                g.setColor(Color.black);
                g.drawString("YOU LOSE", 300, 250);
            }
        } else if ((p3 == true) && (q3 == false)) {
            g.setColor(new Color(134, 220, 253));
            g.fillRect(0, 0, 6000, 6000);
            g.setColor(Color.black);
            g.drawImage(o, x + 0, 100, this);
            g.drawImage(kl, x + 600, 00, this);
            g.drawImage(o, x + 1200, 100, this);
            g.drawImage(kl, x + 1800, 00, this);
            g.drawImage(o, x + 2400, 100, this);
            g.drawImage(kl, x + 3000, 00, this);
            g.drawImage(o, x + 3600, 100, this);
            g.drawImage(kl, x + 4200, 00, this);
            g.drawImage(r, x + 100, 460, this);
            g.drawImage(r, x + 500, 460, this);
            g.drawImage(r, x + 1500, 460, this);
            g.drawImage(r, x + 1800, 460, this);
            g.drawImage(r, x + 4600, 460, this);
            g.drawImage(r, x + 2400, 460, this);
            g.drawImage(i, x, 560, this);
            g.drawImage(i, x + 300, 560, this);
            Image fu = new ImageIcon("images//lvl3//fanup.png").getImage();
            Image fd = new ImageIcon("images//lvl3//fandown.png").getImage();
            g.drawImage(fu, x + lv3g.x, 0, this);
            g.drawImage(fd, x + lv3g.x, 580, this);
            g.drawImage(i, x + 1500, 560, this);
            g.drawImage(i, x + 1800, 560, this);
            g.drawImage(i, x + 2290, 560, this);
            g.drawImage(i, x + 2650, 450, this);
            g.drawImage(i, x + 3100, 450, this);
            g.drawImage(i, x + 3550, 450, this);
            g.drawImage(i, x + 4000, 450, this);
            Image thornu = new ImageIcon("images//lvl3//thornu.png").getImage();
            g.drawImage(thornu, x + th1.x, th1.y, this);
            g.drawImage(thornu, x + th2.x, th2.y, this);
            g.drawImage(thornu, x + th3.x, th3.y, this);
            g.drawImage(thornu, x + th4.x, th4.y, this);
            g.drawImage(thornu, x + th5.x, th5.y, this);
            g.drawImage(thornu, x + th6.x, th6.y, this);
            g.drawImage(thornu, x + th7.x, th7.y, this);
            g.drawImage(thornu, x + th8.x, th8.y, this);
            g.drawImage(thornu, x + th9.x, th9.y, this);
            g.drawImage(thornu, x + th10.x, th10.y, this);
            g.drawImage(thornu, x + th11.x, th11.y, this);
            g.drawImage(thornu, x + th12.x, th12.y, this);
            g.drawImage(thornu, x + th13.x, th13.y, this);
            g.drawImage(thornu, x + th14.x, th14.y, this);
            g.drawImage(thornu, x + th15.x, th15.y, this);
            g.drawImage(thornu, x + th16.x, th16.y, this);
            g.drawImage(thornu, x + th17.x, th17.y, this);
            g.drawImage(thornu, x + th18.x, th18.y, this);
            g.drawImage(thornu, x + th19.x, th19.y, this);
            g.drawImage(thornu, x + th20.x, th20.y, this);
            g.drawImage(thornu, x + th21.x, th21.y, this);
            g.drawImage(thornu, x + th22.x, th22.y, this);
            g.drawImage(thornu, x + th23.x, th23.y, this);
            g.drawImage(thornu, x + th24.x, th24.y, this);
            g.drawImage(thornu, x + th25.x, th25.y, this);
            g.drawImage(heart, 800, 0, this);
            g.drawImage(gem, 808, 32, this);
            g.drawString("=" + health, 835, 20);
            g.drawString("=" + score + "/5", 843, 45);
            for (int i = 2600; i <= 4350; i += 50) {
                Image thornd = new ImageIcon("images//lvl3//thornd.png").getImage();
                ;
                g.drawImage(thornd, x + i, 580, this);
            }
            Image b6 = new ImageIcon("images//lvl3//block6.png").getImage();
            ;
            Image tr = new ImageIcon("images//lvl3//thornr.png").getImage();
            ;
            g.drawImage(b6, x + 4350, 400, this);
            g.drawImage(r, x + 4450, 500, this);
            Image k2 = new ImageIcon("images//lvl3//keyl.png").getImage();
            ;
            g.drawImage(k2, x + 4450, 510, this);
            g.drawImage(i, x + 4450, 560, this);
            g.drawImage(l, x + 4950, 0, this);
            if (gem1.alive == true) {
                gemx = gem1.x;
                gemy = gem1.y;
                g.drawImage(gem, gemx, gemy, this);
            }
            if (gem2.alive == true) {
                gemx = gem2.x;
                gemy = gem2.y;
                g.drawImage(gem, gemx, gemy, this);
            }
            if (gem3.alive == true) {
                gemx = gem3.x;
                gemy = gem3.y;
                g.drawImage(gem, gemx, gemy, this);
            }
            if ((p.x == 4450) && (p.y == 510)) {
                g.drawImage(j, x + 5000, 200, this);
                g.drawImage(j, x + 4800, 300, this);
                g.drawImage(j, x + 5000, 410, this);
                g.drawImage(j, x + 4800, 510, this);
                if (gem4.alive == true) {
                    gemx = gem4.x;
                    gemy = gem4.y;
                    g.drawImage(gem, gemx, gemy, this);
                }
                if (gem5.alive == true) {
                    gemx = gem5.x;
                    gemy = gem5.y;
                    g.drawImage(gem, gemx, gemy, this);
                }
            }
            p.draw(g);
        } else if ((p3 == true) && (q3 == true)) {
            g.setColor(new Color(134, 220, 253));
            g.fillRect(0, 0, 6000, 6000);
            g.setColor(Color.black);
            g.setColor(new Color(255, 0, 128));
            g.fillRect(560, 320, 90, 50);
            g.setColor(Color.black);
            g.drawString("GO BACK", 560, 350);
            g.drawString("COMPLETE LEVEL 2 TO PLAY THIS LEVEL", 300, 250);
        } else if ((p3 == false) && (g3 == true)) {
            g.setColor(new Color(134, 220, 253));
            g.fillRect(0, 0, 6000, 6000);
            g.setColor(Color.black);
            g.setColor(new Color(255, 128, 0));
            g.fillRect(300, 300, 200, 100);
            g.setColor(Color.black);
            g.drawString("GO BACK", 370, 350);
            if (w3 == true) {
                g.drawImage(new ImageIcon("images//PAS//PAS2.png").getImage(), 300, 100, this);
                g.setColor(Color.red);
                g.drawString("YOU COMPLETED THIS LEVEL", 300, 250);
            } else {
                g.setColor(Color.black);
                g.drawString("YOU LOSE", 300, 250);
            }
        } else if ((p4 == true) && (q4 == true)) {
            g.setColor(new Color(134, 220, 253));
            g.fillRect(0, 0, 6000, 6000);
            g.setColor(Color.black);
            g.setColor(new Color(255, 0, 128));
            g.fillRect(560, 320, 90, 50);
            g.setColor(Color.black);
            g.drawString("GO BACK", 560, 350);
            g.drawString("COMPLETE LEVEL 3 TO PLAY THIS LEVEL", 300, 250);
        } else if ((p4 == true) && (q4 == false)) {
            if (lv4d1 == true) {
                g.setColor(new Color(128, 128, 192));
                g.fillRect(0, 0, 6000, 6000);
                g.setColor(Color.black);
                g.drawImage(hart, 800, 0, this);
                g.drawImage(gam, 808, 32, this);
                g.drawString("=" + health, 835, 20);
                g.drawString("=" + score + "/5", 843, 45);
                g.drawImage(i, x + 0, 560, this);
                g.drawImage(i, x + 300, 560, this);
                g.drawImage(k2, x + 550, 540, this);
                Image td = new ImageIcon("images//lvl2//tu.png").getImage();
                g.drawImage(td, x + 750, 550, this);
                if ((lv4o.check() == true) && (lv4o.a == 1)) {
                    g.drawImage(ead, x + 0, 360, this);
                }
            } else if (lv4d2 == true) {
                g.setColor(new Color(128, 128, 192));
                g.fillRect(0, 0, 6000, 6000);
                g.setColor(Color.black);
                g.drawImage(hart, 800, 0, this);
                g.drawImage(gam, 808, 32, this);
                g.drawString("=" + health, 835, 20);
                g.drawString("=" + score + "/5", 843, 45);
                g.drawImage(i, x + 0, 560, this);
                g.drawImage(i, x + 300, 560, this);
                g.drawImage(k2, x + 550, 540, this);
                Image td = new ImageIcon("images//lvl2//tu.png").getImage();
                g.drawImage(td, x + 750, 550, this);
                if ((lv4o.check() == true) && (lv4o.a == 2)) {
                    g.drawImage(ead, x + 0, 360, this);
                }
            } else if (lv4d3 == true) {
                g.setColor(new Color(128, 128, 192));
                g.fillRect(0, 0, 6000, 6000);
                g.setColor(Color.black);
                g.drawImage(hart, 800, 0, this);
                g.drawImage(gam, 808, 32, this);
                g.drawString("=" + health, 835, 20);
                g.drawString("=" + score + "/5", 843, 45);
                if (gem5.alive == true) {
                    gemx = gem5.x;
                    gemy = gem5.y;
                    g.drawImage(gam, gemx, gemy, this);
                }
                g.drawImage(i, x + 0, 560, this);
                g.drawImage(i, x + 300, 560, this);
                g.drawImage(k2, x + 550, 540, this);
                Image td = new ImageIcon("images//lvl2//tu.png").getImage();
                g.drawImage(td, x + 750, 550, this);
                if ((lv4o.check() == true) && (lv4o.a == 3)) {
                    g.drawImage(ead, x + 0, 360, this);
                }
            } else if (lv4d4 == true) {
                g.setColor(new Color(128, 128, 192));
                g.fillRect(0, 0, 6000, 6000);
                g.setColor(Color.black);
                g.drawImage(hart, 800, 0, this);
                g.drawImage(gam, 808, 32, this);
                g.drawString("=" + health, 835, 20);
                g.drawString("=" + score + "/5", 843, 45);
                if (gem4.alive == true) {
                    gemx = gem4.x;
                    gemy = gem4.y;
                    g.drawImage(gam, gemx, gemy, this);
                }
                g.drawImage(i, x + 0, 560, this);
                g.drawImage(i, x + 300, 560, this);
                g.drawImage(k2, x + 550, 540, this);
                Image td = new ImageIcon("images//lvl2//tu.png").getImage();
                g.drawImage(td, x + 750, 550, this);
                if ((lv4o.check() == true) && (lv4o.a == 4)) {
                    g.drawImage(ead, x + 0, 360, this);
                }
            } else {
                g.setColor(new Color(134, 220, 253));
                g.fillRect(0, 0, 6000, 6000);
                g.setColor(Color.black);
                g.drawImage(r, x + 100, 460, this);
                g.drawImage(r, x + 200, 460, this);
                g.drawImage(r, x + 400, 460, this);
                g.drawImage(r, x + 500, 460, this);
                g.drawImage(r, x + 600, 460, this);
                g.drawImage(r, x + 800, 460, this);
                g.drawImage(r, x + 900, 460, this);
                g.drawImage(r, x + 1000, 460, this);
                g.drawImage(r, x + 1200, 460, this);
                g.drawImage(r, x + 1300, 460, this);
                g.drawImage(r, x + 1400, 460, this);
                g.drawImage(r, x + 1600, 460, this);
                g.drawImage(r, x + 1700, 460, this);
                g.drawImage(r, x + 1800, 460, this);
                g.drawImage(r, x + 2000, 460, this);
                g.drawImage(r, x + 2100, 460, this);
                g.drawImage(r, x + 2200, 460, this);
                g.drawImage(r, x + 2400, 460, this);
                g.drawImage(r, x + 2500, 460, this);
                g.drawImage(r, x + 2600, 460, this);
                g.drawImage(r, x + 2800, 460, this);
                g.drawImage(r, x + 2900, 460, this);
                g.drawImage(r, x + 3000, 460, this);
                g.drawImage(r, x + 3200, 460, this);
                g.drawImage(r, x + 3300, 460, this);
                g.drawImage(r, x + 3400, 460, this);
                g.drawImage(o, x + 0, 100, this);
                g.drawImage(kl, x + 600, 00, this);
                g.drawImage(o, x + 1200, 100, this);
                g.drawImage(kl, x + 1800, 00, this);
                g.drawImage(o, x + 2400, 100, this);
                g.drawImage(kl, x + 3000, 00, this);
                g.drawImage(o, x + 3600, 100, this);
                Image thornu = new ImageIcon("images//lvl3//thornu.png").getImage();
                g.drawImage(thornu, x + th26.x, th26.y, this);
                g.drawImage(thornu, x + th27.x, th27.y, this);
                g.drawImage(thornu, x + th28.x, th28.y, this);
                g.drawImage(thornu, x + th29.x, th29.y, this);
                g.drawImage(thornu, x + th30.x, th30.y, this);
                g.drawImage(thornu, x + th31.x, th31.y, this);
                g.drawImage(thornu, x + th32.x, th32.y, this);
                g.drawImage(thornu, x + th33.x, th33.y, this);
                g.drawImage(i, x + 0, 560, this);
                g.drawImage(i, x + 400, 560, this);
                g.drawImage(i, x + 800, 560, this);
                g.drawImage(i, x + 1200, 560, this);
                g.drawImage(i, x + 1600, 560, this);
                g.drawImage(i, x + 2000, 560, this);
                g.drawImage(i, x + 2400, 560, this);
                g.drawImage(i, x + 2800, 560, this);
                g.drawImage(i, x + 3200, 560, this);
                g.drawImage(r, x + 00, 460, this);
                if (gem1.alive == true) {
                    gemx = gem1.x;
                    gemy = gem1.y;
                    g.drawImage(gem, gemx, gemy, this);
                }
                if (gem2.alive == true) {
                    gemx = gem2.x;
                    gemy = gem2.y;
                    g.drawImage(gem, gemx, gemy, this);
                }
                if (gem3.alive == true) {
                    gemx = gem3.x;
                    gemy = gem3.y;
                    g.drawImage(gem, gemx, gemy, this);
                }
                g.drawImage(heart, 800, 0, this);
                g.drawImage(gem, 808, 32, this);
                g.drawString("=" + health, 835, 20);
                g.drawString("=" + score + "/5", 843, 45);
            }
            p.draw(g);
        } else if (g4 == true) {
            g.setColor(new Color(134, 220, 253));
            g.fillRect(0, 0, 6000, 6000);
            g.setColor(Color.black);
            g.setColor(new Color(255, 128, 0));
            g.fillRect(300, 300, 200, 100);
            g.setColor(Color.black);
            g.drawString("GO BACK", 370, 350);
            if (w4 == true) {
                g.drawImage(new ImageIcon("images//PAS//PAS2.png").getImage(), 300, 100, this);
                g.setColor(Color.red);
                g.drawString("YOU COMPLETED THIS LEVEL", 300, 250);
            } else {
                g.setColor(Color.black);
                g.drawString("YOU LOSE", 300, 250);
            }
        } else if ((p5 == true) && (q5 == false)) {
            g.setColor(new Color(134, 220, 253));
            g.fillRect(0, 0, 6000, 6000);
            g.setColor(Color.black);
            g.drawImage(o, x + 0, 100, this);
            g.drawImage(kl, x + 600, 00, this);
            g.drawImage(o, x + 1200, 300, this);
            g.drawImage(kl, x + 1800, 00, this);
            g.drawImage(o, x + 2400, 300, this);
            g.drawImage(kl, x + 3000, 300, this);
            g.drawImage(o, x + 3600, 100, this);
            g.drawImage(kl, x + 4200, 00, this);
            g.drawImage(r, x + 00, 460, this);
            g.drawImage(r, x + 100, 460, this);
            g.drawImage(r, x + 200, 460, this);
            g.drawImage(r, x + 1300, 50, this);
            g.drawImage(r, x + 3300, 50, this);
            g.drawImage(r, x + 3400, 50, this);
            g.drawImage(r, x + 4700, 460, this);
            g.drawImage(i, x + 00, 560, this);
            g.drawImage(j, x + 1300, 150, this);
            g.drawImage(j, x + b1.x, b1.y, this);
            g.drawImage(j, x + b2.x, b2.y, this);
            g.drawImage(j, x + b3.x, b3.y, this);
            g.drawImage(j, x + b4.x, b4.y, this);
            g.drawImage(j, x + b5.x, b5.y, this);
            g.drawImage(j, x + b6.x, b6.y, this);
            g.drawImage(j, x + b7.x, b7.y, this);
            g.drawImage(j, x + b8.x, b8.y, this);
            g.drawImage(j, x + b9.x, b9.y, this);
            g.drawImage(j, x + b10.x, b10.y, this);
            g.drawImage(i, x + 2300, 560, this);
            g.drawImage(j, x + b11.x, b11.y, this);
            g.drawImage(j, x + b12.x, b12.y, this);
            g.drawImage(j, x + b13.x, b13.y, this);
            g.drawImage(j, x + b14.x, b14.y, this);
            g.drawImage(i, x + 3300, 150, this);
            g.drawImage(i, x + 4700, 560, this);
            g.drawImage(l, x + 4800, 360, this);
            if ((p.x >= 3300) && (p.x <= 3400)) {
                g.setColor(Color.red);
                g.drawString("PRESS SPACEBAR", 300, 300);
                g.setColor(Color.black);
                g.drawString("THE THINGS YOU SEE IN LOWER HALF OF SCREEN ARE ACTUALLY PRESENT ", 0, 350);
                g.drawString("IN THE UPPER HALF OF SCREEN", 00, 370);
            }
            if (lv5vi == true) {
                g.setColor(Color.white);
                g.drawRect(x + 3600, 300, 1100, 300);
                g.drawImage(j, x + 3650, 500, this);
                g.drawImage(j, x + 3850, 500, this);
                g.drawImage(j, x + 4050, 500, this);
                g.drawImage(j, x + 4250, 500, this);
                g.drawImage(j, x + 4450, 500, this);
                Image thornu = new ImageIcon("images//lvl3//thornu.png").getImage();
                g.drawImage(thornu, x + th34.x, th34.y + 300, this);
                g.drawImage(thornu, x + th35.x, th35.y + 300, this);
                g.drawImage(thornu, x + th36.x, th36.y + 300, this);
                g.drawImage(thornu, x + th37.x, th37.y + 300, this);
                g.drawImage(thornu, x + th38.x, th38.y + 300, this);
                g.setColor(Color.black);
            }
            if (gem1.alive == true) {
                gemx = gem1.x;
                gemy = gem1.y;
                g.drawImage(gem, gemx, gemy, this);
            }
            if (gem2.alive == true) {
                gemx = gem2.x;
                gemy = gem2.y;
                g.drawImage(gem, gemx, gemy, this);
            }
            if (gem3.alive == true) {
                gemx = gem3.x;
                gemy = gem3.y;
                g.drawImage(gem, gemx, gemy, this);
            }
            if (gem4.alive == true) {
                gemx = gem4.x;
                gemy = gem4.y;
                g.drawImage(gem, gemx, gemy, this);
            }
            if (gem5.alive == true) {
                gemx = gem5.x;
                gemy = gem5.y;
                g.drawImage(gem, gemx, gemy, this);
            }
            g.drawImage(heart, 800, 0, this);
            g.drawImage(gem, 808, 32, this);
            g.drawString("=" + health, 835, 20);
            g.drawString("=" + score + "/5", 843, 45);
            p.draw(g);
        } else if ((p5 == true) && (q5 == true)) {
            g.setColor(new Color(134, 220, 253));
            g.fillRect(0, 0, 6000, 6000);
            g.setColor(Color.black);
            g.setColor(new Color(255, 0, 128));
            g.fillRect(560, 320, 90, 50);
            g.setColor(Color.black);
            g.drawString("GO BACK", 560, 350);
            g.drawString("COMPLETE LEVEL 4 TO PLAY THIS LEVEL", 300, 250);
        } else if ((p5 == false) && (g5 == true)) {
            g.setColor(new Color(134, 220, 253));
            g.fillRect(0, 0, 6000, 6000);
            g.setColor(Color.black);
            g.setColor(new Color(255, 128, 0));
            g.fillRect(300, 300, 200, 100);
            g.setColor(Color.black);
            g.drawString("GO BACK", 370, 350);
            if (w5 == true) {
                g.setColor(Color.red);
                g.drawString("YOU COMPLETED ALL THE LEVELS OF THIS JAVA GAME", 300 - 5, 150);
                g.drawString("THANKS FOR PLAYING", 300 - 5, 180);
                g.setColor(Color.black);
            } else {
                g.setColor(Color.black);
                g.drawString("YOU LOSE", 300, 250);
            }
        } else if (credits == true) {
            g.drawImage(new ImageIcon("images//start//credits.png").getImage(), 0, 0, this);
            g.setColor(Color.black);
            g.drawString("PROGRAMMING BY :", 30, 50);
            g.drawString("ABHISEK SINGH", 30, 80);
            g.drawString("GRAPHICS :", 30, 200);
            g.drawString("ABHISEK SINGH", 30, 230);
            g.drawString("TESTING BY:", 450, 50);
            g.drawString("ABHISEK SINGH", 450, 80);
        } else {
            g.setColor(new Color(255, 128, 0));
            g.fillRect(0, 0, 6000, 6000);
            g.setColor(Color.black);
            if (in >= 5)
                g.drawImage(s, 150, 0, this);
            else if (in == 4)
                g.drawImage(new ImageIcon("images//start//start5.png").getImage(), 150, 00, this);
            else if (in == 3)
                g.drawImage(new ImageIcon("images//start//start4.png").getImage(), 150, 00, this);
            else if (in == 2)
                g.drawImage(new ImageIcon("images//start//start3.png").getImage(), 150, 00, this);
            else if (in == 1)
                g.drawImage(new ImageIcon("images//start//start2.png").getImage(), 150, 00, this);
            g.drawImage(new ImageIcon("images//start//S2.png").getImage(), 0, 100, this);
            g.drawImage(new ImageIcon("images//start//S2.png").getImage(), 650, 100, this);
            g.drawImage(new ImageIcon("images//start//S3.png").getImage(), 00, 350, this);
            g.drawImage(new ImageIcon("images//start//S3.png").getImage(), 640, 350, this);
            g.setColor(Color.black);
            g.drawString("VERSION 1.1.5", 380, 550);
            if (in == 6) {
                g.setColor(Color.black);
                g.drawString("YOU HAVE COMPLETED THE GAME", 300, 530);
            }
        }
    }

    public void update(Graphics g) {
        if (i2 == null) {
            i2 = createImage(this.getSize().width, this.getSize().height);
            db = i2.getGraphics();
        }
        db.setColor(getBackground());
        db.fillRect(0, 0, this.getSize().width, this.getSize().height);
        db.setColor(getForeground());
        paint(db);
        g.drawImage(i2, 0, 0, this);
    }

    public void mouseExited(MouseEvent a) {
    }

    public void mouseEntered(MouseEvent a) {
    }

    public void mouseReleased(MouseEvent a) {
    }

    public void mousePressed(MouseEvent a) {
        if ((a.getX() >= 560) && (a.getX() <= 650) && (a.getY() <= 370) && (a.getY() >= 320) && (q3 == true)) {
            click.play();
            pas = 0;
            pas2 = "";
            p3 = false;
            w = false;
            check = false;
        }
        if ((a.getX() >= 560) && (a.getX() <= 650) && (a.getY() <= 370) && (a.getY() >= 320) && (q1 == true)) {
            click.play();
            pas = 0;
            pas2 = "";
            p1 = false;
            w = false;
            check = false;
        }
        if ((a.getX() >= 560) && (a.getX() <= 650) && (a.getY() <= 370) && (a.getY() >= 320) && (q2 == true)) {
            click.play();
            pas = 0;
            pas2 = "";
            p2 = false;
            check = false;
            w = false;
        }
        if ((a.getX() >= 560) && (a.getX() <= 650) && (a.getY() <= 370) && (a.getY() >= 320) && (q4 == true)) {
            click.play();
            pas = 0;
            pas2 = "";
            p4 = false;
            w = false;
            check = false;
        }
        if ((a.getX() >= 560) && (a.getX() <= 650) && (a.getY() <= 370) && (a.getY() >= 320) && (q5 == true)) {
            click.play();
            pas = 0;
            pas2 = "";
            p5 = false;
            w = false;
            check = false;
        }
        if ((a.getX() >= 340) && (a.getX() <= 545) && (a.getY() >= 105) && (a.getY() <= 155) && ((p1 == false) && (g1 == false)) && (credits == false) && ((p3 == false) && (g3 == false)) && (p5 == false) && (g5 == false) && (p4 == false) && (g4 == false)) {
            click.play();
            p2 = true;
        }
        if ((a.getX() >= 340) && (a.getX() <= 545) && (a.getY() >= 180) && (a.getY() <= 235) && ((p1 == false) && (g1 == false)) && ((p2 == false) && (g2 == false)) && (credits == false) && (p5 == false) && (g5 == false) && (p4 == false) && (g4 == false)) {
            click.play();
            p3 = true;
        }
        if ((a.getX() <= 535) && (a.getX() >= 360) && (a.getY() <= 465) && (a.getY() >= 420) && (p1 == false) && (g1 == false) && (p2 == false) && (g2 == false) && (p3 == false) && (g3 == false) && (p5 == false) && (g5 == false) && (p4 == false) && (g4 == false)) {
            click.play();
            credits = true;
        }
        if ((a.getX() >= 340) && (a.getX() <= 545) && (a.getY() <= 80) && (a.getY() >= 35) && (credits == false) && ((p2 == false) && (g2 == false)) && ((p3 == false) && (g3 == false)) && (p5 == false) && (g5 == false) && (p4 == false) && (g4 == false)) {
            click.play();
            p1 = true;
        }
        if ((a.getX() >= 340) && (a.getX() <= 545) && (a.getY() >= 260) && (a.getY() <= 315) && (p1 == false) && (g1 == false) && (p2 == false) && (g2 == false) && (p3 == false) && (g3 == false) && (credits == false) && (p5 == false) && (g5 == false)) {
            click.play();
            p4 = true;
        }
        if ((a.getX() >= 340) && (a.getX() <= 545) && (a.getY() >= 340) && (a.getY() <= 395) && (p1 == false) && (g1 == false) && (p2 == false) && (g2 == false) && (p3 == false) && (g3 == false) && (credits == false) && (p4 == false) && (g4 == false)) {
            click.play();
            p5 = true;
        }
        if ((a.getX() >= 300) && (a.getX() <= 500) && (a.getY() <= 400) && (a.getY() >= 300) && (g5 == true)) {
            click.play();
            p5 = false;
            g5 = false;
            q5 = true;
            p.x = 150;
            p.y = 510;
            x = 0;
            w = false;
            w5 = false;
            score = 0;
            health = 2;
            gem1.alive = true;
            gem2.alive = true;
            gem3.alive = true;
            gem4.alive = true;
            gem5.alive = true;
            b1.ini();
            b2.ini();
            b3.ini();
            b4.ini();
            b5.ini();
            b6.ini();
            b7.ini();
            b8.ini();
            b9.ini();
            b10.ini();
            b11.ini();
            b12.ini();
            b13.ini();
            b14.ini();
            lv5vi = false;
        }
        if ((a.getX() >= 300) && (a.getX() <= 500) && (a.getY() <= 400) && (a.getY() >= 300) && (g1 == true)) {
            click.play();
            p1 = false;
            g1 = false;
            q1 = true;
            p.x = 150;
            p.y = 510;
            x = 0;
            w = false;
            w1 = false;
            score = 0;
            health = 2;
            gem1.alive = true;
            gem2.alive = true;
            gem3.alive = true;
            gem4.alive = true;
            gem5.alive = true;
        }
        if ((a.getX() >= 300) && (a.getX() <= 500) && (a.getY() <= 400) && (a.getY() >= 300) && (g3 == true)) {
            click.play();
            p3 = false;
            g3 = false;
            q3 = true;
            p.x = 150;
            p.y = 510;
            x = 0;
            credits = false;
            th1.ini();
            th2.ini();
            th3.ini();
            th4.ini();
            th5.ini();
            th7.ini();
            th8.ini();
            th9.ini();
            th10.ini();
            th11.ini();
            th13.ini();
            th14.ini();
            th15.ini();
            th16.ini();
            th17.ini();
            th19.ini();
            th20.ini();
            th21.ini();
            th22.ini();
            th23.ini();
            th1.a = false;
            th2.a = false;
            th3.a = false;
            th4.a = false;
            th5.a = false;
            th9.a = false;
            th7.a = false;
            th8.a = false;
            th10.a = false;
            th11.a = false;
            th13.a = false;
            th15.a = false;
            th16.a = false;
            th17.a = false;
            th19.a = false;
            th20.a = false;
            th21.a = false;
            th22.a = false;
            th23.a = false;
            w = false;
            w3 = false;
            score = 0;
            health = 2;
            gem1.alive = true;
            gem2.alive = true;
            gem3.alive = true;
            gem4.alive = true;
            gem5.alive = true;
        }
        if ((a.getX() >= 300) && (a.getX() <= 500) && (a.getY() <= 400) && (a.getY() >= 300) && (g2 == true)) {
            click.play();
            p2 = false;
            g2 = false;
            q2 = true;
            lv2d = false;
            lv2d = false;
            lv2o = false;
            p.x = 150;
            p.y = 0;
            x = 0;
            w = false;
            w2 = false;
            score = 0;
            health = 3;
            gem1.alive = true;
            gem2.alive = true;
            gem3.alive = true;
            gem4.alive = true;
            gem5.alive = true;
        }
        if ((a.getX() >= 300) && (a.getX() <= 500) && (a.getY() <= 400) && (a.getY() >= 300) && (g4 == true)) {
            click.play();
            p4 = false;
            g4 = false;
            q4 = true;
            p.x = 150;
            p.y = 510;
            lv4o.ini();
            x = 0;
            w = false;
            w4 = false;
            score = 0;
            health = 2;
            gem1.alive = true;
            gem2.alive = true;
            gem3.alive = true;
            gem4.alive = true;
            gem5.alive = true;
            lv4o.a = 0;
        }
    }

    public void mouseClicked(MouseEvent a) {
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == 39)
            right = false;
        if (e.getKeyCode() == 37)
            left = false;
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        if (((q1 == true) || (q2 == true) || (q3 == true) || (q4 == true) || (q5 == true)) && (pas2.length() <= 10) && (((e.getKeyCode() >= 48) && (e.getKeyCode() <= 57)) || ((e.getKeyCode() >= 65) && (e.getKeyCode() <= 90)) || ((e.getKeyCode() >= 95) && (e.getKeyCode() <= 122)))) {
            char ch = ("" + e.getKeyChar()).charAt(0);
            pas += ch;
            pas2 += ch;
        }
        if (((q1 == true) || (q2 == true) || (q3 == true) || (q4 == true) || (q5 == true)) && (e.getKeyCode() == 8) && (pas2 != "") && (pas > 0)) {
            String pas3 = "";
            int pas4 = pas2.charAt(pas2.length() - 1);
            for (int i = 0; i <= pas2.length() - 2; i++) {
                pas3 += pas2.charAt(i);
            }
            pas2 = pas3;
            pas = pas - pas4;
        }
        if (((q1 == true) || (q2 == true) || (q3 == true) || (q4 == true) || (q5 == true)) && (e.getKeyCode() == 10))
            check = true;
        if ((((p1 == true) && (q1 == false)) || ((p2 == true) && (q2 == false)) || ((p3 == true) && (q3 == false)) || ((p4 == true) && (q4 == false)) || ((p5 == true) && (q5 == false))) && (e.getKeyCode() == 39))
            right = true;
        if ((((p1 == true) && (q1 == false)) || ((p2 == true) && (q2 == false)) || ((p3 == true) && (q3 == false)) || ((p4 == true) && (q4 == false)) || ((p5 == true) && (q5 == false))) && (e.getKeyCode() == 37))
            left = true;
        if ((((p1 == true) && (q1 == false)) || ((p2 == true) && (q2 == false)) || ((p3 == true) && (q3 == false)) || ((p4 == true) && (q4 == false)) || ((p5 == true) && (q5 == false))) && (e.getKeyCode() == 38) && (ground == true)) {
            audio.play();
            up = true;
            up2 = 20;
        }
        if ((p5 == true) && (q5 == false) && (g5 == false) && (e.getKeyCode() == 32) && (p.x >= 3300))
            lv5vi = true;
    }
}