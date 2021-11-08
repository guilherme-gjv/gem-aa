package gui;

import java.util.ArrayList;
import java.util.Scanner;

import gui.Pessoas.*;

public class Menu {
    Scanner strLeitor = new Scanner(System.in);
    Scanner numLeitor = new Scanner(System.in);

    ArrayList<Vendedor> vendedor = new ArrayList<>();
    ArrayList<Gerente> gerente = new ArrayList<>();
    ArrayList<Pessoa> cliente = new ArrayList<>();

    Menu() {

        int resposta = 0;
        do {
            exibirMenu();
            resposta = numLeitor.nextInt();
            switch (resposta) {
            case 1:
                venda();
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
                System.out.println("Saindo...");
                break;
            }
        } while (resposta != 9);

    }

    void exibirMenu() {
        System.out.println("1 - Nova Venda");
        System.out.println("2 - Cadastrar funcionário");
        System.out.println("3 - Cadastro de Cliente");
        System.out.println("4 - Consulta de Cliente");
        System.out.println("5 - Exibir gerentes da empresa"); // todos os gerentes e o total de quanto a empresa paga
                                                              // para eles
        System.out.println("6 - Atualizar dados de um Vendedor"); // perguntar o nome
        System.out.println("7 - Atualizar dados de um Gerente");// perguntar o nome
        System.out.println("8 - Atualizar dados de um Cliente");
        System.out.println("9 - Sair");
        System.out.println("Digite... ");
    }

    void venda() {

        System.out.println("Funcionário da venda: ");
        // recebe scanner e tal
    }

    void cadastroFuncionario() {
        int tipo;
        System.out.println("Digite o tipo: \n1 - Vendedor;\b2 - Gerente;\b3 - Cliente; ");
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
        case 3:
            Pessoa c = new Pessoa();
            cliente.add(c);
            break;
        }
    }

    void cadastroCliente() {
        Pessoa novoCliente = new Pessoa();
        cliente.add(novoCliente);
    }

    void consultaCliente() {
        System.out.println("Pesquisar Cliente");
        int i = pesquisa(3);
        if (i == -1) {
            System.out.println("Não encontrado! ");
        } else {
            cliente.get(i).exibir();
        }

    }

    void exibirGerentes() {
        float somaSalarios = 0;
        for (int i = 0; i < gerente.size(); i++) {
            somaSalarios = gerente.get(i).exibirGerente() + somaSalarios;
        }
        System.out.println("A empresa paga " + somaSalarios + " para todos os Gerentes");
    }

    void updateVendedor() {
        System.out.println("Atualizar Vendedor ");
        int i = pesquisa(1);
        if (i == -1) {
            System.out.println("Não encontrado! ");
        } else {
            vendedor.get(i).updateFuncionario();
        }

    }

    void updateGerente() {
        System.out.println("Atualizar Gerente ");
        int i = pesquisa(2);
        if (i == -1) {
            System.out.println("Não encontrado! ");
        } else {
            gerente.get(i).updateGerente();
        }

    }

    void updateCliente() {
        System.out.println("Atualizar Cliente ");
        int i = pesquisa(3);
        if (i == -1) {
            System.out.println("Não encontrado! ");
        } else {
            cliente.get(i).updatePessoa();
        }

    }

    public int pesquisa(int tipoDePessoa) {
        // int indice = 0;
        // Funcionario 1;
        // Vendedor 2;
        // Gerente 3;
        // Cliente 4;
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
        default:
            return -1;
        }

        System.out.println("Nome não encontrado!");

        return -1;
    }
}
