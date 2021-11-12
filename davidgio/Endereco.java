package davidgio;
import java.util.Scanner;

public class Endereco{
    Scanner l = new Scanner(System.in);
    Scanner l1 = new Scanner(System.in);
    String cidade;
    int CEP;

    public Endereco(){
        setEnd();
    }
    public void setEnd(){
        System.out.println("Cidade ");
        cidade = l1.nextLine();
        CEP = l.nextInt();
    }
    public void atEnd(){
        System.out.println("Atualizar endereço");
        setEnd();
    }
}