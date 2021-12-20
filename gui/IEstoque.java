package gui;

public interface IEstoque {
//      Estou implementando essa interface, mesmo não 
//  sendo o conceito 100% correto para isso. A interface
//  vai deixar o código mais escalável, se eu precisar
//  adicionar um novo tipo de produto no estoque, eu consigo
//  controlar por aqui.
    public void cadastrarProdutos();
    public void updateProdutos();
    public void consultarProdutos();
    public void deletarProdutos();
    public void removerProdutoForaDaValidade();
    
}
