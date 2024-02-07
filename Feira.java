import javax.swing.JOptionPane;

public class Feira { 
    public static void main( String[] args ) {

    String legumes = JOptionPane.showInputDialog( "Quantos legumes quer comprar?" );
    String frutas = JOptionPane.showInputDialog( "Quantas frutas quer comprar?" );
    String vegetais = JOptionPane.showInputDialog( "Quantos vegetais quer comprar?");

    int legumesI = Integer.parseInt( legumes );
    int frutasI = Integer.parseInt( frutas );
    int vegetaisI = Integer.parseInt( vegetais );
    
    JOptionPane.showMessageDialog( null, "Legumes: " + legumesI, "Frutas: " + frutasI, "Vegetais: " + vegetaisI, JOptionPane.PLAIN_MESSAGE);
    }
}