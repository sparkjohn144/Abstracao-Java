package abstracao.model;

public class GuardaChuva {
    public String cor;
    public String material;
    public boolean aberto = false;

    public GuardaChuva(String cor, String material){
        this.cor = cor;
        this.material = material;
    }

    public void abrir(){
        if(aberto){
            System.out.println("O guarda-chuva já está aberto.");
        }
        else{
            System.out.println("Você abre o guarda-chuva. Agora você nao está mais tomando chuva! :D");
            aberto = true;
        }
    }

    public void fechar(){
        if(aberto){
            System.out.println("Você fecha o guarda-chuva. Lembre de chacoalha-lo antes de guardar.");
            aberto = false;
        }
        else{
            System.out.println("O guarda-chuva já esta fechado. Não consegue ver que você está se molhando?");
        }
    }
}
