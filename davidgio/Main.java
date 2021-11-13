package davidgio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Scanner l2 = new Scanner(System.in);
        ArrayList<PessoaFisica> pessoa = new ArrayList<>();
        ArrayList<EmpresaPessoaJuridica> empresa = new ArrayList<>();
        ArrayList<Funcionario> funcionario = new ArrayList<>();

        int op;
        do {
            System.out.println("Nossa Arapiraca - Distribuidora");
            System.out.println("Digite um numero ");
            System.out.println("[1] Cadastrar Funcionarios ");
            System.out.println("[2] Cadastro e Consulta de Clientes ");
            System.out.println("[3] Exibir todos os funcionários ");// e o valor total
            System.out.println("[4] Atualizar Endereço e Telefone de Cliente ");
            System.out.println("[5] Atualizar Endereço e Telefone de Funcionario ");
            System.out.println("[6] Encerrar App ");

            op = l.nextInt();

            switch (op) {
            case 1:
                Funcionario funcionario2 = new Funcionario();
                funcionario.add(funcionario2);
                System.out.println("Funcionario cadastrado.\n");
                break;
            case 2:
                System.out.println("Qual é o tipo de Cliente?");
                System.out.println("[1] Pessoa Física ");
                System.out.println("[2] Pessoa Jurídica (Empresa) ");
                int tipo = l.nextInt();
                System.out.println("Ok.");

                System.out.println("[1] Cadastrar Clientes");
                System.out.println("[2] Consultar Clientes");
                int op2 = l.nextInt();
                switch (op2) {
                case 1:
                    switch (tipo) {
                    case 1:
                        PessoaFisica pessoa2 = new PessoaFisica();
                        pessoa.add(pessoa2);
                        break;
                    case 2:
                        EmpresaPessoaJuridica empresa2 = new EmpresaPessoaJuridica();
                        empresa.add(empresa2);
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome do Cliente");
                    
                    String nome1 = l2.nextLine();
                    switch (tipo) {
                    case 1:
                        for(int i = 0; i < pessoa.size(); i++){
                            if(pessoa.get(i).getNome().equalsIgnoreCase(nome1)){
                                pessoa.get(i).exibirPF();
                            }
                        }
                        break;
                    case 2:
                        for(int i = 0; i < empresa.size(); i++){
                            if(empresa.get(i).getNome().equalsIgnoreCase(nome1)){
                                empresa.get(i).exibirPJ();
                            }
                        }
                        break;
                    }
                    break;
                }

                break;
            case 3:
                float totalGastoFunc = 0;
                for(int i = 0; i < funcionario.size();i++){
                    funcionario.get(i).exibirFunc();
                    totalGastoFunc = totalGastoFunc + funcionario.get(i).getSalario();
                }
                break;
            case 4:
            System.out.println("Atualizar Cliente ");
            System.out.println("Qual é o tipo de Cliente?");
            System.out.println("[1] Pessoa Física ");
            System.out.println("[2] Pessoa Jurídica (Empresa) ");
            tipo = l.nextInt();
            System.out.println("Ok.");
            System.out.println("Digite o nome do Cliente");
            
            String nome1 = l2.nextLine();
            switch (tipo) {
            case 1:
                for(int i = 0; i < pessoa.size(); i++){
                    if(pessoa.get(i).getNome().equalsIgnoreCase(nome1)){
                        pessoa.get(i).atEnd();
                        pessoa.get(i).atTelefone();
                    }
                }
                break;
            case 2:
                for(int i = 0; i < empresa.size(); i++){
                    if(empresa.get(i).getNome().equalsIgnoreCase(nome1)){
                        empresa.get(i).atEnd();
                        empresa.get(i).atTelefone();
                    }
                }
                break;
            }
                break;
            case 5:
                System.out.println("Digite o nome do Funcionário ");
                String nomeFunc = l2.nextLine();
                for(int i = 0; i < funcionario.size();i++){
                    if(funcionario.get(i).getNome().equalsIgnoreCase(nomeFunc)){
                        funcionario.get(i).atEnd();
                        funcionario.get(i).atSalario();
                    }   
                }
                break;
            case 6:
                System.out.println("Saindo do sistema");
                break;
            }
        } while (op != 6);
    }

    public static void jojojoj() {
        System.out.println("oi");
    }
}
