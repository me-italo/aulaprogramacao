import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LogoIF extends JFrame{
    private JLabel logo;
        
        public LogoIF(){
            super("Logo do IFMT");
            setLayout( new FlowLayout());
        
            Icon imagem = new ImageIcon(getClass().getResource( "if.png"));
            logo = new JLabel();
            logo.setText("INSTITUTO FEDERAL DE EDUCAÇÃO DE MATO GROSSO");
            logo.setIcon(imagem);
            logo.setHorizontalTextPosition (SwingConstants.CENTER);
            logo.setVerticalTextPosition (SwingConstants.BOTTOM);
            logo.setToolTipText("Essa é a logo do IF");
            add(logo);
    }
}