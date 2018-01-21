package projekt.v2;

import java.util.Random;
import javax.swing.JPanel;
import java.awt.BorderLayout;


public class AI {
    
    private JPanel rightPanel = new JPanel(new BorderLayout());
    private int wynikLosu;
    
    public int los(){
        Random rng = new Random();
            wynikLosu = rng.nextInt(3) + 1;
        
        return wynikLosu;
    }
    
    public void AIKamien(Okienko frame){
        
        addPicture kamienAI = new addPicture("kamienPrawa.jpg");
        
        rightPanel.add(kamienAI,BorderLayout.NORTH);
        frame.add(rightPanel);
    }
    public void AIPapier(Okienko frame){
        
        addPicture papierAI = new addPicture("papierPrawa.jpg");
        
        rightPanel.add(papierAI,BorderLayout.NORTH);
        frame.add(rightPanel); 
    }
    
    public void AINozyce(Okienko frame){
        
        addPicture nozyceAI = new addPicture("nozycePrawa.jpg");
        
        rightPanel.add(nozyceAI,BorderLayout.NORTH);
        frame.add(rightPanel);
    }
    
}
