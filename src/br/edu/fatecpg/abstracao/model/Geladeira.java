package abstracao.model;

public class Geladeira {
    public Integer portas;
    public Integer compartimentos;

    public Geladeira(Integer pts, Integer cps){
        this.portas = pts;
        this.compartimentos = cps;
    }

    public void pegargelo(){
        System.out.println("Você pegou gelo da geladeira!");
    }
}
