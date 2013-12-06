package contaBancariaAbstrata;

public abstract class Conta {
	
	protected double saldo;

	public Conta() {
		super();
	}
	
	public void deposita(double valor) {
	    this.saldo += valor;
	 }

	 public void saca(double valor) {
	    this.saldo -= valor;
	 }

	 public double getSaldo() {
	    return this.saldo;
	 }
	
	 public abstract void atualiza(double taxa);
}
