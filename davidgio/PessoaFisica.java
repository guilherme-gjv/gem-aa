package davidgio;
public class PessoaFisica extends Pessoa {
    String profissao;
    //endereço, individuo, profissao
    public PessoaFisica(){
        System.out.println("Qual é a profissão? ");
        profissao = l.nextLine();
    }
}
