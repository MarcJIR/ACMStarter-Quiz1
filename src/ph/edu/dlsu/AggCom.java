package ph.edu.dlsu;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class AggCom extends GraphicsProgram {
    public void run() {
        //Composition Start
        GRect hotel = new GRect(300,200);
        add(hotel,30,70);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                int dx = 60*j;
                int dy = 100*i;
                GRect window;
                if(i == 1 && j == 2) {
                    window = new GRect(hotel.getX() + 10 + dx, hotel.getY() + 20 + dy, 40, 80);
                    GLabel room = new GLabel("Door");
                    room.setFont("Arial-10");
                    add(room, window.getX()+(window.getWidth()-room.getWidth())/2, window.getY()+window.getHeight()-10);
                }
                else {
                    window = new GRect(hotel.getX() + 10 + dx, hotel.getY() + 20 + dy, 30, 40);
                    GLabel room = new GLabel("ROOM");
                    room.setFont("Arial-10");
                    add(room, window.getX(), window.getY()+window.getHeight()+15);
                }
                add(window);
            }
        }
        GRect sign = new GRect(300,50);
        add(sign, hotel.getX(), hotel.getY()- sign.getHeight());

        GLabel hotelSign = new GLabel("HOTEL");
        hotelSign.setColor(Color.RED);
        hotelSign.setFont("ARIAL-20");
        add(hotelSign, sign.getX()+ (sign.getWidth()-hotelSign.getWidth())/2, sign.getY()+ hotelSign.getHeight()+10);

        GLabel compo = new GLabel("COMPOSITION");
        compo.setColor(Color.PINK);
        compo.setFont("ARIAL-28");
        add(compo, hotel.getX() + (hotel.getWidth()-compo.getWidth())/2, hotel.getHeight()+100);

        GLabel cExplain = new GLabel("room is part of hotel");
        cExplain.setFont("Arial-14");
        cExplain.setColor(Color.ORANGE);
        add(cExplain, compo.getX(), compo.getY()+ compo.getHeight());
        //Composition end

        //Aggregate Start
        GOval head = new GOval(hotel.getWidth() + 100,hotel.getHeight()-20, 26,26  );
        GPolygon body = new GPolygon();
        body.addVertex(head.getX(), head.getY()+head.getHeight());
        body.addEdge(head.getWidth()+8,0);
        body.addEdge(0,20);
        body.addEdge(-10,0);
        body.addEdge(0,-20);
        body.addEdge(-1,0);
        body.addEdge(0,50);
        body.addEdge(-10,0);
        body.addEdge(0,-30);
        body.addEdge(-1,0);
        body.addEdge(0,30);
        body.addEdge(-10,0);
        body.addEdge(0,-50);
        body.addEdge(-1,0);
        body.addEdge(0,20);
        body.addEdge(-10,0);
        body.addEdge(0,-20);
        add(head);
        add(body);


        GLabel aggre = new GLabel("AGGREGATION");
        aggre.setColor(Color.PINK);
        aggre.setFont("ARIAL-28");
        add(aggre, head.getX() + (head.getWidth()-aggre.getWidth())/2, hotel.getHeight()+100);

        GLabel aExplain = new GLabel("Hotel has a person");
        aExplain.setFont("Arial-14");
        aExplain.setColor(Color.ORANGE);
        add(aExplain, aggre.getX(), aggre.getY()+ aggre.getHeight());
        //aggregate end

        GLabel name = new GLabel("BY MARC JOSEPH RAMOS");
        name.setColor(Color.BLUE);
        name.setFont("ARIAL-28");
        add(name, getWidth()-name.getWidth()-20, getHeight()- name.getHeight()-20);
    }
    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError
        (new AggCom()).start(args);
    }
}
