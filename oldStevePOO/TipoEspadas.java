import java.util.Scanner;

public class TipoEspadas extends Espadas {

    public TipoEspadas(int durabilidade, int forca) {
        super(durabilidade, forca);
    }

    public static void main(String[] args) {

        int op = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Ola Steve! Aqui você pode escolher a espada que quiser!!!");
        System.out.println("---------------------------------------------");
        System.out.println("Faça a escolha do tipo de espada:");
        System.out.println("1 -- Madeira");
        System.out.println("2 -- Pedra");
        System.out.println("3 -- Ferro");
        System.out.println("4 -- Ouro");
        System.out.println("5 -- Diamante");
        System.out.println("---------------------------------------------");

        op = ler.nextInt();
        ler.nextLine();

        Espadas espada = new Espadas(0, 0);

        switch (op) {

            case 1:
                System.out.println("Boa escolha para iniciar, Steve!");

                espada.EspadaMadeira();

                System.out.print("Quer usar sua espada? sim / nao: ");
                String resposta = ler.nextLine();

                boolean verdade;

                if (resposta.equals("sim")) {
                    verdade = true;
                    espada.BlocosMinerados();
                } else {
                    verdade = false;
                    System.out.println("Obrigado por jogar!");
                }

                break;

            case 2:
                System.out.println("Boa escolha Steve, é a clássica!");

                espada.EspadaPedra();

                System.out.print("Quer usar sua espada? sim / nao: ");
                resposta = ler.nextLine();

                if (resposta.equals("sim")) {
                    verdade = true;
                    espada.BlocosMinerados();
                } else {
                    verdade = false;
                    System.out.println("Obrigado por jogar!");
                }

                break;

            case 3:
                System.out.println("Boa escolha Steve, com essa você vai se aprimorar muito!");

                espada.EspadaFerro();

                System.out.print("Quer usar sua espada? sim / nao: ");
                resposta = ler.nextLine();

                if (resposta.equals("sim")) {
                    verdade = true;
                    espada.BlocosMinerados();
                } else {
                    verdade = false;
                    System.out.println("Obrigado por jogar!");
                }

                break;

            case 4:
                System.out.println("Que escolha interessante, Steve!");

                espada.EspadaOuro();

                System.out.print("Quer usar sua espada? sim / nao: ");
                resposta = ler.nextLine();

                if (resposta.equals("sim")) {
                    verdade = true;
                    espada.BlocosMinerados();
                } else {
                    verdade = false;
                    System.out.println("Obrigado por jogar!");
                }

                break;

            case 5:
                System.out.println("Melhor que essa só encantando agora!");

                espada.EspadaDiamnte();

                System.out.print("Quer usar sua espada? sim / nao: ");
                resposta = ler.nextLine();

                if (resposta.equals("sim")) {
                    verdade = true;
                    espada.BlocosMinerados();
                } else {
                    verdade = false;
                    System.out.println("Obrigado por jogar!");
                }

                break;

            default:
                System.out.println("Melhor ir com mais calma, Steve!");
        }

        ler.close();
    }
}