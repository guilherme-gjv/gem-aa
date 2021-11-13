package davidgio;
public class Funcionario extends Endereco{
    //individuo, salario, endereco,departamento
    protected float salario;
    protected String departamento;
    public Funcionario(){
        System.out.println("Digite ");
        salario = l.nextFloat();
        System.out.println("Departamento ");
        departamento = l1.nextLine();
    }
}
