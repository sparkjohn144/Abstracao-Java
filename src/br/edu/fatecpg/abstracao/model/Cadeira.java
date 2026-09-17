package abstracao.model;

public class Cadeira {

    public Integer quantidadedepernas;
    public Integer capacidade;

    public Cadeira(Integer qp, Integer cp){
        this.quantidadedepernas = qp;
        this.capacidade = cp;
    }

    public void sentar(int peso){
        if (peso > capacidade)
            System.out.println("A cadeira quebrou :(");
        else 
            System.out.println("Você sentou! Hora de descansar");
    }
}