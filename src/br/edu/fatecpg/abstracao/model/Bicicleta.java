package abstracao.model;

public class Bicicleta {
    public String cor;
    public String tipo;

    public Bicicleta(String cor, String tp){
        this.cor = cor;
        this.tipo = tp;
    }
    public void tocarsino(){
        System.out.println("Voce toca o sino. Blim Blimm!!!");
    }
}
