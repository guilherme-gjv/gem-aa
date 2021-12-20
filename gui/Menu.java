package gui;

import java.util.ArrayList;
import java.util.Scanner;

import gui.Pessoas.*;
import gui.Produtos.*;

public class Menu implements IEstoque {
    Scanner strLeitor = new Scanner(System.in);
    Scanner numLeitor = new Scanner(System.in);

    ArrayList<Vendedor> vendedor = new ArrayList<>();
    ArrayList<Gerente> gerente = new ArrayList<>();
    ArrayList<Pessoa> cliente = new ArrayList<>();

    public ArrayList<Produto> produtos = new ArrayList<>();
    public ArrayList<ProdutoPerecivel> produtosPereciveis = new ArrayList<>();
    public ArrayList<Lampada> lampadas = new ArrayList<>();

    public Menu() {

        int resposta = 0;
        do {
            exibirMenu();
            resposta = numLeitor.nextInt();
            switch (resposta) {
                case 1:
                    venda();// método venda PRECISA ser atualizado.
                    break;
                case 2:
                    cadastroFuncionario();
                    break;
                case 3:
                    cadastroCliente();
                    break;
                case 4:
                    consultaCliente();
                    break;
                case 5:
                    exibirGerentes();
                    break;
                case 6:
                    updateVendedor();
                    break;
                case 7:
                    updateGerente();
                    break;
                case 8:
                    updateCliente();
                    break;
                case 9:
                    exibirDados();
                    break;
                case 10:
                    System.out.println("Saindo...");
                    break;
            }
        } while (resposta != 10);

    }

    private void exibirMenu() {
        System.out.println("1 - Nova Venda");
        System.out.println("2 - Cadastrar Funcionário");
        System.out.println("3 - Cadastro de Cliente");
        System.out.println("4 - Consulta de Cliente");
        System.out.println("5 - Exibir gerentes da empresa"); // todos os gerentes e o total de quanto a empresa paga
                                                              // para eles
        System.out.println("6 - Atualizar dados de um Vendedor"); // perguntar o nome
        System.out.println("7 - Atualizar dados de um Gerente");// perguntar o nome
        System.out.println("8 - Atualizar dados de um Cliente");
        System.out.println("9 - Exibir Dados de Vendedores ou Gerentes");
        System.out.println("10 - Sair");
        System.out.println("Digite... ");
    }

    private void venda() {

        System.out.println("Funcionário da venda: ");
        if (vendedor.isEmpty()) {
            System.out.println("Cadastre um Vendedor antes de fazer uma venda! ");
        } else {
            vendedor.get(pesquisaPessoa(1)).novaVenda();
        }

    }

    private void cadastroFuncionario() {
        int tipo;
        System.out.println("Digite o tipo: \n1 - Vendedor;\n2 - Gerente;");
        tipo = numLeitor.nextInt();
        switch (tipo) {
            case 1:
                Vendedor v = new Vendedor();
                vendedor.add(v);
                break;
            case 2:
                Gerente g = new Gerente();
                gerente.add(g);
                break;
        }
    }

    private void cadastroCliente() {
        Pessoa novoCliente = new Pessoa();
        cliente.add(novoCliente);
    }

    private void consultaCliente() {
        System.out.println("Pesquisar Cliente");
        int i = pesquisaPessoa(3);
        if (i == -1) {
            System.out.println("Não encontrado! ");
        } else {
            cliente.get(i).exibir();
        }

    }

    private void exibirGerentes() {
        float somaSalarios = 0;
        for (int i = 0; i < gerente.size(); i++) {
            somaSalarios = gerente.get(i).exibirGerente() + somaSalarios;
        }
        System.out.println("A empresa paga " + somaSalarios + " para todos os Gerentes");
    }

    private void updateVendedor() {
        System.out.println("Atualizar Vendedor ");
        int i = pesquisaPessoa(1);
        if (i == -1) {
            System.out.println("Não encontrado! ");
        } else {
            vendedor.get(i).updateFuncionario();
        }

    }

    private void updateGerente() {

        System.out.println("Atualizar Gerente ");
        int i = pesquisaPessoa(2);
        if (i == -1) {
            System.out.println("Não encontrado! ");
        } else {
            gerente.get(i).updateFuncionario();
        }

    }

    private void updateCliente() {
        System.out.println("Atualizar Cliente ");
        int i = pesquisaPessoa(3);
        if (i == -1) {
            System.out.println("Não encontrado! ");
        } else {
            cliente.get(i).updatePessoa();
        }

    }

