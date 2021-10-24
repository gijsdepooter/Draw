import java.awt.*;
import java.awt.event.*;

public class Drawing extends Canvas {
    // A private field called f of class Frame. This is also in the AWT.
    private Frame f;
    private Circle circ;
    private Rect rect;
    private Square sqr;

    // The constructor
    public Drawing() {
        Point p=new Point(200,200);
        Point pr=new Point(100,100);
        Point ps=new Point(100,300);
        Color c=new Color(0x992266);
        Color csq=new Color(-204);



        circ = new Circle(p,c,30);
        rect = new Rect(pr,c,30,60);
        sqr = new Square(ps,csq,60);

        window();
        window_settings();
    }

    private void window_settings() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    private void window() {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }


    public void paint(Graphics g){
        circ.draw(g);
        rect.draw(g);
        sqr.draw(g);
    }
}