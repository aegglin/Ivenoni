
import javax.swing.JFrame;

public class GameWindow extends JFrame implements Runnable{

    public final int SCREEN_WIDTH = 800;
    public final int SCREEN_HEIGHT = 600;

    public boolean isRunning;
    private Thread gameThread;

    public GameWindow() {
        this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        this.setTitle("Ivenoni");
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        isRunning = false;
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        double lastFrameTime = 0.0;

        while(gameThread != null) {
            double time = Time.getTime();
            double deltaTime = time - lastFrameTime;
            lastFrameTime = time;
            update(deltaTime);
        }
        this.dispose();
    }
}
