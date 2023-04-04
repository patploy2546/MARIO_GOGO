import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.ImageIcon;

public class Mario {
    public int x;
    public int y;
    public int health = 180;
    public static int jumpHigh = 90;

    private ImageIcon icon;

    public Mario() {
        try {
            icon = new ImageIcon(getClass().getResource("img/mario.gif"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Mario(int x, int y) {
        this.x = x;
        this.y = y;
        try {
            icon = new ImageIcon(getClass().getResource("/img/mario.gif"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void jump(JPanel game) {
        this.y -= jumpHigh;
        game.repaint();
        //--- fall ---
        Timer timer = new Timer(450, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                y += jumpHigh ; 
                game.repaint();
            }
        });
        timer.setRepeats(false); //ตั้งค่าไม่ให้ Timer ลูป
        timer.start();
    }

    public Image getImage() {
        return icon.getImage();
    }
}