package projekt.v2;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class KamienPapierNozyceMenu implements ActionListener {
    private addPicture obraz;
    private JButton przycisk1,przycisk2,przycisk3;
    
    public KamienPapierNozyceMenu(){
        Okienko okno = new Okienko();
        przycisk1 = new JButton("Kamien");
        przycisk2 = new JButton("Nozyce");
        przycisk3 = new JButton("Papier");
        
        przycisk1.addActionListener(this);
        przycisk2.addActionListener(this);
        przycisk3.addActionListener(this);
        
        obraz = new addPicture("title.jpg");
        
        JPanel panel = new JPanel( new BorderLayout() );
        JPanel topPanel = new JPanel();
        JPanel middlePanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        
        topPanel.add(new JLabel("Dokonaj wyboru..."));
        
        middlePanel.add(obraz);
        
        bottomPanel.add(przycisk1);
        bottomPanel.add(przycisk2);
        bottomPanel.add(przycisk3);
        
        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(middlePanel, BorderLayout.CENTER);
        panel.add(bottomPanel, BorderLayout.SOUTH);
        okno.add(panel);
    }
    
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        Wybor wybor = new Wybor();
        
        if(source == przycisk1){
            wybor.wyborKamien();
        }
        if(source == przycisk2){
            wybor.wyborNozyce();
            
        }
        if(source == przycisk3){
            wybor.wyborPapier();
            
        }
    }
    
}
