import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Player {

    public BufferedImage image;

    public Player() {
        try {
            image = ImageIO.read(new File("/res/player/player.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void loadImage() {

    }

}
