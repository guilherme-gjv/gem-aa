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
                cadastroFuncionario();
                break;
            case 2:
                venda();
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
                System.out.println("Saindo...");
                break;
            }
        } while (resposta != 9);

    }

    void exibirMenu() {
        System.out.println("1 - Cadastrar funcionário");
        System.out.println("2 - Nova Venda");
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

    void cadastroFuncionario() {

    }

    void venda() {
        String procurarFuncionario;
        System.out.println("Funcionário da venda: ");
        procurarFuncionario = "teste"; // recebe scanner e tal
    }

    void cadastroCliente() {
    }

    void consultaCliente() {
    }

    void exibirGerentes() {
    }

    void updateFuncionario() {
        System.out.println("Atualizar vendedor");
        pesquisa(1);
    }

    void updateVendedor() {
    }

    void updateGerente() {
    }

    public int pesquisa(int tipoDePessoa) {
        //int indice = 0;
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