    private void exibirDados() {
        int tipo = 0, escolha = 0;
        System.out.println("Como quer exibir?");
        System.out.println("\n1 - Exibir todos\n2 - Tudo de uma categoria específica");
        System.out.println("3 - Uma pessoa específica");
        escolha = numLeitor.nextInt();
        switch (escolha) {
            case 1:
                for (int i = 0; i < vendedor.size(); i++) {
                    vendedor.get(i).exibirVendedor();
                }

                exibirGerentes();

                for (int i = 0; i < cliente.size(); i++) {
                    cliente.get(i).exibir();
                }
                break;
            case 2:
                tipo = 0;
                System.out.println("Digite o tipo: \n1 - Vendedor;\n2 - Gerente;\n3 - Cliente; ");
                tipo = numLeitor.nextInt();
                switch (tipo) {
                    case 1:
                        for (int i = 0; i < vendedor.size(); i++) {
                            vendedor.get(i).exibirVendedor();
                        }
                        break;
                    case 2:
                        for (int i = 0; i < gerente.size(); i++) {
                            gerente.get(i).exibirGerente();
                        }
                        break;
                    case 3:
                        for (int i = 0; i < cliente.size(); i++) {
                            cliente.get(i).exibir();
                        }
                        break;
                }
                break;
            case 3:
                tipo = 0;
                System.out.println("Digite o tipo: \n1 - Vendedor;\n2 - Gerente;\n3 - Cliente; ");
                tipo = numLeitor.nextInt();
                int i = 0;
                switch (tipo) {
                    case 1:
                        i = pesquisaPessoa(1);
                        if (i == -1) {
                            System.out.println("Não encontrado!");
                        } else {
                            vendedor.get(i).exibirVendedor();
                        }

                        break;
                    case 2:
                        i = pesquisaPessoa(2);
                        if (i == -1) {
                            System.out.println("Não encontrado!");
                        } else {
                            gerente.get(i).exibirGerente();
                        }

                        break;
                    case 3:
                        consultaCliente();
                        break;
                    default:
                        System.out.println("Tipo inválido! Digite 1, 2 ou 3");
                        break;
                }
                break;
            default:
                System.out.println("Escolha inválida! Digite 1, 2 ou 3");
                break;
        }

    }

    public int pesquisaPessoa(int tipoDePessoa) {
        // Vendedor 1;
        // Gerente 2;
        // Cliente 3;
        String nomePesquisa;
        System.out.println("Digite o nome: ");
        nomePesquisa = strLeitor.nextLine();
        switch (tipoDePessoa) {
            case 1:
                for (int i = 0; i < vendedor.size(); i++) {
                    if (vendedor.get(i).getNome().equalsIgnoreCase(nomePesquisa)) {
                        return i;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < gerente.size(); i++) {
                    if (gerente.get(i).getNome().equalsIgnoreCase(nomePesquisa)) {
                        return i;
                    }
                }
                break;
            case 3:
                for (int i = 0; i < cliente.size(); i++) {
                    if (cliente.get(i).getNome().equalsIgnoreCase(nomePesquisa)) {
                        return i;
                    }
                }
                break;
        }

        System.out.println("Nome não encontrado!");

        return -1;
    }

    @Override
    public void cadastrarProdutos() {
        System.out.println("--Cadastrar produto--");
        System.out.println("Tipo de Produto");
        System.out.println("1 - Produto Simples ");
        System.out.println("2 - Produto Perecível");
        System.out.println("3 - Lâmpada");
        System.out.println("4 - Sair ");
        int escolha = numLeitor.nextInt();
        switch (escolha) {
            case 1:
                Produto p = new Produto("Produto Simples");
                produtos.add(p);
                break;
            case 2:
                ProdutoPerecivel pp = new ProdutoPerecivel();
                produtosPereciveis.add(pp);
                break;
            case 3:
                Lampada l = new Lampada();
                lampadas.add(l);
                break;
            default:
                System.out.println("Cancelando cadastro...");
                break;
        }
    }

    @Override
    public void updateProdutos() {
        System.out.println("--Atualizar produtos--");
        System.out.println("Tipo de Produto");
        System.out.println("1 - Produto Simples ");
        System.out.println("2 - Produto Perecível");
        System.out.println("3 - Lâmpada");
        System.out.println("4 - Sair ");
        int escolha = numLeitor.nextInt();
        int indice;
        switch (escolha) {
            case 1:
                indice = pesquisaProduto(1);
                produtos.get(indice).updateDados();
                break;
            case 2:
                indice = pesquisaProduto(2);
                produtosPereciveis.get(indice).updateProdutoPerecivel();
                break;
            case 3:
                indice = pesquisaProduto(3);
                lampadas.get(indice).updateLampada();
                break;
            default:
                System.out.println("Cancelando cadastro...");
                break;
        }

    }

    @Override
    public void consultarProdutos() {
        // TODO Auto-generated method stub

    }

    @Override
    public void deletarProdutos() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removerProdutoForaDaValidade() {
        // TODO Auto-generated method stub

    }

    private int pesquisaProduto(int tipodeDeProduto) {
        // 1 - Produto Simples
        // 2 - Produto Perecível
        // 3 - Lâmpada
        System.out.println("Digite o código do produto: ");//não coloquei código
        int codigo = numLeitor.nextInt();
        switch (tipodeDeProduto) {
            case 1:
                for(int i = 0; i < produtos.size(); i++ ){
                    if(produtos.get(i).getCodigo() == codigo){
                        return i;
                    }
                }
                break;
            case 2:
                for(int i = 0; i < produtosPereciveis.size(); i++){
                    if(produtosPereciveis.get(i).getCodigo() == codigo){
                        return i;
                    }
                }
                break;
            case 3:
                for(int i = 0; i < produtosPereciveis.size(); i++){
                    if(lampadas.get(i).getCodigo() == codigo){
                        return i;
                    }
                }
                break;
        }
        System.out.println("Produto não encontrado! ");
        return -1;
    }

    public void tchau() {
        System.out.println(" Tchau!! :D "); // fiz essa função para evitar warning no objeto do Menu :)
    }
}
