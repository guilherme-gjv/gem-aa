public class Cliente extends Pessoa {
    public Cliente(String cidade, int CEP, String nome, int telefone){
        super(cidade, CEP, nome, telefone);
    }
    public Cliente(){
        System.out.println("cliente");
    }
    
}
