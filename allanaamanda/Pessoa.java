import java.util.Scanner;

public class Pessoa extends Endereco{
    private String nome;
    private int telefone;
    private Scanner entrada = new Scanner(System.in);

    protected Pessoa(String cidade, int CEP, String nome, int telefone){
        super(cidade,CEP);
        this.nome = nome;
        this.telefone = telefone;
    }
    protected Pessoa(){
        System.out.println("\n");
        System.out.println("Digite o nome ");
        nome = entrada.nextLine();
        System.out.println("Digite o telefone ");
        telefone= entrada.nextInt();
    }
    protected void mostrarPessoa(){
        mostrarEndereco();
        System.out.println("Nome "+ nome +"\nTelfone "+ telefone);
    }
    public String getNome(){
        return nome;
    }
    
}
