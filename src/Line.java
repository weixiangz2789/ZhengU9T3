import java.awt.*;

public class Line extends Shape{
    public Line(){
        super();
    }
    @Override
    public void draw(Graphics g) {
        // set the color to draw the shape in
        g.setColor(Color.WHITE);

        // draw the oval given the top left corner of the enclosing
        // rectangle and the width and height
        g.drawLine(getCoord1().x, getCoord1().y, getCoord2().x, getCoord2().y);
        // the getter methods here are INHERITED FROM SHAPE!
    }
}
