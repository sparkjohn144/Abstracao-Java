package abstracao.model;

public class Ventilador {
    public Integer helices;
    public Integer botoes;

    public Ventilador(Integer hlc, Integer bts){
        this.helices = hlc;
        this.botoes = bts;
    }

    public void ligarventilador(){
        System.out.println("Voce ligou o ventilador. Refrescante!");
    }
}
