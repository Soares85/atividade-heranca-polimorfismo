package entities2;

public class FuncionarioTerceirizado extends Funcionario{

    private Double custoAdicional;

    public FuncionarioTerceirizado() {
        super();
    }

    public FuncionarioTerceirizado(String nome, Integer horasTrabalhadas, Double valorPorHora, Double custoAdicional) {
        super(nome, horasTrabalhadas, valorPorHora);
        this.custoAdicional = custoAdicional;
    }

    public Double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(Double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    @Override
    public double pagamento() {
        super.pagamento();
        return valorPorHora * horasTrabalhadas + (custoAdicional * 1.1);
    }
}
