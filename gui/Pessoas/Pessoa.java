package gui.Pessoas;

import java.util.*;
public class Pessoa {
    private String nome,cidade;
    private int CEP, telefone;
    private Scanner strLeitor = new Scanner(System.in);
    private Scanner numLeitor = new Scanner(System.in);

public Pessoa(){
    setPessoa();
}

private void setPessoa(){
    
    System.out.println("Nome: ");
    nome = strLeitor.nextLine();
    System.out.println("Cidade: ");
    cidade = strLeitor.nextLine();
    System.out.println("CEP: ");
    CEP = numLeitor.nextInt();
    System.out.println("Telefone: ");
    telefone = numLeitor.nextInt();
}
public void updatePessoa(){
    setPessoa();
}
public void exibir(){
    System.out.println("Nome: "+nome);
    System.out.println("Cidade: "+cidade);
    System.out.println("CEP: "+ CEP);
    System.out.println("Telefone:"+ telefone);
}

public String getNome(){
    return nome;
}
public String getCidade(){
    return cidade;
}
public int getCEP(){
    return CEP;
}
public int getTelefone(){
    return telefone;
}
}