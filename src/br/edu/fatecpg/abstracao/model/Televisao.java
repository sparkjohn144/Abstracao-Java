package abstracao.model;

public class Televisao {
    public Integer tamanhodatela;
    public Integer botoes;

    public Televisao(Integer tmtela, Integer bts){
        this.tamanhodatela = tmtela;
        this.botoes = bts;
    }

    public void assistirtv(int tamanhodatela){
        System.out.println("Você assistiu Leon e Nilce em uma tela de " + tamanhodatela + " polegadas!");
    }
}
