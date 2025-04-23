import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLOutput;

public class Screen extends JPanel {

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
            D = 68 */
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println(e.getKeyCode());
                int num = e.getKeyCode();
                if(num == 37){
                    System.out.println("Bomardiro going left");
                }
                if(num == 39){
                    System.out.println("Bombardiro going right");
                }
                if(num == 40){
                    System.out.println("Bombardiro bombing gaza");
                }

                if(num == 65){
                    System.out.println("Tralalero moving left");
                }
                if(num == 68){
                    System.out.println("Tralalero moving right");
                }
            }
        });
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

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
