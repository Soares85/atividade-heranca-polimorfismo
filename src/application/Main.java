package application;

import entities2.Funcionario;
import entities2.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Funcionario> lista = new ArrayList<>();

        System.out.print("Insira o número de funcionários: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Dados do funcionário nº: " + (i + 1));
            System.out.println("Terceirizado? (s/n)");
            String valor = in.next();

            System.out.print("Nome: ");
            String nome = in.next();
            System.out.print("Horas trabalhadas: ");
            int horas = in.nextInt();
            System.out.print("Valor por hora: ");
            double valorHora = in.nextDouble();

            if(valor.equalsIgnoreCase("s")){
                System.out.print("Custo adicional: ");
                double custoAdd = in.nextDouble();

                lista.add(new FuncionarioTerceirizado(nome, horas, valorHora, custoAdd));

            } else{
                lista.add(new Funcionario(nome, horas, valorHora));
            }
        }

        System.out.println();
        System.out.println("PAGAMENTOS:");
        for(Funcionario func : lista){
            System.out.println(func.getNome() + " - R$ " + String.format("%.2f", func.pagamento()));
        }

    }
}