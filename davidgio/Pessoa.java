package davidgio;

public class Pessoa extends Endereco{
    //ENDEREÇO, telefone,valor ja comprado
    protected int telefone;
    protected float valorJaComprado;
    public Pessoa(){
        setPessoa();
    }
    private void setPessoa(){
        System.out.println("Digite o telefone ");
        telefone = l.nextInt();
        System.out.println("Digite o valor já comprado ");
        valorJaComprado = l.nextFloat();
    }
}
