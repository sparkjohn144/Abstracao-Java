package abstracao.model;

public class Espelho {
    public String formato;
    public String tamanho;

    public Espelho(String formato, String tamanho){
        this.formato = formato;
        this.tamanho = tamanho;
    }

        public void refletir() {
            System.out.println("Você ve o seu reflexo. Apesar de tudo, esse ainda é você");
        }
}
