package gui;

import java.util.ArrayList;
import java.util.Scanner;

import gui.Pessoas.*;

public class Menu {
    Scanner strLeitor = new Scanner(System.in);
    Scanner numLeitor = new Scanner(System.in);

    ArrayList<Vendedor> vendedor = new ArrayList<>();
    ArrayList<Funcionario> funcionario = new ArrayList<>();
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
                updateFuncionario();
                break;
            case 7:
                updateVendedor();
                break;
            case 8:
                updateGerente();
                break;
            case 9:
                updateCliente();
                break;
            case 10:
                System.out.println("Saindo...");
                break;
            }
        } while (resposta != 10);

    }

    void exibirMenu() {
        System.out.println("1 - Nova Venda");
        System.out.println("2 - Cadastrar funcionário");
        System.out.println("3 - Cadastro de Cliente");
        System.out.println("4 - Consulta de Cliente");
        System.out.println("5 - Exibir gerentes da empresa"); // todos os gerente e o total de quanto a empresa paga
                                                              // para eles
        System.out.println("6 - Atualizar dados de um Funcionário"); // perguntar o nome
        System.out.println("7 - Atualizar dados de um Vendedor"); // perguntar o nome
        System.out.println("8 - Atualizar dados de um Gerente");// perguntar o nome
        System.out.println("9 - Sair");
        System.out.println("Digite... ");
    }

    void venda() {
        
        System.out.println("Funcionário da venda: ");
         // recebe scanner e tal
    }

    void cadastroFuncionario() {
        int tipo;
        System.out.println("Digite o tipo: \n1 - Funcionário;\b2 - Vendedor;\b3 - Gerente;\b4 - Cliente; ");
        tipo = numLeitor.nextInt();

    }

    void cadastroCliente() {
        Pessoa novoCliente = new Pessoa();
        cliente.add(novoCliente);
    }

    void consultaCliente() {
        System.out.println("Pesquisar Cliente");
        cliente.get(pesquisa(4)).exibir();
    }

    void exibirGerentes() {
    }

    void updateFuncionario() {
        System.out.println("Atualizar Funcionário");
        int i = pesquisa(1);
        funcionario.get(i).updateFuncionario();
    }

    void updateVendedor() {
        System.out.println("Atualizar Vendedor ");
        int i = pesquisa(2);
        vendedor.get(i).updateFuncionario();
    }

    void updateGerente() {
        System.out.println("Atualizar Gerente ");
        int i = pesquisa(3);
        gerente.get(i).updateGerente();
    }

    void updateCliente() {
        System.out.println("Atualizar Cliente ");
        int i = pesquisa(4);
        cliente.get(i).updatePessoa();
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
            for (int i = 0; i < funcionario.size(); i++) {
                if (funcionario.get(i).getNome().equalsIgnoreCase(nomePesquisa)) {
                    return i;
                }
            }
            break;
        case 2:
            for (int i = 0; i < vendedor.size(); i++) {
                if (vendedor.get(i).getNome().equalsIgnoreCase(nomePesquisa)) {
                    return i;
                }
            }
            break;
        case 3:
            for (int i = 0; i < gerente.size(); i++) {
                if (gerente.get(i).getNome().equalsIgnoreCase(nomePesquisa)) {
                    return i;
                }
            }
            break;
        case 4:
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
