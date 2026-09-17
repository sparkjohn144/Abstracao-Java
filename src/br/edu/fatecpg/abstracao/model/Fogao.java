package abstracao.model;

public class Fogao {
    public String combustivel;
    public Integer bocas;
    boolean ligado = false;

    public Fogao(String com, Integer bcs){
        this.combustivel = com;
        this.bocas = bcs;
    }

    public void ligarFogao() {
        if(!ligado){
            System.out.println("O fogão foi ligado!!!");
            ligado = true;
        }
        else {
            System.out.println("O fogão já está ligado!!!");
        }
    }

    public void desligarFogao() {
        if(ligado){
            System.out.println("O fogão foi desligado!!!");
            ligado = false;
        }
        else {
            System.out.println("O fogão já está desligado!!!");
        }
    }
}