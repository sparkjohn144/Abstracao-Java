package abstracao.model;

public class Notebook {
    public Integer teclados;
    public Integer tamanhodatela;

    public Notebook(Integer tcld, Integer tmtela){
        this.teclados = tcld;
        this.tamanhodatela = tmtela;
    }

    public void assistirvideo(int tamanhodatela){
        System.out.println("Você assistiu um vídeo em uma tela de " + tamanhodatela + " polegadas!");
    }
}
