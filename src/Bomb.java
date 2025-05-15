import java.awt.*;

public class Bomb{

    private int size, x, y, speed;
    private Color color;

    public Bomb(){
        x = 0;
        y = 0;
        size = 20;
        speed = 10;
        color = new Color(0,0,0,0);
    }

    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.fillOval(x,y,size,size);
        //super.draw(g);
    }

    public void drop(){
        this.y += speed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    public Color getColor() {
        return color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
