package projekt.v2;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wybor implements ActionListener {
   
    private static int lWygranych =0,lRemisow = 0, lPrzegranych =0;
    private JButton kontynuacja = new JButton("Sproboj jeszcze raz...");
    private addPicture winPicture = new addPicture("win.jpg");
    private addPicture losePicture = new addPicture("lose.jpg");
    private addPicture drawPicture = new addPicture("remis.jpg");
    
    private AI przeciwnik = new AI();
    private Okienko okno;
    
    public void wyborKamien(){
        
        okno = new Okienko();
        
        addPicture stonePicture = new addPicture("kamienLewa.jpg");
        kontynuacja.addActionListener(this);
        
        JPanel northPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JPanel panelu = new JPanel(new BorderLayout());
        JPanel paneld = new JPanel(new BorderLayout());
        
        northPanel.add(stonePicture);
        
        panelu.add(northPanel,BorderLayout.NORTH);
        okno.add(panelu);
        int wylosowanaLiczba = przeciwnik.los();
        
        if(wylosowanaLiczba == 1){
             lRemisow++;
             northPanel.add(drawPicture);
             przeciwnik.AIKamien(okno);
        }
        if(wylosowanaLiczba == 2){
            lPrzegranych++;
            northPanel.add(losePicture);
            przeciwnik.AIPapier(okno);
        }
        if(wylosowanaLiczba == 3){
            lWygranych++;
            northPanel.add(winPicture);
            przeciwnik.AINozyce(okno);
        }
        bottomPanel.add(new JLabel("Liczba wygranych: " +lWygranych),BorderLayout.CENTER);
        bottomPanel.add(new JLabel("Liczba Remisów: " + lRemisow),BorderLayout.CENTER);
        bottomPanel.add(new JLabel("Liczba Przegranych: " + lPrzegranych),BorderLayout.CENTER);
        bottomPanel.add(kontynuacja,BorderLayout.SOUTH);
        paneld.add(bottomPanel);
        
        okno.add(paneld);
    }
    public void wyborPapier(){
        
        okno = new Okienko();
        
        addPicture paperPicture = new addPicture("papierLewa.jpg");
        kontynuacja.addActionListener(this);
        
        JPanel northPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JPanel panelu = new JPanel(new BorderLayout());
        JPanel paneld = new JPanel(new BorderLayout());
        
        northPanel.add(paperPicture);
        
        panelu.add(northPanel,BorderLayout.NORTH);
        okno.add(panelu);
        int wylosowanaLiczba = przeciwnik.los();
        
        if(wylosowanaLiczba == 1){
             lWygranych++;
             northPanel.add(winPicture);
             przeciwnik.AIKamien(okno);
        }
        if(wylosowanaLiczba == 2){
            lRemisow++;
            northPanel.add(drawPicture);
            przeciwnik.AIPapier(okno);
        }
        if(wylosowanaLiczba == 3){
            lPrzegranych++;
            northPanel.add(losePicture);
            przeciwnik.AINozyce(okno);
        }
        bottomPanel.add(new JLabel("Liczba wygranych: " +lWygranych),BorderLayout.CENTER);
        bottomPanel.add(new JLabel("Liczba Remisów: " + lRemisow),BorderLayout.CENTER);
        bottomPanel.add(new JLabel("Liczba Przegranych: " + lPrzegranych),BorderLayout.CENTER);
        bottomPanel.add(kontynuacja,BorderLayout.SOUTH);
        paneld.add(bottomPanel);
        
        okno.add(paneld);
    }
    public void wyborNozyce(){
        
        okno = new Okienko();
        
        addPicture nozycePicture = new addPicture("nozyceLewa.jpg");
        kontynuacja.addActionListener(this);
        
        JPanel northPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JPanel panelu = new JPanel(new BorderLayout());
        JPanel paneld = new JPanel(new BorderLayout());
        
        northPanel.add(nozycePicture);
        
        panelu.add(northPanel,BorderLayout.NORTH);
        okno.add(panelu);
        int wylosowanaLiczba = przeciwnik.los();
        
        if(wylosowanaLiczba == 1){
             lPrzegranych++;
             northPanel.add(losePicture);
             przeciwnik.AIKamien(okno);
        }
        if(wylosowanaLiczba == 2){
            lWygranych++;
            northPanel.add(winPicture);
            przeciwnik.AIPapier(okno);
        }
        if(wylosowanaLiczba == 3){
            lRemisow++;
            northPanel.add(drawPicture);
            przeciwnik.AINozyce(okno);
        }
        bottomPanel.add(new JLabel("Liczba wygranych: " +lWygranych),BorderLayout.CENTER);
        bottomPanel.add(new JLabel("Liczba Remisów: " + lRemisow),BorderLayout.CENTER);
        bottomPanel.add(new JLabel("Liczba Przegranych: " + lPrzegranych),BorderLayout.CENTER);
        bottomPanel.add(kontynuacja,BorderLayout.SOUTH);
        paneld.add(bottomPanel);
        
        okno.add(paneld);
    }
    
    public void actionPerformed(ActionEvent b){
        Object source = b.getSource();
        
        if(source == kontynuacja ){
            okno.dispose();
            
           
            
        }
    }
    
}
