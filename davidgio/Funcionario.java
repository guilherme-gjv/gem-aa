package davidgio;
public class Funcionario extends Individuos{
    //INVIVIDUO, salario, ENDEREÇO,departamento
    private float salario;
    private String departamento;
    public Funcionario(){
        System.out.println("Digite o salário ");
        salario = l.nextFloat();
        System.out.println("Departamento ");
        departamento = l1.nextLine();
    }
    public void exibirFunc(){
        exibirEnd();
        exibirIndividuo();
        System.out.println("Salário - "+salario);
        System.out.println("Departamento - "+departamento);
    }
    public void atSalario(){
        System.out.println("Atualizar Salário. Novo salário: ");
        salario = l.nextFloat();
    }
    public float getSalario(){
        return salario;
    }
}
