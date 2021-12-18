package gui;

import java.util.Scanner;

public class Endereco {
    private Scanner strLeitor = new Scanner(System.in);
    private Scanner numLeitor = new Scanner(System.in);
    private String cidade;
    private int CEP;
    public Endereco(){
        System.out.println("Cidade: ");
        cidade = strLeitor.nextLine();
        System.out.println("CEP: ");
        CEP = numLeitor.nextInt();
    }
    public void exibirE(){
        System.out.println("Cidade: "+cidade);
        System.out.println("CEP: "+ CEP);
    }
    public String getCidade(){
        return cidade;
    }
    public int getCEP(){
        return CEP;
    }
}
