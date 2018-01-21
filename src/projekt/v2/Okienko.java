package projekt.v2;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.ImageIcon;



public class Okienko extends JFrame {
    
    public Okienko(){
        super("Kamien Papier Nozyce");
        
        ImageIcon img = new ImageIcon("Cow-icon.png");
        setIconImage(img.getImage());
        
        setSize(1024,768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);
        setLayout(new FlowLayout(1,10,100));
        
    }
}
