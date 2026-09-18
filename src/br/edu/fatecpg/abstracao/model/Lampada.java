package abstracao.model;

public class Lampada {
    public String formato;
    public String cor;
    public boolean ligado = false;

    public Lampada(String formato, String cor){
        this.formato = formato;
        this.cor = cor;
    }

    public void ligar() {
        if(ligado){
            System.out.println("A luz ja está ligada.");
        }
        else{
            System.out.println("Você liga a luz.");
            ligado = true;
        }
    }

    public void desligar(){
        if(ligado){
            System.out.println("Você desliga a luz.");
            ligado = false;
        }
        else{
            System.out.println("A luz ja está desligada.");
        }
    }
}
