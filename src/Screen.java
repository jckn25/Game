import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Screen extends JPanel {

    Brainrot tralalero = new Brainrot(100, 520,50, 10,new Color(62, 169, 213));

    Bombardiro bombardiro = new Bombardiro(10,70,50,10,new Color(39, 112, 11));

    ArrayList<Bomb> bombList = new ArrayList<Bomb>();

    public Screen(){

        setFocusable(true);

        //bombList.add(new Bomb());

         /* Key codes
            Left arrow = 37
            Up arrow = 38
            Right arrow = 39
            Down arrow = 40
            W = 87
            A = 65
            S = 83
            D = 68 */
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println(e.getKeyCode());

                int num = e.getKeyCode();
                if(num == 37){
                    System.out.println("Bomardiro going left");
                    bombardiro.moveLeft();
                }
                if(num == 39){
                    System.out.println("Bombardiro going right");
                    bombardiro.moveRight();
                }

                if(num == 65){
                    System.out.println("Tralalero moving left");
                    tralalero.moveLeft();
                }
                if(num == 68){
                    System.out.println("Tralalero moving right");
                    tralalero.moveRight();
                }

                if(num == 40){
                    System.out.println("Bombardiro bombing gaza");
                    bombList.add(new Bomb());

                    bombList.get(bombList.size() - 1).setColor(Color.BLACK);

                    bombList.get(bombList.size() - 1).setX(bombardiro.getX());
                    bombList.get(bombList.size() - 1).setY(bombardiro.getY());

                    //for(int i = 0; i < 100; i++) {
                    //    bombList.get(bombList.size() - 1).drop();
                    //}

                    bombList.get(bombList.size() - 1).setColor(new Color(0,0,0,0));
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

        tralalero.draw(g);

        bombardiro.draw(g);

        for(int i = 0; i < bombList.size(); i++) {
            bombList.get(bombList.size() - 1).draw(g);
        }

        bombList.get(bombList.size() - 1).drop();

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
