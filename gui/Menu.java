package gui;

import java.util.ArrayList;
import java.util.Scanner;

import gui.Pessoas.*;

public class Menu {
    Scanner strLeitor = new Scanner(System.in);
    Scanner numLeitor = new Scanner(System.in);

    ArrayList <Funcionario> funcionario = new ArrayList<>();
    ArrayList <Gerente> gerente = new ArrayList<>();
    ArrayList <Pessoa> cliente = new ArrayList<>();
    
    Menu(){
        
    int resposta = 0;
        do{
            exibirMenu();
            resposta = numLeitor.nextInt();
        }while(resposta!=9);
        

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
        System.out.println("Digite... ");
    }

    void cadastrarFuncionario() {

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
    }

    void updateVendedor() {
    }

    void updateGerente() {
    }

}
