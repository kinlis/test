package projekt.v2;
import java.awt.EventQueue;

public class ProjektV2 {

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                new KamienPapierNozyceMenu();
            }
        });

    }
    
}
