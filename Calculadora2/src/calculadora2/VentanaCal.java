package calculadora2;

import javax.swing.JFrame;
/**
 * @author hp
 */
public class VentanaCal {
    public static void main(String[] args) {
		new Ventana();
	}
}
class Ventana extends javax.swing.JFrame{
    Ventana(){
		Calculadora pantalla=new Calculadora();
		setSize(380,500);
		setVisible(true);
		setTitle("Calculadora basica");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		add(pantalla);
	}
    }