package entities;

public class ContaEmpresa extends Conta {

    private Double emprestimoLimite;

    public ContaEmpresa() {
        super();
    }

    public ContaEmpresa(Integer contaNumero, String titular, Double saldo, Double emprestimoLimite) {
        super(contaNumero, titular, saldo);
        this.emprestimoLimite = emprestimoLimite;
    }

    public Double getEmprestimoLimite() {
        return emprestimoLimite;
    }

    public void setEmprestimoLimite(Double emprestimoLimite) {
        this.emprestimoLimite = emprestimoLimite;
    }

    public void emprestimo(double valor){
        if(valor <= emprestimoLimite){
            saldo += valor  - 10.0;
        }
    }

    @Override
    public void saque(double valor){
        super.saque(valor);
        saldo -= 2.00;
    }

}
