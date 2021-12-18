package gui.Pessoas;

import java.util.*;

import gui.Endereco;
public class Pessoa {
    private String nome;
    private int telefone;
    private Endereco endereco;
    private Scanner strLeitor = new Scanner(System.in);
    private Scanner numLeitor = new Scanner(System.in);

public Pessoa(){
    setPessoa();
}

private void setPessoa(){
    System.out.println("Nome: ");
    nome = strLeitor.nextLine();
    setEnderecoETelefone();
}
private void setEnderecoETelefone(){
    endereco = new Endereco();
    System.out.println("Telefone: ");
    telefone = numLeitor.nextInt();
}
public void updatePessoa(){
    setPessoa();
}
public void updateEnderecoETelefone(){
    setEnderecoETelefone();
}
public void exibir(){
    System.out.println("Nome: "+nome);
    endereco.exibirE();
    System.out.println("Telefone:"+ telefone);
}

public String getNome(){
    return nome;
}
public String getCidade(){
    return endereco.getCidade();
}
public int getCEP(){
    return endereco.getCEP();
}
public int getTelefone(){
    return telefone;
}
}