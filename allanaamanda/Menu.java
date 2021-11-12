import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner entrada = new Scanner(System.in);
    ArrayList<Gerente> gerentes = new ArrayList<>();
    ArrayList<Vendedor> vendedores = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();

    public Menu(){
        menu();
    }

    private void rodar() {
        int resultado = entrada.nextInt();
        switch (resultado) {
        case 1:
            cadastrarFuncionario();
            break;
        case 2:
            cadastrarEConsultarCliente();
            break;
        case 3:
            exibirGerentes();
            break;
        case 4:
            atualizarEnderecoETelefoneDeFuncionario();
            break;
        case 5:
            atualizarValorDeVendas();
            break;
        }
    }

    private void menu() {
        int r = 0;
        while (r != 6){
            System.out.println("Distribuidora Nossa Arapiraca");
        System.out.println("1: CADASTRAR FUNCIONARIO" + "\n2: CADASTRAR E CONSULTAR CLIENTE" + "\n3: EXIBIR GERENTES"
                + "\n4: ATUALIZAR ENDEREÇO E TELEFONE DE FUNCIONÁRIO" + "\n5: ATUALIZAR O VALOR DE VENDAS\n6: Sair");
        rodar();
        }
        
    }

    private void cadastrarFuncionario() {
        System.out.println("Digite 1 para registrar Vendedor ");
        System.out.println("Digite 2 para registrar Gerente ");
        int i = entrada.nextInt();
        switch (i) {
        case 1:
            Vendedor v1 = new Vendedor();
            vendedores.add(v1);
            break;
        case 2:
            Gerente g2 = new Gerente();
            gerentes.add(g2);
            break;
        }

    }

    private void cadastrarEConsultarCliente() {
        int i = 0;
        System.out.println("Digite 1 para cadastrar Clientes");
        System.out.println("Digite 2 para consultar Clientes");
        i = entrada.nextInt();
        switch (i) {
        case 1:
            System.out.println("adicionar novo cliente");
            Cliente c1 = new Cliente();
            clientes.add(c1);
            break;
        case 2:
            for (int cont = 0; cont < clientes.size(); cont++) {
                clientes.get(cont).mostrarPessoa();
            }
            break;
        }

    }

    private void exibirGerentes() {
        float salariototal = 0;
        for (int cont = 0; cont < gerentes.size(); cont++) {
            gerentes.get(cont).mostrarGerente();
            salariototal = gerentes.get(cont).getSalario() + salariototal;
        }
        System.out.println("O gasto com todos os gerentes na empresa é " + salariototal);
    }

    private void atualizarEnderecoETelefoneDeFuncionario() {
        String nomeFunc;
        System.out.println("Qual é o nome do funcionário? ");
        nomeFunc = entrada.nextLine();
        for (int cont = 0; cont < gerentes.size(); cont++) {
            if (nomeFunc.equalsIgnoreCase(gerentes.get(cont).getNome())) {
                gerentes.get(cont).atualizarEndTel();
            }
        }
    }

    private void atualizarValorDeVendas() {
        String nomeFunc;
        System.out.println("Qual é o nome do funcionário? ");
        nomeFunc = entrada.nextLine();
        for (int cont = 0; cont < vendedores.size(); cont++) {
            if (nomeFunc.equalsIgnoreCase(vendedores.get(cont).getNome())) {
                vendedores.get(cont).atualizarVendas();
            }
        }
    }
}