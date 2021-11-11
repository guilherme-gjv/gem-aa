import java.util.Scanner;

public class Endereco {
    private String cidade;
    private int CEP;
    Scanner entrada = new Scanner(System.in);

    public Endereco(String cidade, int CEP){
        this.cidade = cidade;
        this.CEP = CEP;
    }
    public Endereco(){
        System.out.println("Digite a Cidade da Pessoa: ");
        cidade = entrada.nextLine();
        System.out.println("Digite o CEP da Pessoa: ");
        CEP = entrada.nextInt();
    }
    public void mostrarEndereco(){
        System.out.println("Cidade "+ cidade +"\nCEP "+ CEP);
    }
}
