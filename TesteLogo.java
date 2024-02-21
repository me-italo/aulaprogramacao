import javax.swing.JFrame;

public class TesteLogo {
    public static void main(String[] args){ 
        LogoIF exibicao = new LogoIF();
        exibicao.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        exibicao.setSize(260, 180);
        exibicao.setVisible(true);
    }
    
}
