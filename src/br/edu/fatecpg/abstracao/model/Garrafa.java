package abstracao.model;

public class Garrafa {
    public Integer capacidade;
    public String material;
    public Boolean aberto = false;

    public Garrafa(Integer cpd, String mat){
        this.capacidade = cpd;
        this.material = mat;
    }

    public void abrir() {
        if(!aberto){
            System.out.println("A garrafa foi aberta!!!");
            aberto = true;
        }
        else {
            System.out.println("A garrafa já está aberta!!!");
        }
    }
    public void fechar() {
        if(aberto){
            System.out.println("A garrafa foi fechada!!!");
            aberto = false;
        }
        else {
            System.out.println("A garrafa já está fechada!!!");
        }
    }
}
