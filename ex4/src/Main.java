public class Main {
    public static void main(String[] args) {
        RoboAspirador robo1 = new RoboAspirador(1, 100);
        RoboAspirador robo2 = new RoboAspirador(2, 50);


        robo1.ligar();
        robo1.andar(5, 3);
        robo1.aspirar(30);
        robo1.parar();
        robo1.aspirar(80);
        System.out.println(robo1);

        robo2.ligar();
        robo2.andar(2, 4);
        robo2.aspirar(25);
        robo2.parar();
        robo2.aspirar(30);
        System.out.println(robo2);
    }
}

