package gui.Produtos;

import java.util.Scanner;

public class Produto {
    private String nome;
    private int codigo, quantidadeEstoque;
    private float preco;
    private String tipoDeProduto;
    protected Scanner numLeitor = new Scanner(System.in);
    protected Scanner strLeitor = new Scanner(System.in);

    public Produto(String tipoDeProduto){
        this.tipoDeProduto = tipoDeProduto;
        setDados();
    }
    private void setDados(){
        System.out.println("Nome do produto: ");
        nome = strLeitor.nextLine();
        System.out.println("Código: ");
        codigo = numLeitor.nextInt();
        System.out.println("Quantidade em estoque: ");
        quantidadeEstoque = numLeitor.nextInt();
        System.out.println("Preço: ");
        preco = numLeitor.nextFloat();
    }
    public void updateDados(){
        setDados();
    }
    public void showProduto(){
        System.out.println("Tipo do Produto: "+tipoDeProduto);
        System.out.println("Nome: "+nome);
        System.out.println("Código: "+codigo);
        System.out.println("Quantidade em estoque: "+quantidadeEstoque);
        System.out.println("Preço: "+preco);
    }
    public float venda(){
        if(quantidadeEstoque>0){
           quantidadeEstoque--; 
           System.out.println("Venda finalizada.");
           return preco;
        }else{
            System.out.println("Produto sem estoque.");
            return 0;
        }
    }
    public int getCodigo(){
        return codigo;
    }
    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }
    public float getPreco(){
        return preco;
    }
    public String getNome(){
        return nome;
    }
}
