package abstracao.model;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public String placa;
    public Boolean ligado=false;
    public boolean acelerar=false;

    public Carro(String mc, String md, String plc){
        this.marca = mc;
        this.modelo = md;
        this.placa = plc;
    }

    public void ligar(){
        if (ligado){
            System.out.println("O carro ja está ligado");
        }
        else{
            System.out.println("Carro ligado!");
            ligado = true;
        }
    }

    public void desligar(){
        if (ligado){
            System.out.println("Carro desligado.");
            ligado=false;
        }
        else{
            System.out.println("O Carro já está desligado");
        }
    }

    public void buzinar(){
        System.out.println("Modelo: " + this.modelo+ " | Bi Bi Bi!");
    }
    public void acelerar(){
        if (ligado){
            if (acelerar){
                System.out.println("O Carro já está acelerando.");
            }
            else{
            System.out.println("Vrum Vrum Vrum!");
            }
        }
        else{
            System.out.println("O carro não está ligado.");
        }
    }

    public void frear(){
        System.out.println("Carro freado!");
        acelerar = false;
    }
    
}
