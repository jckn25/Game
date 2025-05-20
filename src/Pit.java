import java.awt.*;

public class Pit {
    private int x,y,h,w;
    private Color color;

    public Pit(Color color, int y){
        this.color = color;
        this.y = y;
        x = 50;
        h = 150;
        w = 300;
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(x,y,w,h);
    }
}
