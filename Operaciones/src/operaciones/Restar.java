package operaciones;

public class Restar {
	double num1,num2,resultado;
	public Restar(){
	}
	public double restar(double num1,double num2,double resultado) {
		this.num1=num1;
		this.num2=num2;
		this.resultado=resultado;
		resultado=num1-num2;
		return resultado;
	}
}
