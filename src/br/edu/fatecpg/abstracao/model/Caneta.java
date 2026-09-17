package abstracao.model;

public class Caneta {
    public String marca;
    public String cor;

    public Caneta(String mrc, String cor){
        this.marca = mrc;
        this.cor = cor;
    }

        public void escrever() {
            System.out.println("A caneta está escrevendo!!!");
        }
}
