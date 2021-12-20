package gui;

import java.util.ArrayList;
import java.util.Scanner;

import gui.Pessoas.*;
import gui.Produtos.*;

public class Menu implements IEstoque {
    private Scanner strLeitor = new Scanner(System.in);
    private Scanner numLeitor = new Scanner(System.in);

    private ArrayList<Vendedor> vendedor = new ArrayList<>();
    private ArrayList<Gerente> gerente = new ArrayList<>();
    private ArrayList<Pessoa> cliente = new ArrayList<>();

    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<ProdutoPerecivel> produtosPereciveis = new ArrayList<>();
    private ArrayList<Lampada> lampadas = new ArrayList<>();

    private float saldoEmCaixa;

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
                    cadastrarProdutos();
                    break;
                case 11:
                    updateCliente();
                    break;
                case 12:
                    consultarProdutos();
                    break;
                case 13:
                    deletarProdutos();
                    break;
                case 14:
                    removerProdutoForaDaValidade();
                    break;
                case 15:
                    verSaldoEmCaixa();
                    break;
                case 16:
                    System.out.println("Saindo...");
                    break;
            }
        } while (resposta != 16);

    }

    private void exibirMenu() {
        System.out.println("1  - Nova Venda");
        System.out.println("2  - Cadastrar Funcionário");
        System.out.println("3  - Cadastro de Cliente");
        System.out.println("4  - Consulta de Cliente");
        System.out.println("5  - Exibir gerentes da empresa"); // todos os gerentes e o total de quanto a empresa os
                                                               // paga
        System.out.println("6  - Atualizar dados de um Vendedor"); // perguntar o nome
        System.out.println("7  - Atualizar dados de um Gerente");// perguntar o nome
        System.out.println("8  - Atualizar dados de um Cliente");
        System.out.println("9  - Exibir Dados de Vendedores ou Gerentes");
        System.out.println("10 - Cadastrar Produtos");
        System.out.println("11 - Atualizar produtos");
        System.out.println("12 - Consultar Produtos");
        System.out.println("13 - Deletar Produtos");
        System.out.println("14 - Remover Produtos fora da validade");
        System.out.println("15 - Ver Saldo em caixa");
        System.out.println("16 - Sair");
        System.out.println("Digite... ");
    }

    private void venda() {

        System.out.println("Funcionário da venda: ");
        if (vendedor.isEmpty()) {
            System.out.println("Cadastre um Vendedor antes de fazer uma venda! ");
        } else {
            vendedor.get(pesquisaPessoa(1)).novaVenda();
            System.out.println("Tipo de Produto");
            System.out.println("1 - Produto Simples ");
            System.out.println("2 - Produto Perecível");
            System.out.println("3 - Lâmpada");
            System.out.println("4 - Cancelar venda ");
            int resposta = numLeitor.nextInt();
            int indice;
            switch (resposta) {
                case 1:
                    indice = pesquisaProduto(1);
                    if(indice == -1){
                        System.out.println("Produto não encontrado! ");
                    }else{
                        saldoEmCaixa = saldoEmCaixa + produtos.get(indice).venda();
                    }
                    break;
                case 2:
                    indice = pesquisaProduto(2);
                    if(indice == -1){
                        System.out.println("Produto não encontrado! ");
                    }else{
                        saldoEmCaixa = saldoEmCaixa + produtosPereciveis.get(indice).venda();
                    }
                    break;
                case 3:
                    indice = pesquisaProduto(3);
                    if(indice == -1){
                        System.out.println("Produto não encontrado! ");
                    }else{
                        saldoEmCaixa = saldoEmCaixa + lampadas.get(indice).venda();
                    }
                    break;
                default:
                    System.out.println("Cancelando venda...");
                    break;
            }
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
                if (indice == -1) {
                    System.out.println("Produto não encontrado! ");
                } else {
                    produtos.get(indice).updateDados();
                }
                break;
            case 2:
                indice = pesquisaProduto(2);
                if (indice == -1) {
                    System.out.println("Produto não encontrado! ");
                } else {
                    produtosPereciveis.get(indice).updateProdutoPerecivel();
                }

                break;
            case 3:
                indice = pesquisaProduto(3);
                if (indice == -1) {
                    System.out.println("Produto não encontrado! ");
                } else {
                    lampadas.get(indice).updateLampada();
                }
                break;
            default:
                System.out.println("Cancelando cadastro...");
                break;
        }

    }

    @Override
    public void consultarProdutos() {
        System.out.println("--Consultar Produtos--");
        System.out.println("1 - Ver tudo");
        System.out.println("2 - Ver Produtos Simples");
        System.out.println("3 - Ver Produtos Perecíveis");
        System.out.println("4 - Ver Lâmpadas");
        System.out.println("5 - Consultar produto específico");
        int resposta = numLeitor.nextInt();
        switch (resposta) {
            case 1:
                for (int i = 0; i < produtos.size(); i++) {
                    produtos.get(i).showProduto();
                    System.out.println(" ");
                }
                for (int i = 0; i < produtosPereciveis.size(); i++) {
                    produtosPereciveis.get(i).showProdutoPerecivel();
                }
                for (int i = 0; i < lampadas.size(); i++) {
                    lampadas.get(i).showLampada();
                }
                break;
            case 2:
                for (int i = 0; i < produtos.size(); i++) {
                    produtos.get(i).showProduto();
                    System.out.println(" ");
                }
                break;
            case 3:
                for (int i = 0; i < produtosPereciveis.size(); i++) {
                    produtosPereciveis.get(i).showProdutoPerecivel();
                }
                break;
            case 4:
                for (int i = 0; i < lampadas.size(); i++) {
                    lampadas.get(i).showLampada();
                }
                break;
            case 5:
                System.out.println("Tipo de Produto");
                System.out.println("1 - Produto Simples ");
                System.out.println("2 - Produto Perecível");
                System.out.println("3 - Lâmpada");
                int reposta2 = numLeitor.nextInt();
                int indice;
                switch (reposta2) {
                    case 1:
                        indice = pesquisaProduto(1);
                        if (indice == -1) {
                            System.out.println("Produto não encontrado! ");
                        } else {
                            produtos.get(indice).showProduto();
                        }
                        break;
                    case 2:
                        indice = pesquisaProduto(2);
                        if (indice == -1) {
                            System.out.println("Produto não encontrado! ");
                        } else {
                            produtosPereciveis.get(indice).showProdutoPerecivel();
                        }
                    case 3:
                        indice = pesquisaProduto(3);
                        if (indice == -1) {
                            System.out.println("Produto não encontrado! ");
                        } else {
                            lampadas.get(indice).showLampada();
                        }
                        break;
                }
                break;
            case 6:
                break;
        }
    }

    @Override
    public void deletarProdutos() {
        System.out.println("--Deletar Produto--");
        System.out.println("Tipo de Produto");
        System.out.println("1 - Produto Simples ");
        System.out.println("2 - Produto Perecível");
        System.out.println("3 - Lâmpada");
        int reposta2 = numLeitor.nextInt();
        int indice;
        switch (reposta2) {
            case 1:
                indice = pesquisaProduto(1);
                if (indice == -1) {
                    System.out.println("Produto não encontrado! ");
                } else {
                    produtos.remove(indice);
                    System.out.println("Produto deletado.");
                }
                break;
            case 2:
                indice = pesquisaProduto(2);
                if (indice == -1) {
                    System.out.println("Produto não encontrado! ");
                } else {
                    produtosPereciveis.remove(indice);
                    System.out.println("Produto deletado.");
                }
            case 3:
                indice = pesquisaProduto(3);
                if (indice == -1) {
                    System.out.println("Produto não encontrado! ");
                } else {
                    lampadas.remove(indice);
                    System.out.println("Produto deletado.");
                }
                break;
        }

    }

    @Override
    public void removerProdutoForaDaValidade() {
        System.out.println("Deseja remover os produtos perecíveis fora da validade do estoque?");
        System.out.println("1 - Sim ");
        System.out.println("2 - Não ");
        int resposta = numLeitor.nextInt();
        switch (resposta) {
            case 1:
                System.out.println("Itens removidos: ");
                for (int i = 0; i < produtosPereciveis.size(); i++) {
                    if (produtosPereciveis.get(i).getStatus().equalsIgnoreCase("fora da validade.")) {
                        System.out.println("Nome: " + produtosPereciveis.get(i).getNome());
                        System.out.println("Código: " + produtosPereciveis.get(i).getCodigo());
                        System.out.println("Produto removido do estoque.\n");
                        produtosPereciveis.remove(i);
                    }
                }
                break;
            default:
                System.out.println("Cancelando operação...");
                break;
        }
    }

    private int pesquisaProduto(int tipodeDeProduto) {
        // 1 - Produto Simples
        // 2 - Produto Perecível
        // 3 - Lâmpada
        System.out.println("Digite o código do produto: ");// não coloquei código
        int codigo = numLeitor.nextInt();
        switch (tipodeDeProduto) {
            case 1:
                for (int i = 0; i < produtos.size(); i++) {
                    if (produtos.get(i).getCodigo() == codigo) {
                        return i;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < produtosPereciveis.size(); i++) {
                    if (produtosPereciveis.get(i).getCodigo() == codigo) {
                        return i;
                    }
                }
                break;
            case 3:
                for (int i = 0; i < produtosPereciveis.size(); i++) {
                    if (lampadas.get(i).getCodigo() == codigo) {
                        return i;
                    }
                }
                break;
        }
        System.out.println("Produto não encontrado! ");
        return -1;
    }

    private void verSaldoEmCaixa(){
        System.out.println("O saldo em caixa é de: R$"+ saldoEmCaixa);
    }

    public void tchau() {
        System.out.println(" Tchau!! :D "); // fiz essa função para evitar warning no objeto do Menu :)
    }
}
