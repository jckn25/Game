import java.awt.*;

public class Ball {

    private int size, x, y, speed;
    private Color color;

    public Ball(){
        x = 180;
        y = 30;
        size = 20;
        speed = 10;
        int random = (int)(Math.random()*2) + 1;
        if(random ==1){
            color = Color.RED;
        }else{
            color = Color.BLUE;
        }
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(x,y,size,size);
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
