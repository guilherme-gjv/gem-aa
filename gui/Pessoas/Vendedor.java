package gui.Pessoas;

public class Vendedor extends Funcionario {
    
    int numeroDeVendas;

    public Vendedor(){
        numeroDeVendas = 0;
    }
    public void exibirVendedor(){
        exibir();
        exibirFuncionario();
        System.out.println("Número de vendas: "+ numeroDeVendas+"\n");
        
    }
    public void novaVenda(){
        numeroDeVendas++;
    }
    public int getNumeroDeVendas(){
        return numeroDeVendas;
    }
}
