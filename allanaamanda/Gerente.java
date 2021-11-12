import java.util.Scanner;

public class Gerente  extends Funcionario{
    private String departamento;
	private float gratificacao;
	
	private Scanner entrada = new Scanner(System.in);

    public Gerente(){
        System.out.println("Digite o departamento ");
        departamento = entrada.nextLine();
        
        System.out.println("digite o valor da gratificação");
        gratificacao = entrada.nextFloat();
    }

    public void mostrarGerente(){
        System.out.println("Departamento "+ departamento + "\nGratificação "+gratificacao);
    }

    public float valortotalGerente(){
        float total;
        total = gratificacao + getSalario();
        return total;
    }
}
