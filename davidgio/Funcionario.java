package davidgio;
public class Funcionario extends Endereco{
    //INVIVIDUO, salario, ENDEREÇO,departamento
    protected float salario;
    protected String departamento;
    public Funcionario(){
        System.out.println("Digite ");
        salario = l.nextFloat();
        System.out.println("Departamento ");
        departamento = l1.nextLine();
    }
}
