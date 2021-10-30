
import Shapes.Circle;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JMenuBar implements ActionListener {
    JMenu menu; // One menu
    JMenuItem item; // Which has one item

    private Circle circ;
    private Graphics gr;


    public MainMenu(Graphics gc){
        gr = gc;
        menu=new JMenu("The Menu");
        item=new JMenuItem("Add Circle");
        item.addActionListener(this);
        add(menu);// Add the JMenu to the JMenuBar
        menu.add(item);// Add the JMenuItem to the JMenu
    }

    @Override

    // If 'this' is set as the ActionListener to all menu items, this method will
    // be called whenever any menu item is selected, but the ActionEvent
    // command will be the text of the menu item selected
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        Point p = new Point(200, 200);
        Color c = new Color(0x99226);
        circ = new Circle(p,c,60);
        circ.draw(gr);





    }


}
