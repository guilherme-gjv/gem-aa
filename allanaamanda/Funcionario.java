import java.util.Scanner;

public class Funcionario extends Pessoa {
    private float salario;
    private String setor;
    Scanner entrada = new Scanner(System.in);

    public Funcionario(){
        System.out.println("Digite o salário ");
        salario = entrada.nextFloat();
        System.out.println("Digite o setor ");
        setor = entrada.nextLine();
    }

    public void mostrarFuncionario(){
        System.out.println("Salário "+ salario + "\nSetor "+setor);
    }
    protected float getSalario(){
        return salario;
    }
}
