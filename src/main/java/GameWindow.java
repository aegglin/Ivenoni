
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Dimension;

public class GameWindow extends JFrame {

    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 600;

    public GameWindow() {
        super();
        GamePanel gamePanel = new GamePanel();
        setTitle("Ivenoni");
        setResizable(false);
        setFocusable(true);
        setLocationRelativeTo(null); //put in center of screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(gamePanel);
        pack();
        setVisible(true);
    }
}

class GamePanel extends JPanel {
    GamePanel () {
        setSize(GameWindow.SCREEN_WIDTH, GameWindow.SCREEN_HEIGHT);
        setFocusable(true);
        setPreferredSize(new Dimension(GameWindow.SCREEN_WIDTH, GameWindow.SCREEN_HEIGHT));
        setBackground(Color.RED);
        setDoubleBuffered(true);
    }
}
