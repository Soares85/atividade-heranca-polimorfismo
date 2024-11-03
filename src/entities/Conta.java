package entities;

public class Conta {

    private Integer contaNumero;
    private String titular;
    protected Double saldo;

    public Conta() {
    }

    public Conta(Integer contaNumero, String titular, Double saldo) {
        this.contaNumero = contaNumero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getContaNumero() {
        return contaNumero;
    }

    public void setContaNumero(Integer contaNumero) {
        this.contaNumero = contaNumero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void saque(double valor){
        saldo -= valor + 5.0;
    }

    public void deposito(double valor){
        saldo += valor;
    }

}
