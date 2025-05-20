import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,800);

        Screen screen = new Screen();
        screen.setBackground(new Color(187, 193, 193));

        frame.add(screen);
        frame.setVisible(true);

    }
}