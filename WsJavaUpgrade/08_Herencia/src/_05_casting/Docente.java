package _05_casting;

public class Docente extends Persona {

	public double salario;
	
	public double calcularSalarioNeto() {
		double salarioNeto = this.salario*0.85;
		return salarioNeto;
	}

}
