import java.awt.*;

public class Bombardiro extends Brainrot{

    private int size, x, y, speed;
    private Color color;

    public Bombardiro(int x, int y, int size, int speed, Color color){

        super(x,y,size,speed,color);
        //this.x = x;
        //this.y = y;
        //this.size = size;
        //this.speed = speed;
        //this.color = color;
    }

    public void draw(Graphics g){
        //g.setColor(color);
        //g.fillOval(x,y,size,size);
        super.draw(g);
    }

    public void moveLeft(){
        //if(x > 0)
        //    x -= speed;
        super.moveLeft();
    }
    public void moveRight(){
        //if(x < 400-size)
        //    x += speed;
        super.moveRight();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
