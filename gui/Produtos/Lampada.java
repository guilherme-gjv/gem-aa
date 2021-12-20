package gui.Produtos;

public class Lampada extends Produto{
    private float potencia;
    private String tipo, cor;

    public Lampada(){
        super("Lâmpada");
        setLampada();
    }
    private void setLampada(){
        System.out.println("Potencia da lâmpada: ");
        potencia = numLeitor.nextFloat();
        System.out.println("Tipo: ");
        tipo = strLeitor.nextLine();
        System.out.println("Cor: ");
        cor = strLeitor.nextLine();
    }
    public void updateLampada(){
        updateDados();
        setLampada();
    }
    public void showLampada(){
        showProduto();
        System.out.println("Potencia da lâmpada: "+potencia);
        System.out.println("Tipo: "+tipo);
        System.out.println("Cor: "+cor+"\n");
    }
    public float getPotencia() {
        return potencia;
    }
    public String getTipo() {
        return tipo;
    }
    public String getCor() {
        return cor;
    }
}
