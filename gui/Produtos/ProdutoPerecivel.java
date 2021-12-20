package gui.Produtos;

import java.time.LocalDate;
import java.time.Period;

public class ProdutoPerecivel extends Produto{
    private LocalDate dataDeFabricacao;
    private int tempoDeValidade = 0;
    private LocalDate dataDeValidade;
    private String status;
    
    //private 
    public ProdutoPerecivel(){
        super("Produto Perecível");
        setProdutoPerecivel();
    }
    public void updateProdutoPerecivel(){
        updateDados();
        setProdutoPerecivel();
    }
    private void setProdutoPerecivel(){
        System.out.println("Data de fabricação ");
        System.out.println("Dia: ");
        int dia = numLeitor.nextInt();
        System.out.println("Mes: ");
        int mes = numLeitor.nextInt();
        System.out.println("Ano: ");
        int ano = numLeitor.nextInt();
        dataDeFabricacao = LocalDate.of(ano, mes, dia);

       
        while(tempoDeValidade > 7 || tempoDeValidade <= 0){
            System.out.println("Tempo de validade (máx 7 dias): ");
            tempoDeValidade = numLeitor.nextInt();
            if(tempoDeValidade > 7 || tempoDeValidade <= 0){
                System.out.println("Tempo de validade incorreto.");
            }
        }
           
        dataDeValidade = dataDeFabricacao.plusDays(tempoDeValidade);
        System.out.println("Validade: " + dataDeValidade);
        
        //  Isso verifica se a data de validade menos a data atual 
        //é negativa. Se sim, significa que o produto está fora de validade.
        if(Period.between(LocalDate.now(),dataDeValidade).isNegative()){
            System.out.println("O produto passou da validade. ");
            status = "fora da validade.";
        }else{
            System.out.println("O produto está na validade. ");
            status = "dentro da validade.";
        }
    }
    public void showProdutoPerecivel(){
        showProduto();
        System.out.println("Data de fabricação: "+dataDeFabricacao);
        System.out.println("Data de validade: "+dataDeValidade);
        System.out.println("Status: "+ status);
    }
}
