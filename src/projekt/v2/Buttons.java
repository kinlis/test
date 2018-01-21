package projekt.v2;
import javax.swing.JButton;



public class Buttons {
    
    
    private int licznik =0;
    private int iloscPrzyciskow;
    private JButton[] przycisk = new JButton[10];
    
    public Buttons(int ilosc, String[] tresc){
        
        while(licznik < ilosc){
            przycisk[licznik] = new JButton(tresc[licznik]);
            licznik++;
            
        }
        licznik = 0;
        iloscPrzyciskow = ilosc;
     
    }
    
    public void addButtons(){
        Okienko okno = new Okienko();
        while(licznik < iloscPrzyciskow){
         okno.add(przycisk[licznik]); 
         licznik++;
        }
        licznik = 0;
    }
    
       
    
    
}