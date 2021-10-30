package Shapes;

import java.awt.*;

public class Rect extends Shape implements Drawable {
    private int width;
    private int height;

    public Rect(Point initPos,Color col, int w, int h){
        super(initPos, col);
        this.width = w;
        this.height = h;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width,height);
    }


}
