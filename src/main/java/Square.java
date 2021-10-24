import java.awt.*;

public class Square extends Rect {
    private int size;

    public Square(Point initPos, Color col, int size){
       super(initPos, col, size, size);
    }
}
