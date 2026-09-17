package abstracao.model;

public class Livro {
    public Integer paginas;
    public String capa;

    public Livro(Integer pgn, String cap){
        this.paginas = pgn;
        this.capa = cap;
    }

    public void ler() {
        System.out.println("Você começou a ler o livro! Que incrível!!!");
    }
}
