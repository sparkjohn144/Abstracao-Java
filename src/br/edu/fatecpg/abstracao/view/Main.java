package abstracao.view;
import abstracao.model.Carro;
import abstracao.model.Cadeira;
import abstracao.model.Mesa;
import abstracao.model.Celular;
import abstracao.model.Notebook;
import abstracao.model.Relogio;
import abstracao.model.Mochila;
import abstracao.model.Garrafa;
import abstracao.model.Caneta;
import abstracao.model.Livro;
import abstracao.model.Televisao;
import abstracao.model.Fogao;
import abstracao.model.Geladeira;
import abstracao.model.Ventilador;
import abstracao.model.Bicicleta;
import abstracao.model.Onibus;
import abstracao.model.Lampada;
import abstracao.model.Espelho;
import abstracao.model.GuardaChuva;
import abstracao.model.Sapato;
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

        //Relogios
        Relogio relogio1 = new Relogio(3, "algarismos arábicos");
        Relogio relogio2 = new Relogio(3, "algarismos romanos");

        //Mochilas
        Mochila mochila1 = new Mochila(3, 2);
        Mochila mochila2 = new Mochila(6, 1);

        //Garrafas
        Garrafa garrafa1 = new Garrafa(450, "Alumínio");
        Garrafa garrafa2 = new Garrafa(1000, "Plástico");

        //Caneta
        Caneta caneta1 = new Caneta("BIC", "Azul");
        Caneta caneta2 = new Caneta("Faber-Castell", "Preta");

        //Livro
        Livro livro1 = new Livro (67, "Verde");
        Livro livro2 = new Livro (69, "Azul");

        //Televisao
        Televisao televisao1 = new Televisao(15, 1);
        Televisao televisao2 = new Televisao(18, 2);

        //Fogao
        Fogao fogao1 = new Fogao("Carvão",5);
        Fogao fogao2 = new Fogao("Gás",6);

        //Geladeira
        Geladeira geladeira1 = new Geladeira(2,8);
        Geladeira geladeira2 = new Geladeira(3,10);

        //Ventilador
        Ventilador ventilador1 = new Ventilador(6, 1);
        Ventilador ventilador2 = new Ventilador(8, 2);

        //Bicicleta
        Bicicleta bicicleta1 = new Bicicleta("Azul","Marcha");
        Bicicleta bicicleta2 = new Bicicleta("Verde","Sem Marcha");

        //Ônibus
        Onibus onibus1 = new Onibus("Azul", "Marcopolo");
        Onibus onibus2 = new Onibus("Amarelo", "Mascarello");

        //Lâmpada
        Lampada lampada1 = new Lampada("Bolinha","Amarela");
        Lampada lampada2 = new Lampada("Espiral","Branca");

        //Espelho
        Espelho espelho1 = new Espelho("Retangulo","64x32");
        Espelho espelho2 = new Espelho("Oval","32x16");

        //Guarda-Chuva
        GuardaChuva guardachuva1 = new GuardaChuva("Preto", "POLIESTER");
        GuardaChuva guardachuva2 = new GuardaChuva("Azul", "Náilon");

        //Sapato
        Sapato sapato1 = new Sapato(43, "Marrom");
        Sapato sapato2 = new Sapato(32, "Preto");

        while (primaryrunning) {
            System.out.println("===Objetos===");
            System.out.println("1. Carro");
            System.out.println("2. Cadeira");
            System.out.println("3. Mesa");
            System.out.println("4. Celular");
            System.out.println("5. Notebook");
            System.out.println("6. Relogio");
            System.out.println("7. Mochila");
            System.out.println("8. Garrafa");
            System.out.println("9. Caneta");
            System.out.println("10. Livro");
            System.out.println("11. Televisao");
            System.out.println("12. Fogao");
            System.out.println("13. Geladeira");
            System.out.println("14. Ventilador");
            System.out.println("15. Bicicleta");
            System.out.println("16. Ônibus");
            System.out.println("17. Lâmpada");
            System.out.println("18. Espelho");
            System.out.println("19. Guarda-Chuva");
            System.out.println("20. Sapato");
            System.out.println("0. Sair");
            System.out.println("Digite um número: ");
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
                                System.out.println("\nA mesa 2 é feita de " + mesa2.material + " e mede " + mesa2.tamanho + "m");
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
                                celular2.tirarfoto(celular2.qualidade);
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
                                System.out.println("\nO notebook 2 tem " + notebook2.teclados + " teclados");
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
                    running=true;
                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha o relógio (1 ou 2): ");
                        opcoes = batata.nextInt();
                        switch (opcoes) {
                            case 1:
                                System.out.println("\nO relógio 1 tem " + relogio1.ponteiros + "ponteiros, e o formato dos números é em " + relogio1.numeros);
                                System.out.print("Escreva 'Hora' para mostrar as horas: ");
                                batata.nextLine();
                                entrada = batata.nextLine();
                                relogio1.horas();      
                                break;
                            case 2:
                                System.out.println("\nO relógio 2 tem " + relogio2.ponteiros + "ponteiros, e o formato dos números é em " + relogio2.numeros);
                                System.out.print("Escreva 'Hora' para mostrar as horas: ");
                                batata.nextLine();
                                entrada = batata.nextLine();
                                relogio2.horas(); 
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
                case 7:
                    running=true;
                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha a mochila (1 ou 2): ");
                        opcoes = batata.nextInt();
                        switch (opcoes) {
                            case 1:
                                System.out.println("\nA mcohila 1 tem " + mochila1.compartimentos + "compartimentos, e " + mochila1.alças + "alças.");
                                System.out.println("Escolha uma das opções:");
                                System.out.println("1. Adicionar Item a mochila.");
                                System.out.println("2. Remover Item da mochila");
                                System.out.println("3. Mostrar Conteúdo");
                                batata.nextLine();
                                int opcoesmochila = batata.nextInt();
                                switch (opcoesmochila) {
                                    case 1:
                                        mochila1.armazenar(batata);
                                        break;
                                    case 2:
                                        mochila1.remover(batata);
                                        break;
                                    case 3:
                                        System.out.println("Dentro da mochila temos: " + mochila1.armazenamento);
                                        break;
                                
                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }   
                                break;
                            case 2:
                                System.out.println("\nA mcohila 2 tem " + mochila2.compartimentos + "compartimentos, e " + mochila2.alças + "alças.");
                                System.out.println("Escolha uma das opções:");
                                System.out.println("1. Adicionar Item a mochila.");
                                System.out.println("2. Remover Item da mochila");
                                System.out.println("3. Mostrar Conteúdo");
                                batata.nextLine();
                                opcoesmochila = batata.nextInt();
                                switch (opcoesmochila) {
                                    case 1:
                                        mochila2.armazenar(batata);
                                        break;
                                    case 2:
                                        mochila2.remover(batata);
                                        break;
                                    case 3:
                                        System.out.println("Dentro da mochila temos: " + mochila2.armazenamento);
                                        break;
                                
                                    default:
                                        break;
                                }   
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
                case 8:
                    running=true;
                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha a garrafa (1 ou 2): ");
                        opcoes = batata.nextInt();
                        switch (opcoes) {
                            case 1:
                                System.out.println("\nA garrafa 1 tem " + garrafa1.capacidade + "ml e é feita de " + garrafa1.material);
                                System.out.println("1. Abrir");
                                System.out.println("2. Fechar");
                                batata.nextLine();
                                int opcoesgarrafa = batata.nextInt();
                                switch (opcoesgarrafa) {
                                    case 1:
                                        garrafa1.abrir();
                                        break;
                                    case 2:
                                        garrafa1.fechar();
                                        break;
                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }
                                
                                break;
                            case 2:
                                System.out.println("\nA garrafa 2 tem " + garrafa2.capacidade + "ml e é feita de " + garrafa2.material);
                                System.out.println("1. Abrir");
                                System.out.println("2. Fechar");
                                batata.nextLine();
                                opcoesgarrafa = batata.nextInt();
                                switch (opcoesgarrafa) {
                                    case 1:
                                        garrafa2.abrir();
                                        break;
                                    case 2:
                                        garrafa2.fechar();
                                        break;
                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }
                                
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
                case 9:
                    running = true;
                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha a caneta (1 ou 2): ");
                        opcoes = batata.nextInt();

                        switch (opcoes) {
                            case 1:
                                System.out.println("\nA caneta 1 é da marca " + caneta1.marca + " e sua cor é " + caneta1.cor);
                                System.out.println("1. Escrever");

                                batata.nextLine();
                                int opcoescaneta = batata.nextInt();

                                switch (opcoescaneta) {
                                    case 1:
                                        caneta1.escrever();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 2:
                                System.out.println("\nA caneta 2 é da marca " + caneta2.marca + " e sua cor é " + caneta2.cor);
                                System.out.println("1. Escrever");

                                batata.nextLine();
                                opcoescaneta = batata.nextInt();

                                switch (opcoescaneta) {
                                    case 1:
                                        caneta2.escrever();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 0:
                                running = false;
                                break;

                            default:
                                System.out.println("Inválido.");
                                break;
                        }
                    }
                    break;
                case 10:
                    running = true;
                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha o livro (1 ou 2): ");
                        opcoes = batata.nextInt();

                        switch (opcoes) {
                            case 1:
                                System.out.println("\nO livro 1 tem " + livro1.paginas + " páginas e sua capa é " + livro1.capa);
                                System.out.println("1. Ler");

                                batata.nextLine();
                                int opcoeslivro = batata.nextInt();

                                switch (opcoeslivro) {
                                    case 1:
                                        livro1.ler();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 2:
                                System.out.println("\nO livro 2 tem " + livro2.paginas + " páginas e sua capa é " + livro2.capa);
                                System.out.println("1. Ler");

                                batata.nextLine();
                                opcoeslivro = batata.nextInt();

                                switch (opcoeslivro) {
                                    case 1:
                                        livro2.ler();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 0:
                                running = false;
                                break;

                            default:
                                System.out.println("Inválido.");
                                break;
                        }
                    }
                    break;
                case 11:
                    running = true;

                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha a televisão (1 ou 2): ");
                        opcoes = batata.nextInt();

                        switch (opcoes) {
                            case 1:
                                System.out.println("\nA televisão 1 tem " + televisao1.botoes + " botão");
                                System.out.print("Escreva qualquer coisa para assistir à televisão: ");

                                batata.nextLine();
                                entrada = batata.nextLine();

                                televisao1.assistirtv(televisao1.tamanhodatela);

                                break;

                            case 2:
                                System.out.println("\nA televisão 2 tem " + televisao2.botoes + " botões");
                                System.out.print("Escreva qualquer coisa para assistir à televisão: ");

                                batata.nextLine();
                                entrada = batata.nextLine();

                                televisao2.assistirtv(televisao2.tamanhodatela);

                                break;

                            case 0:
                                running = false;
                                break;

                            default:
                                System.out.println("Inválido.");
                                break;
                        }
                    }

                    break;
                case 12:
                    running = true;
                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha o fogão (1 ou 2): ");
                        opcoes = batata.nextInt();

                        switch (opcoes) {
                            case 1:
                                System.out.println("\nO fogão 1 possui " + fogao1.bocas + " bocas e utiliza " + fogao1.combustivel);
                                System.out.println("1. Ligar");
                                System.out.println("2. Desligar");

                                batata.nextLine();
                                int opcoesfogao = batata.nextInt();

                                switch (opcoesfogao) {
                                    case 1:
                                        fogao1.ligarFogao();
                                        break;

                                    case 2:
                                        fogao1.desligarFogao();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 2:
                                System.out.println("\nO fogão 2 possui " + fogao2.bocas + " bocas e utiliza " + fogao2.combustivel);
                                System.out.println("1. Ligar");
                                System.out.println("2. Desligar");

                                batata.nextLine();
                                opcoesfogao = batata.nextInt();

                                switch (opcoesfogao) {
                                    case 1:
                                        fogao2.ligarFogao();
                                        break;

                                    case 2:
                                        fogao2.desligarFogao();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 0:
                                running = false;
                                break;

                            default:
                                System.out.println("Inválido.");
                                break;
                        }
                    }

                    break;
                case 13:
                    running = true;
                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha a geladeira (1 ou 2): ");
                        opcoes = batata.nextInt();

                        switch (opcoes) {
                            case 1:
                                System.out.println("\nA geladeira 1 possui " + geladeira1.portas + " portas e " + geladeira1.compartimentos + " compartimentos.");
                                System.out.println("1. Pegar gelo");

                                batata.nextLine();
                                int opcoesgeladeira = batata.nextInt();

                                switch (opcoesgeladeira) {
                                    case 1:
                                        geladeira1.pegargelo();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 2:
                                System.out.println("\nA geladeira 2 possui " + geladeira2.portas + " portas e " + geladeira2.compartimentos + " compartimentos.");
                                System.out.println("1. Pegar gelo");

                                batata.nextLine();
                                opcoesgeladeira = batata.nextInt();

                                switch (opcoesgeladeira) {
                                    case 1:
                                        geladeira2.pegargelo();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 0:
                                running = false;
                                break;

                            default:
                                System.out.println("Inválido.");
                                break;
                        }
                    }

                    break;
                case 14:
                    running = true;
                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha o ventilador (1 ou 2): ");
                        opcoes = batata.nextInt();

                        switch (opcoes) {
                            case 1:
                                System.out.println("\nO ventilador 1 possui " + ventilador1.helices + " hélices e " + ventilador1.botoes + " botão.");
                                System.out.println("1. Ligar ventilador");

                                batata.nextLine();
                                int opcoesventilador = batata.nextInt();

                                switch (opcoesventilador) {
                                    case 1:
                                        ventilador1.ligarventilador();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 2:
                                System.out.println("\nO ventilador 2 possui " + ventilador2.helices + " hélices e " + ventilador2.botoes + " botões.");
                                System.out.println("1. Ligar ventilador");

                                batata.nextLine();
                                opcoesventilador = batata.nextInt();

                                switch (opcoesventilador) {
                                    case 1:
                                        ventilador2.ligarventilador();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 0:
                                running = false;
                                break;

                            default:
                                System.out.println("Inválido.");
                                break;
                        }
                    }

                    break;
                case 15:
                    running = true;
                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha a bicicleta (1 ou 2): ");
                        opcoes = batata.nextInt();

                        switch (opcoes) {
                            case 1:
                                System.out.println("\nA bicicleta 1 é da cor " + bicicleta1.cor + " e é do tipo " + bicicleta1.tipo + ".");
                                System.out.println("1. Tocar sino");

                                batata.nextLine();
                                int opcoesbicicleta = batata.nextInt();

                                switch (opcoesbicicleta) {
                                    case 1:
                                        bicicleta1.tocarsino();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 2:
                                System.out.println("\nA bicicleta 2 é da cor " + bicicleta2.cor + " e é do tipo " + bicicleta2.tipo + ".");
                                System.out.println("1. Tocar sino");

                                batata.nextLine();
                                opcoesbicicleta = batata.nextInt();

                                switch (opcoesbicicleta) {
                                    case 1:
                                        bicicleta2.tocarsino();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 0:
                                running = false;
                                break;

                            default:
                                System.out.println("Inválido.");
                                break;
                        }
                    }

                    break;
                case 16:
                    running = true;
                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha o ônibus (1 ou 2): ");
                        opcoes = batata.nextInt();

                    switch (opcoes) {

                    case 1:
                        System.out.println("\nO ônibus 1 é da cor " + onibus1.cor + " e é do modelo " + onibus1.modelo + ".");
                        System.out.println("1. Buzinar");
                        System.out.println("2. Ligar");
                        System.out.println("3. Acelerar");
                        System.out.println("4. Freiar");

                        batata.nextLine();
                        int opcoesonibus = batata.nextInt();

                        switch (opcoesonibus) {
                            case 1:
                                onibus1.buzina();
                                break;

                            case 2:
                                onibus1.ligar();
                                break;

                            case 3:
                                onibus1.acelerar();
                                break;

                            case 4:
                                onibus1.freiar();
                                break;

                            default:
                                System.out.println("Inválido.");
                                break;
                        }

                        break;

                    case 2:
                        System.out.println("\nO ônibus 2 é da cor " + onibus2.cor + " e é do modelo " + onibus2.modelo + ".");
                        System.out.println("1. Buzinar");
                        System.out.println("2. Ligar");
                        System.out.println("3. Acelerar");
                        System.out.println("4. Freiar");

                        batata.nextLine();
                        opcoesonibus = batata.nextInt();

                        switch (opcoesonibus) {
                            case 1:
                                onibus2.buzina();
                                break;

                            case 2:
                                onibus2.ligar();
                                break;

                            case 3:
                                onibus2.acelerar();
                                break;

                            case 4:
                                onibus2.freiar();
                                break;

                            default:
                                System.out.println("Inválido.");
                                break;
                        }

                        break;

                        case 0:
                                running = false;
                                break;

                            default:
                                System.out.println("Inválido.");
                                break;
                }
            }
            break;
                case 17:
                    running = true;
                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha a Lampada (1 ou 2): ");
                        opcoes = batata.nextInt();

                        switch (opcoes) {
                            case 1:
                                System.out.println("\nA Lampada 1 é do formato " + lampada1.formato + " e sua cor é " + lampada1.cor);
                                System.out.println("1. Ligar");
                                System.out.println("2. Desligar");

                                batata.nextLine();
                                int opcoeslampada = batata.nextInt();

                                switch (opcoeslampada) {
                                    case 1:
                                        lampada1.ligar();
                                        break;

                                    case 2:
                                        lampada1.desligar();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                            break;

                            case 2:
                                System.out.println("\nA Lampada 2 é do formato " + lampada2.formato + " e sua cor é " + lampada2.cor);
                                System.out.println("1. Ligar");
                                System.out.println("2. Desligar");

                                batata.nextLine();
                                opcoeslampada = batata.nextInt();

                                switch (opcoeslampada) {
                                    case 1:
                                        lampada2.ligar();
                                        break;

                                    case 2:
                                        lampada2.desligar();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }
                                break;

                            case 0:
                                running = false;
                                break;

                            default:
                                System.out.println("Inválido.");
                                break;
                        }
                    }
                    break;
                case 18:
                    running = true;
                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha o espelho (1 ou 2): ");
                        opcoes = batata.nextInt();

                        switch (opcoes) {
                            case 1:
                                System.out.println("\nO espelho 1 é do formato " + espelho1.formato + " e seu tamanho é " + espelho1.tamanho);
                                System.out.println("1. Ver Reflexo");

                                batata.nextLine();
                                int opcoesespelho = batata.nextInt();

                                switch (opcoesespelho) {
                                    case 1:
                                        espelho1.refletir();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 2:
                                System.out.println("\nO espelho 2 é do formato " + espelho2.formato + " e seu tamanho é " + espelho2.tamanho);
                                System.out.println("1. Ver reflexo");

                                batata.nextLine();
                                opcoesespelho = batata.nextInt();

                                switch (opcoesespelho) {
                                    case 1:
                                        espelho2.refletir();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 0:
                                running = false;
                                break;

                            default:
                                System.out.println("Inválido.");
                                break;
                        }
                    }
                    break;
                case 19:
                    running = true;

                    while (running) {
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha o Guarda-Chuva (1 ou 2): ");
                        opcoes = batata.nextInt();

                        switch (opcoes) {

                            case 1:
                                System.out.println("\nO guarda-chuva 1 é da cor " + guardachuva1.cor + " e seu material é " + guardachuva1.material);
                                System.out.println("1. Abrir");
                                System.out.println("2. Fechar");

                                int opcoesguardachuva = batata.nextInt();

                                switch (opcoesguardachuva) {
                                    case 1:
                                        guardachuva1.abrir();
                                        break;

                                    case 2:
                                        guardachuva1.fechar();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 2:
                                System.out.println("\nO guarda-chuva 2 é da cor " + guardachuva2.cor + " e seu material é " + guardachuva2.material);
                                System.out.println("1. Abrir");
                                System.out.println("2. Fechar");

                                opcoesguardachuva = batata.nextInt();

                                switch (opcoesguardachuva) {
                                    case 1:
                                        guardachuva2.abrir();
                                        break;

                                    case 2:
                                        guardachuva2.fechar();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 0:
                                running = false;
                                break;

                            default:
                                System.out.println("Inválido.");
                                break;
                        }
                    }
                    break;
                case 20:
                    running = true;

                    while(running){
                        System.out.println("Digite 0 para sair.");
                        System.out.print("Escolha o Sapato (1 ou 2): ");
                        opcoes = batata.nextInt();

                        switch (opcoes) {

                            case 1:
                                System.out.println("\nO Sapato 1 é do tamanho " + sapato1.tamanho + " e sua cor é " + sapato1.cor);
                                System.out.println("1. Vestir");
                                System.out.println("2. Tirar");
                                System.out.println("3. Arremessar");

                                int opcoessapato = batata.nextInt();

                                switch (opcoessapato) {
                                    case 1: {
                                        System.out.println("Digite o seu tamanho: ");
                                        int seu_tamanho = batata.nextInt();

                                        sapato1.vestir(seu_tamanho);
                                        break;
                                    }

                                    case 2:
                                        sapato1.tirar();
                                        break;

                                    case 3:
                                        sapato1.arremessar();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 2:
                                System.out.println("\nO Sapato 2 é do tamanho " + sapato2.tamanho + " e sua cor é " + sapato2.cor);
                                System.out.println("1. Vestir");
                                System.out.println("2. Tirar");
                                System.out.println("3. Arremessar");

                                opcoessapato = batata.nextInt();

                                switch (opcoessapato) {
                                    case 1: {
                                        System.out.println("Digite o seu tamanho: ");
                                        int seu_tamanho = batata.nextInt();

                                        sapato2.vestir(seu_tamanho);
                                        break;
                                    }

                                    case 2:
                                        sapato2.tirar();
                                        break;

                                    case 3:
                                        sapato2.arremessar();
                                        break;

                                    default:
                                        System.out.println("Inválido.");
                                        break;
                                }

                                break;

                            case 0:
                                running = false;
                                break;

                            default:
                                System.out.println("Inválido.");
                                break;
                        }
                    }
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