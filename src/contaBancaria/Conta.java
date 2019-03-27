package contaBancaria;

public class Conta {
	private long numero;
	private String nome;
	private double saldo;
	private double limite;
	
	public Conta(long nr, String no, double s, double l){
		numero = nr;
		nome = no;
		saldo = s;
		limite = l;
	}
		
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public boolean sacar(double vrSaq){
		boolean sacou = false;
		if(vrSaq <= (saldo + limite)){
			saldo -= vrSaq;
			sacou = true;
		}
		return sacou;
	}
	public void depositar(double vrDep){
		saldo += vrDep;
	}
	@Override
	public String toString() {
		return "Conta [nun=" + numero + ", nome=" + nome + ", \nsaldo=R$" + saldo + "0, limite=R$" + limite + "0 ]";
	}
}
