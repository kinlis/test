package projekt.v2;
import java.awt.image.BufferedImage;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class addPicture extends JPanel {
    private BufferedImage image;
    public addPicture (String sciezka){
        
        File imageFile = new File(sciezka);
        try{
            image = ImageIO.read(imageFile);
        } catch(IOException e){
            System.err.println("Blad Odczytu obrazka");
            e.printStackTrace();
        }
        
        Dimension dimension = new Dimension(image.getWidth(),image.getHeight());
        setPreferredSize(dimension);
    }
    
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image,0,0,this);
    }
    
}
