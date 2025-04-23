import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,600);

        Screen screen = new Screen();
        screen.setBackground(new Color(132, 250, 255));

        frame.add(screen);
        frame.setVisible(true);

    }
}