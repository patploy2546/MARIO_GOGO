import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class Menu extends JPanel {
    private static final long serialVersionUID = 1L;
    public long point;
    
    public Menu() {
        //----
    }
    
    public Menu(long point, ActionListener main) {
        try {
            this.point = point;
            this.setBackground(new Color(241, 98, 69));
            this.setBounds(0,0,1000,600);
            this.setFocusable(true);
            this.setLayout(null);
            
            EleLabel status = new EleLabel("You Died!!", 80, 380, 100, 200, 100);
            status.setForeground(Color.white);
            status.setFont(Element.getFont(40));
             
            EleLabel showPoint = new EleLabel("Total : " + this.point, 40, 420, 200, 200, 100);
            showPoint.setForeground(Color.white);
            showPoint.setFont(Element.getFont(20));
            
            EleButton restart = new EleButton("restart", 150, 380, 300, 200, 50);
            restart.addActionListener(main);
            restart.setFont(Element.getFont(20));
            
            this.add(showPoint);
            this.add(status);
            this.add(restart);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
