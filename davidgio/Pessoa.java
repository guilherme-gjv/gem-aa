package davidgio;

public class Pessoa extends Individuos{
    //ENDEREÇO, telefone,valor ja comprado
    private int telefone;
    private float valorJaComprado;
    public Pessoa(){
        setPessoa();
    }
    private void setPessoa(){
        System.out.println("Digite o telefone ");
        telefone = l.nextInt();
        System.out.println("Digite o valor já comprado ");
        valorJaComprado = l.nextFloat();
    }
    protected void exibirPessoa(){
        System.out.println("Telefone - "+telefone);
        System.out.println("valor já comprado - " + valorJaComprado);
    }
    public void atTelefone(){
        System.out.println("Atualizar Telefone. Novo telefone: ");
        telefone = l.nextInt();
    }
}
