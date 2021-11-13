package davidgio;
public class Individuos extends Endereco {
    private String nome;
    //nome, ENDEREÇO
    public Individuos(){
        System.out.println("Nome ");
        nome = l1.nextLine();
    }
    public String getNome(){
        return nome;
    }
    public void exibirIndividuo(){
        System.out.println("Nome - "+ nome);
    }
}
