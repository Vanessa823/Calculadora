
package calculadora2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Color;

import operaciones.Sumar;
import operaciones.Restar;
import operaciones.Multiplicar;
import operaciones.Dividir;
/**
 *
 * @author hp
 */
public class Calculadora extends JPanel{	
        public int elecc=0;
	public double numero1=0;
	public double numero2=0;
	public double Resultado=0;
	
	public JTextArea txtOperar=new JTextArea();
	public JTextArea txtResultado=new JTextArea();
	public JTextArea txtOperador=new JTextArea();
	public JButton btnSuma=new JButton("+");
        public JButton btnRestar=new JButton("-");
	public JButton btnMultiplicar=new JButton("*");
	public JButton btnDividir=new JButton("/");
	public JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnCE,btnIgual;
	public Font Fuente=new Font(Font.SERIF,Font.ITALIC,30);
	public JTextArea txtRelleno=new JTextArea();
        
	Calculadora(){
		setLayout(null);
		
		txtRelleno.setBounds(40,50,70,40);
		txtRelleno.setFocusable(false);
		
		txtOperar.setBounds(180, 50, 140, 40);
		txtOperar.setFont(Fuente);
		txtOperar.setFocusable(false);
		
		txtResultado.setBounds(40, 10, 280, 40);
		txtResultado.setFont(Fuente);
		txtResultado.setFocusable(false);
		
		txtOperador.setBounds(110, 50, 70, 40);
		txtOperador.setFont(Fuente);
		txtOperador.setFocusable(false);
		
		btn1=new JButton("1");
		btn1.setBounds(40, 100, 60, 60);
                btn1.setBackground(Color.LIGHT_GRAY);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperar.append("1");
			}
		});
		
		btn2=new JButton("2");
		btn2.setBounds(110, 100, 60, 60);
                btn2.setBackground(Color.LIGHT_GRAY);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperar.append("2");
			}
		});
		
		btn3=new JButton("3");
		btn3.setBounds(180, 100, 60, 60);
                btn3.setBackground(Color.LIGHT_GRAY);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperar.append("3");
			}
		});
		
		btn4=new JButton("4");
		btn4.setBounds(40, 170, 60, 60);
                btn4.setBackground(Color.LIGHT_GRAY);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperar.append("4"); 
			}
		});
		
		btn5=new JButton("5");
		btn5.setBounds(110, 170, 60, 60);
                btn5.setBackground(Color.LIGHT_GRAY);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperar.append("5");
			}
		});
		
		btn6=new JButton("6");
		btn6.setBounds(180, 170, 60, 60);
                btn6.setBackground(Color.LIGHT_GRAY);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperar.append("6");
			}
		});
		
		btn7=new JButton("7");
		btn7.setBounds(40,240, 60, 60);
                btn7.setBackground(Color.LIGHT_GRAY);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperar.append("7");
			}
		});
		
		btn8=new JButton("8");
		btn8.setBounds(110, 240, 60, 60);
                btn8.setBackground(Color.LIGHT_GRAY);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperar.append("8");
			}
		});
		
		btn9=new JButton("9");
		btn9.setBounds(180, 240, 60, 60);
                btn9.setBackground(Color.LIGHT_GRAY);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperar.append("9");
			}
		});
		
		btn0=new JButton("0");
		btn0.setBounds(110, 310, 60, 60);
                btn0.setBackground(Color.LIGHT_GRAY);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperar.append("0");
			}
		});
		
		btnCE=new JButton("CE");
		btnCE.setBounds(40, 310, 60, 60);
                btnCE.setBackground(Color.ORANGE);
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperar.setText("");
				txtResultado.setText("");
				txtOperador.setText("");
				Resultado=0;
				numero1=0;
				numero2=0;
				elecc=0;
			}
		});
		
		btnIgual=new JButton("=");
		btnIgual.setBounds(180, 310, 60, 60);
                btnIgual.setBackground(Color.YELLOW);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					numero1=Resultado;
					numero2=Double.parseDouble(txtOperar.getText());
					if(elecc!=0) {
						Resultado=elecciones(elecc,Resultado,numero1,numero2);
					}
					txtOperar.setText("");
					txtResultado.setText(""+Resultado);
					txtOperador.setText("");
					elecc=0;
				}catch(Exception ex) {
					txtOperador.setText("");
				}
			}
		});
		
		btnSuma.setBounds(260, 100, 60, 60);
                btnSuma.setBackground(Color.YELLOW);
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					numero1=Resultado;
					numero2=Double.parseDouble(txtOperar.getText());
					if(elecc!=0) {
						Resultado=elecciones(elecc,Resultado,numero1,numero2);
					}else {
						Resultado=numero2;
					}
					txtOperar.setText("");
					txtResultado.setText(""+Resultado);
					elecc=1;
					txtOperador.setText("+");
				}catch(Exception ex) {
					elecc=1;
					txtOperador.setText("+");
				}
				
			}
		});
		
		btnRestar.setBounds(260,170,60,60);
                btnRestar.setBackground(Color.YELLOW);
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					numero1=Resultado;
					numero2=Double.parseDouble(txtOperar.getText());
					if(elecc!=0) {
						Resultado=elecciones(elecc,Resultado,numero1,numero2);
					}else {
						Resultado=numero2;
					}
					txtOperar.setText("");
					txtResultado.setText(""+Resultado);
					elecc=2;
					txtOperador.setText("-");
				}catch(Exception ex) {
					elecc=2;
					txtOperador.setText("-");
				}
			}
		});
		
		btnMultiplicar.setBounds(260, 240, 60, 60);
                btnMultiplicar.setBackground(Color.YELLOW);
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					numero1=Resultado;
					numero2=Double.parseDouble(txtOperar.getText());
					if(elecc!=0) {
						Resultado=elecciones(elecc,Resultado,numero1,numero2);
					}else {
						Resultado=numero2;
					}
					txtOperar.setText("");
					txtResultado.setText(""+Resultado);
					elecc=3;
					txtOperador.setText("*");
				}catch(Exception ex) {
					elecc=3;
					txtOperador.setText("*");
				}
			}
		});
		
		btnDividir.setBounds(260, 310, 60, 60);
                btnDividir.setBackground(Color.YELLOW);
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					numero1=Resultado;
					numero2=Double.parseDouble(txtOperar.getText());
					if(elecc!=0) {
						Resultado=elecciones(elecc,Resultado,numero1,numero2);
					}else {
						Resultado=numero2;
					}
					txtOperar.setText("");
					txtResultado.setText(""+Resultado);
					elecc=4;
					txtOperador.setText("/");
				}catch(Exception ex) {
					elecc=4;
					txtOperador.setText("/");
				}
			}
		});
		 
		add(btnSuma);
		add(txtOperar);
		add(txtResultado);
		add(btnRestar);
		add(btnMultiplicar);
		add(btnDividir);
		add(txtOperador);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		add(btn0);
		add(btnCE);
		add(btnIgual);
		add(txtRelleno);
	}
	
	public double elecciones(int el,double resultado,double num1,double num2) {
		if(el==1) {
			Sumar S=new Sumar();
			resultado=S. sumar(num1,num2,resultado);
		}
		if(el==2) {
			Restar R=new Restar();
			resultado=R.restar(num1, num2, resultado);
		}
		if(el==3) {
			Multiplicar M=new Multiplicar();
			resultado=M.multiplicar(num1, num2, resultado);
		}
		if(el==4) {
                        
			Dividir D=new Dividir();
			resultado=D.dividir(num1, num2, resultado);
		}
		return resultado;
	}
}
