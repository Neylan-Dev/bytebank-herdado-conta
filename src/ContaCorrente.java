
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;  
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		if(valor>0) {
			super .saldo += valor;
		}else {
			System.out.println("O valor de deposito não pode ser negativo");
		}
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	

}
