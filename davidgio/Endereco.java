package davidgio;
import java.util.Scanner;

public class Endereco{
    protected Scanner l = new Scanner(System.in);
    protected Scanner l1 = new Scanner(System.in);
    protected String cidade;
    protected int CEP;

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