package abstracao.view;
import abstracao.model.Carro;
import abstracao.model.Cadeira;
import abstracao.model.Mesa;
import abstracao.model.Celular;
import abstracao.model.Notebook;
import java.util.Scanner;

public class Main {
    static Scanner batata = new Scanner(System.in);
    public static void main(String[] args) {
        int opcoes=0;
        boolean running=true, primaryrunning=true;
        String entrada;

        //Carro

        Carro c1 = new Carro("Renault","Logan","ABC-1A23");
        c1.ano = 2022;
        c1.cor = "Prata";
        c1.placa = "ABC-1A23";
        //Carro c2 = new Carro("Fiat","Argo","CBA-2B23");
        //c2.ano = 2018; 
        //c2.cor = "Preta";
        //c2.placa = "CBA-2B23";

        //Cadeiras
        Cadeira cadeira1 = new Cadeira(4, 90);
        Cadeira cadeira2 = new Cadeira(1, 200);

        //Mesas
        Mesa mesa1 = new Mesa("madeira", 3);
        Mesa mesa2 = new Mesa("alumínio", 5);

        //Celulares
        Celular celular1 = new Celular(3, 2, "1080p");
        Celular celular2 = new Celular(2, 1, "4k");

        //Notebooks
        Notebook notebook1 = new Notebook(1, 15);
        Notebook notebook2 = new Notebook(2, 18);

        while (primaryrunning) {
            System.out.println("===Objetos===");
            System.out.println("1. Carro");
            System.out.println("2. Cadeira");
            System.out.println("3. Mesa");
            System.out.println("4. Celular");
            System.out.println("5. Notebook");
            System.out.println("6. ");
            System.out.println("7. ");
            System.out.println("8. ");
            System.out.println("9. ");
            System.out.println("10. ");
            System.out.println("11. ");
            System.out.println("12. ");
            System.out.println("13. ");
            System.out.println("14. ");
            System.out.println("15. ");
            System.out.println("16. ");
            System.out.println("17. ");
            System.out.println("18. ");
            System.out.println("19. ");
            System.out.println("20. ");
            System.out.println("21. ");
            System.out.println("0. ");
            opcoes = batata.nextInt();        
    
            switch (opcoes) {
                case 1:
                running=true;
                while (running) {
                    System.out.println("===Opcoes===");
                    System.out.println("1. Ligar");
                    System.out.println("2. Desligar");
                    System.out.println("3. Acelerar");
                    System.out.println("4. Buzinar");
                    System.out.println("5. Frear");
                    System.out.println("0. Sair do carro");
                    opcoes = batata.nextInt();
                    switch (opcoes) {
                        case 1:
                            c1.ligar();
                            break;
                    
                        case 2:
                            c1.desligar();
                            break;
                    
                        case 3:
                            c1.acelerar();
                            break;
                    
                        case 4:
                            c1.buzinar();
                            break;
                    
                        case 5:
                            c1.frear();
                            break;
                        
                        case 0:
                            running=false;
                            break;
                    
                        default:
                            System.out.println("Esse comando não existe.");
                            break;
                    }
                }
                    break;
                case 2:
                    running=true;
                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha a cadeira (1 ou 2): ");
                        opcoes = batata.nextInt();
                        switch (opcoes) {
                            case 1:
                                System.out.println("\nA cadeira 1 possui " + cadeira1.quantidadedepernas + " pernas.");
                                System.out.print("Digite seu peso para ver se a cadeira te aguenta: ");
                                int peso = batata.nextInt();
                                cadeira1.sentar(peso);
                                break;
                            case 2:
                                System.out.println("A cadeira 2 possui " + cadeira2.quantidadedepernas + " pernas.");
                                System.out.print("Digite seu peso para ver se a cadeira te aguenta: ");
                                peso = batata.nextInt();
                                cadeira2.sentar(peso);
                                break;
                            case 0:
                                running=false;
                                break;
                            default:
                                System.out.println("Inválido.");
                                break;
                        }
                    }
                    break;
                case 3:
                    running=true;
                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha a mesa (1 ou 2): ");
                        opcoes = batata.nextInt();
                        switch (opcoes) {
                            case 1:
                                System.out.println("\nA mesa 1 é feita de " + mesa1.material + " e mede " + mesa1.tamanho + "m");                   
                                break;
                            case 2:
                                System.out.println("\nA mesa 1 é feita de " + mesa2.material + " e mede " + mesa2.tamanho + "m");
                                break;
                            case 0:
                                running=false;
                                break;
                            default:
                                System.out.println("Inválido.");
                                break;
                        }
                    }
                    break;
                case 4:
                    running=true;
                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha o celular (1 ou 2): ");
                        opcoes = batata.nextInt();
                        switch (opcoes) {
                            case 1:
                                System.out.println("\nO celular 1 tem " + celular1.botoes + " botões e pode fotografar em " + celular1.qualidade);
                                System.out.print("Escreva X para tirar uma foto: ");
                                batata.nextLine();
                                entrada = batata.nextLine();
                                celular1.tirarfoto(celular1.qualidade);
                                
                                break;
                            case 2:
                                System.out.println("\nO celular 2 tem " + celular2.botoes + " botões e pode fotografar em " + celular2.qualidade);
                                System.out.print("Escreva X para tirar uma foto: ");
                                batata.nextLine();
                                entrada = batata.nextLine();
                                celular1.tirarfoto(celular2.qualidade);
                                break;
                            case 0:
                                running=false;
                                break;
                            default:
                                System.out.println("Inválido.");
                                break;
                        }
                    }
                    break;
                case 5:
                    running=true;
                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha o notebook (1 ou 2): ");
                        opcoes = batata.nextInt();
                        switch (opcoes) {
                            case 1:
                                System.out.println("\nO notebook 1 tem " + notebook1.teclados + " teclado");
                                System.out.print("Escreva 'Assistir' para assitir um vídeo: ");
                                batata.nextLine();
                                entrada = batata.nextLine();
                                notebook1.assistirvideo(notebook1.tamanhodatela);      
                                break;
                            case 2:
                                System.out.println("\nO notebook 1 tem " + notebook2.teclados + " teclados");
                                System.out.print("Escreva 'Assistir' para assitir um vídeo: ");
                                batata.nextLine();
                                entrada = batata.nextLine();
                                notebook2.assistirvideo(notebook2.tamanhodatela);  
                                break;
                            case 0:
                                running=false;
                                break;
                            default:
                                System.out.println("Inválido.");
                                break;
                        }
                    }
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                case 10:
                    
                    break;
                case 11:
                    
                    break;
                case 12:
                    
                    break;
                case 13:
                    
                    break;
                case 14:
                    
                    break;
                case 15:
                    
                    break;
                case 16:
                    
                    break;
                case 17:
                    
                    break;
                case 18:
                    
                    break;
                case 19:
                    
                    break;
                case 20:
                    
                    break;
                case 21:
                    
                    break;
                case 0:
                    primaryrunning=false;
                    break;
            
                default:
                    break;
            }
        }
    }
}
