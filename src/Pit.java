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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    public Color getColor() {
        return color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
