import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        rodar();
    }

    private static void rodar() {
        Scanner entrada = new Scanner(System.in);
        menu();
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
        default:
            rodar();
            break;
        }
    }

    private static void menu() {
        System.out.println("Distribuidora Nossa Arapiraca");
        System.out.println("1: CADASTRAR FUNCIONARIO" + "\n2: CADASTRAR E CONSULTAR CLIENTE" + "\n3: EXIBIR GERENTES"
                + "\n4: ATUALIZAR ENDEREÇO E TELEFONE DE FUNCIONÁRIO" + "\n5: ATUALIZAR O VALOR DE VENDAS\n6: Sair");
    }

    private static void cadastrarFuncionario() {

    }

    private static void cadastrarEConsultarCliente() {

    }

    private static void exibirGerentes() {

    }

    private static void atualizarEnderecoETelefoneDeFuncionario() {

    }

    private static void atualizarValorDeVendas() {

    }
}