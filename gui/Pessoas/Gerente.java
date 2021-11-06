package gui.Pessoas;

import java.util.Scanner;

public class Gerente extends Funcionario {
    private float gratificacao;
    private String departamento;

    private Scanner strLeitor = new Scanner(System.in);
    private Scanner numLeitor = new Scanner(System.in);

    public Gerente(){
        setGerente();
    }
    private void setGerente(){
        System.out.println("Valor da Gratificação: ");
        gratificacao = numLeitor.nextFloat();
        System.out.println("Departamento: ");
        departamento = strLeitor.nextLine();
    }
    public void exibirGerente(){
        exibir();
        exibirFuncionario();
        System.out.println("Valor da Gratificação: "+gratificacao);
        System.out.println("Departamento: "+departamento);
    
    }
    public float getGratificacao(){
        return gratificacao;
    }
    public String getDepartamento(){
        return departamento;
    }
}
