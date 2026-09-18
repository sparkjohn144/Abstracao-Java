package abstracao.model;

public class Onibus {
    public String cor;
    public String modelo;
    public boolean ligado = false;
    public boolean acelerar = false;

    public Onibus(String cor, String modelo){
    this.cor = cor;
    this.modelo = modelo;
    }

    public void ligar(){
        if(ligado){
            System.out.println("O ônibus ja está ligado");
        }
        else{
            System.out.println("O ônibus ligou!");
            ligado = true;
        }
    }

    public void acelerar(){
        if(ligado){
            if(acelerar){
                System.out.println("O ônibus já está acelerando! OLHA PRA FRENTE!!");
            }
            else{
                System.out.println("O ônibus começou a acelerar! Vruuuummmm");
                acelerar = true;
            }
        }
        else{
            System.out.println("O ônibus ta nem ligado neguinho, quer acelerar isso como?");
        }
    }
    public void freiar(){
        System.out.println("O ônibus freiou!");
        acelerar = false;
    }

    public void buzina(){
        System.out.println("Você buzina! FOOOOOOOOOM FOOOOOOOOM!!!");
    }
}

