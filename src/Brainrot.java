import java.awt.*;

public class Brainrot {

    private int size, x, y, speed;
    private Color color;

    public Brainrot(int x, int y, int size, int speed, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.speed = speed;
        this.color = color;
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(x,y,size,size);

    }

    public void moveLeft(){
        if(x > 0)
            x -= speed;
    }
    public void moveRight(){
        if(x < 400-size)
            x += speed;
    }
}
