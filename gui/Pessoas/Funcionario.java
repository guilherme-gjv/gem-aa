package gui.Pessoas;

import java.util.*;

public abstract class Funcionario extends Pessoa{
    private float salario;
    private String setor;

    private Scanner strLeitor = new Scanner(System.in);
    private Scanner numLeitor = new Scanner(System.in);
    
    public Funcionario(){
        super();
        setFuncionario();
    }
    private void setFuncionario() {
        System.out.println("Salário: ");
        salario = numLeitor.nextFloat();
        System.out.println("Setor: ");
        setor = strLeitor.nextLine();
    }
    public void exibirFuncionario(){
        exibir();
        System.out.println("Salário: "+salario);
        System.out.println("Setor: "+ setor);
    }
    public void updateFuncionario(){
        updatePessoa();
        setFuncionario();
    }
    
    
    public float getSalario(){
        return salario;
    }
    public String getSetor(){
        return setor;
    }

}
