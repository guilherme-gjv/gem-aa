import java.util.Scanner;

public class Vendedor extends Funcionario {
    Scanner entrada = new Scanner(System.in);
    private int vendas;

    public Vendedor(){
        System.out.println("Digite o número de vendas ");
        vendas = entrada.nextInt();
    }   
    public void atualizarVendas(){
        System.out.println("Digite o número de vendas ");
        vendas = entrada.nextInt();
    }
    public void mostrarVendedor(){
        mostrarPessoa();
        mostrarFuncionario();
        System.out.println("Numero de Vendas "+vendas);
    }
}
