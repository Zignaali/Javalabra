import java.awt.event.*;
import javax.swing.*;

public class ValikonKuuntelija implements ActionListener {
    Ikkuna ikkuna;
    
    public ValikonKuuntelija(Ikkuna ikkuna) {
        this.ikkuna = ikkuna;
    }
    public void actionPerformed(ActionEvent tapahtuma) {
        String valinta = ((JMenuItem)tapahtuma.getSource()).getText();
        if (valinta.equals("Uusi peli")) {
            ikkuna.uusi();
        }
        if (valinta.equals("Sulje")) {
            ikkuna.sulje();
        }
    }
    
}
