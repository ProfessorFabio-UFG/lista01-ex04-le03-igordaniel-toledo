public class RoboAspirador {
    private int id;
    private String status;
    private int posicaoX;
    private int posicaoY;
    private int quantidadePo;
    private int limitePo;

    public RoboAspirador(int id, int limitePo) {
        this.id = id;
        this.limitePo = limitePo;
        this.status = "Desligado";
        this.posicaoX = 0;
        this.posicaoY = 0;
        this.quantidadePo = 0;
    }

    public void ligar() {
        status = "Ligado";
        System.out.println("Robô " + id + " ligado.");
    }

    public void desligar() {
        status = "Desligado";
        System.out.println("Robô " + id + " desligado.");
    }

    public void andar(int x, int y) {
        if (!status.equals("Ligado")) {
            System.out.println("Robô " + id + " está desligado. Ligue-o primeiro.");
            return;
        }
        posicaoX += x;
        posicaoY += y;
        status = "Andando";
        System.out.println("Robô " + id + " andou para a posição (" + posicaoX + ", " + posicaoY + ").");
    }

    public void parar() {
        if (!status.equals("Ligado") && !status.equals("Andando")) {
            System.out.println("Robô " + id + " está desligado. Ligue-o primeiro.");
            return;
        }
        status = "Parado";
        System.out.println("Robô " + id + " parado.");
    }

    public void aspirar(int quantidade) {
        if (!status.equals("Ligado") && !status.equals("Andando") && !status.equals("Parado")) {
            System.out.println("Robô " + id + " está desligado. Ligue-o primeiro.");
            return;
        }

        quantidadePo += quantidade;
        if (quantidadePo >= limitePo) {
            quantidadePo = limitePo;
            System.out.println("Robô " + id + " atingiu o limite de pó! Desligando automaticamente.");
            desligar();
        } else {
            System.out.println("Robô " + id + " aspirou " + quantidade + " de pó. Total: " + quantidadePo);
        }
    }

    @Override
    public String toString() {
        return "\nRobo ID: " + id +
                "\nStatus: " + status +
                "\nPosição: (" + posicaoX + ", " + posicaoY + ")" +
                "\nQuantidade de pó: " + quantidadePo +
                "\nLimite de pó: " + limitePo + "\n";
    }
}
