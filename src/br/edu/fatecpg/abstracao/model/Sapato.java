package abstracao.model;

public class Sapato{
    public int tamanho;
    public String cor;
    public boolean vestido = false;

    public Sapato(int tamanho, String cor){
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public void vestir(int seu_tamanho){
        if(vestido){
            System.out.println("Você ja está calçando este sapato.");
        }
        else if(seu_tamanho > tamanho){
            System.out.println("O sapato é muito pequeno pro seu pé. Ele não entra");
        }
        else{
            System.out.println("Você veste o sapato!");
            vestido = true;
        }
    }

    public void tirar(){
        if(vestido){
            System.out.println("Você tira os sapatos. Que chulé!");
            vestido = false;
        }
        else{
            System.out.println("Você não está vestindo os sapatos");
        }
    }

    public void arremessar(){
        if(vestido){
            System.out.println("Você não consegue arremessar o sapato pois está usando eles.");
        }
        else{
            System.out.println("Você arremessa os sapatos... por que diabos você fez isso?");
        }
    }
}