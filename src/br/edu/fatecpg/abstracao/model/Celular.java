package abstracao.model;

public class Celular {
    public Integer botoes;
    public Integer camera;
    public String qualidade;

    public Celular(Integer btn, Integer cam, String qld){
        this.botoes = btn;
        this.camera = cam;
        this.qualidade = qld;
    }

    public void tirarfoto(String qualidade){
        System.out.println("Você tirou uma foto em " + qualidade + "!");
    }
}
