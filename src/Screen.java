import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Screen extends JPanel {

    ArrayList<Ball> ballList = new ArrayList<>();

    boolean dropping = false;

    Ball ball = new Ball();

    Pit redPit = new Pit(new Color(150,0,0), 300);

    Pit bluePit = new Pit(new Color(0,0,150), 500);

    static int points = 0;

    static double timer = 30;

    public Screen(){

        setFocusable(true);

         /* Key codes
            Left arrow = 37
            Up arrow = 38
            Right arrow = 39
            Down arrow = 40
            W = 87
            A = 65
            S = 83
            D = 68
            Space = 32
            */

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());

                ballList.add(new Ball());

                System.out.println(points);

                if(e.getKeyCode() == 32){
                    dropping = true;
                    if(ballList.get(ballList.size()-2).getColor() == Color.RED){
                        if(ballList.get(ballList.size()-2).getY() < redPit.getY() + redPit.getH() && ballList.get(ballList.size()-2).getY() > redPit.getY()){
                            points++;
                        }
                    }else{
                        if(ballList.get(ballList.size()-2).getY() < bluePit.getH() + bluePit.getY() && ballList.get(ballList.size()-2).getY() > bluePit.getY()){
                            points++;
                        }
                    }
                }
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("(" + e.getX() + "," + e.getY() + ")");
            }
        });

    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        redPit.draw(g);
        bluePit.draw(g);

        for(int i = 0; i < ballList.size(); i++){
            ballList.get(i).draw(g);
        }

        ball.draw(g);

        g.setColor(new Color(100,100,100));
        g.fillRect(170,20,40,40);

        g.setColor(Color.BLACK);
        g.drawString("Points: " + points, 50,50);

        g.drawString((int)timer + " seconds left",50,100);

        timer -= 0.01;

        if(timer == 10){
            ballList.get(ballList.size()-1).setSpeed(ballList.get(ballList.size()-1).getSpeed()*2);
        }

        if(timer % 5 == 0){
            redPit.setH(redPit.getH()-50);
            bluePit.setH(bluePit.getH()-50);
        }

        if(timer == 0){
            g.setColor(Color.WHITE);
            g.drawRect(100,350,200,100);
            g.setColor(Color.BLACK);
            g.drawString("Time is up! Your final score was " + points + " points. Restart to try aagin.", 150,380);
        }

        if(dropping) {
            ballList.get(ballList.size()-1).drop();
            for(int i = 0; i < ballList.size()-1; i++){
                ballList.get(i).setColor(new Color(0,0,0,0));
            }
        }

        //pausing the computer
        try {
            Thread.sleep(10);
        }
        catch(Exception e){

        }

        //looping paintComponent
        repaint();
    }

}
