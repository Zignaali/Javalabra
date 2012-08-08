
import javax.swing.*;
import java.awt.*;

public class Ikkuna implements Runnable {
    private JFrame ikkuna;
    
    public void run() {            
        ikkuna = new JFrame ("Tetris");
        ikkuna.setPreferredSize(new Dimension (640, 480));
        
        luoValikko();
        
        ikkuna.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ikkuna.pack();
        ikkuna.setVisible(true);
    }
    
    private void luoValikko() {
        JMenuBar valikko = new JMenuBar();
        
        JMenu valikkoPeli = new JMenu("Peli");
        valikko.add(valikkoPeli);
        
        JMenuItem valikkoUusi = new JMenuItem("Uusi peli");
        valikkoUusi.addActionListener(new ValikonKuuntelija(this));
        valikkoPeli.add(valikkoUusi);
        
        JMenuItem valikkoSulje = new JMenuItem("Sulje");
        valikkoSulje.addActionListener(new ValikonKuuntelija(this));
        valikkoPeli.add(valikkoSulje);
        
        JMenuItem valikkoTulokset = new JMenuItem("Tuloslista");
        valikkoTulokset.addActionListener(new ValikonKuuntelija(this));
        valikkoPeli.add(valikkoTulokset);
        
        ikkuna.setJMenuBar(valikko);        
    }         
    
    public String uusi() {
        String nimi = JOptionPane.showInputDialog("Mikä on nimesi?");
        return nimi;
    }
        
    public void sulje() {
        ikkuna.dispose();
    }
       
}
