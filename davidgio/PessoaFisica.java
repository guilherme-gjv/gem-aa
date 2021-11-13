package davidgio;
public class PessoaFisica extends Pessoa {
    private String profissao;
    //ENDEREÇO, INDIVIDUO, profissao
    public PessoaFisica(){
        System.out.println("Qual é a profissão? ");
        profissao = l.nextLine();
    }
    public void exibirPF(){
        exibirEnd();
        exibirIndividuo();
        exibirPessoa();
        System.out.println("Profissão - "+profissao);
    }
}
