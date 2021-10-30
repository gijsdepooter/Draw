import Shapes.*;
import Shapes.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Drawing extends Canvas {
    // A private field called f of class Frame. This is also in the AWT.
    private Frame f;
    private Circle circ;
    private Rect rect;
    private Square sqr;
    private  ArrayList<Shape> create_shapes;

    static Graphics g;


    // The constructor
    public Drawing() {

        create_shapes = new ArrayList<Shape>();

        Color c=new Color(0x992266);
        Color csq=new Color(-204);
        Color crt=new Color(0);

        for (int i=50; i<300;i+=50) {
            Point p = new Point(i, 200);
            Circle crcl = new Circle(p, c, 40);
            create_shapes.add(crcl);
        }

        for (int i=50; i<300;i+=50) {
            Point p = new Point(200, i);
            Square sq = new Square(p, csq, 40);
            create_shapes.add(sq);
        }

        for (int i=350; i>100 ;i-=50) {
            Point p = new Point(i, 50);
            Rect re = new Rect(p, crt, 40, 20);
            create_shapes.add(re);
        }


        window();
        window_settings();
    }

    private void window_settings() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    private void window() {
        //JFrame f = new JFrame(g);
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        //f.setJMenuBar(new MainMenu(g));
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }


    public void paint(Graphics g){
        for (int i=0; i<create_shapes.size();i++){
            create_shapes.get(i).draw(g);
        }


    }
}