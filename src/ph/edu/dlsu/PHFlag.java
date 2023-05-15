package ph.edu.dlsu;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
public class PHFlag extends GraphicsProgram {
    public void run() {
        GPolygon blue = new GPolygon();
        blue.addVertex(0, 0);
        blue.addEdge(600, 0);
        blue.addEdge(0, 200);
        blue.addEdge(-300, 0);
        blue.addEdge(-300, -200);
        blue.setFilled(true);
        blue.setFillColor(Color.BLUE);
        blue.setColor(Color.BLUE);
        add(blue, 90, 50);

        GPolygon red = new GPolygon();
        red.addVertex(0,0);
        red.addEdge(300, -200);
        red.addEdge(300,0);
        red.addEdge(0,200);
        red.addEdge(-600,0);
        red.setFilled(true);
        red.setFillColor(Color.RED);
        red.setColor(Color.RED);
        add(red, 90, 450);

        GStar star1 = new GStar(1, 1, 50); // top star
        star1.setFilled(true);
        star1.setColor(Color.ORANGE);
        star1.rotate(20);
        star1.setFillColor(Color.ORANGE);
        add(star1,110,100);

        GStar star2 = new GStar(1, 1, 50); // middle star
        star2.setFilled(true);
        star2.setColor(Color.ORANGE);
        star2.rotate(-20);
        star2.setFillColor(Color.ORANGE);
        add(star2,330,250);

        GStar star3 = new GStar(1, 1, 50); // bottom star
        star3.setFilled(true);
        star3.setColor(Color.ORANGE);
        star3.rotate(10);
        star3.setFillColor(Color.ORANGE);
        add(star3,110,400);


        GOval sphere = new GOval(50, 50);
        sphere.setFilled(true);
        sphere.setFillColor(Color.ORANGE);
        sphere.setColor(Color.ORANGE);


        GLine ray1 = new GLine(0,0,0,150);
        GLine ray2 = new GLine(0,0,100,100);
        GLine ray3 = new GLine(0,0,150,0);
        GLine ray4 = new GLine(0,0,100,-100);

        ray1.setColor(Color.ORANGE);
        ray2.setColor(Color.ORANGE);
        ray3.setColor(Color.ORANGE);
        ray4.setColor(Color.ORANGE);

        

        add(ray1, 185, 175);
        add(ray2, 135, 200);
        add(ray3, 110, 250);
        add(ray4, 135, 300);

        add(sphere,160,225);

        GLabel name = new GLabel("By Marc Joseph Ramos");
        name.setFont("Arial-20");
        name.setColor(Color.BLACK);
        add(name,500, 450);

    }
    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError
        (new PHFlag()).start(args);
    }
}
