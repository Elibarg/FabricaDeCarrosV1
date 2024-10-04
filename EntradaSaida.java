import javax.swing.JOptionPane; 

public class EntradaSaida 
{
    public static String solicitarModelo()
    {
        String modeloCarro;
        modeloCarro = JOptionPane.showInputDialog(null, "Informe o modelo do carro:");
        return modeloCarro;
    }
    public static String solicitarCor()
    {
        String corCarro;
        corCarro = JOptionPane.showInputDialog(null, "Informe a cor do carro:");
        return corCarro;
    }    
}
