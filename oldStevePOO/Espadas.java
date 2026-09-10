public class Espadas {

    private int durablidade;
    private int forca;

    public Espadas(int durablidade, int forca) {
        this.durablidade = durablidade;
        this.forca = forca;
    }

    public int getDurablidade() {
        return durablidade;
    }

    public void setDurablidade(int durablidade) {
        this.durablidade = durablidade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void EspadaMadeira() {

        durablidade = 20;
        forca = 10;

        System.out.print("Sua espada de madeira tem:\n" +
                         "Duração: " + durablidade + "\n" +
                         "Força: " + forca);
    }

    public void EspadaPedra() {

        durablidade = 34;
        forca = 20;

        System.out.print("Sua espada de pedra tem:\n" +
                         "Duração: " + durablidade + "\n" +
                         "Força: " + forca);
    }

    public void EspadaFerro() {

        durablidade = 46;
        forca = 37;

        System.out.print("Sua espada de ferro tem:\n" +
                         "Duração: " + durablidade + "\n" +
                         "Força: " + forca);
    }

    public void EspadaOuro() {

        durablidade = 48;
        forca = 40;

        System.out.print("Sua espada de ouro tem:\n" +
                         "Duração: " + durablidade + "\n" +
                         "Força: " + forca);
    }

    public void EspadaDiamnte() {

        durablidade = 62;
        forca = 50;

        System.out.print("Sua espada de diamante tem:\n" +
                         "Duração: " + durablidade + "\n" +
                         "Força: " + forca);
    }

   public void BlocosMinerados() {

    int blocos = 10;

    for (int i = 0; i < blocos; i++) {

        durablidade -= 4;
        forca -= 2;

        if (durablidade <= 0) {
            durablidade = 0;
            System.out.println("Sua espada quebrou!");
            break;
        }

        System.out.println("Durabilidade: " + durablidade);
        System.out.println("Força: " + forca);
    }

    System.out.println("Mineração encerrada.");
}
}