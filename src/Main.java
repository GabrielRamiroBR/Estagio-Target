public class Main {
    public static void main(String[] args) {
        //Questão 01
        int indice = 13, soma = 0, k = 0;

        while (k < indice){
            k += 1;
            soma += k;
        }

        System.out.println(soma);

        //Questão 02
        System.out.println(Fibonacci.eFibonacci(89));

        //Questão 03
        //a)
        int a = 7 + (7-5);
        //b)
        int b = 64 * 2;
        //c)
        int c = 7 * 7;
        //d)
        int d = 64 + 36;
        //e)
        int e = 8 + 5;
        //f)
        int f = 200;
        System.out.println(a  +"\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f);

        //Questao 04
        double distancia = 100;
        double velocidadeCarro = 110;
        double velocidadeCaminhao = 80;
        double tempoPedagioCaminhao = (2 * 5)/60; //tmepo do pedagio em horas;

        //distancia que o carro percorre enquanto o caminhao está no pedagio
        double distanciaCarro = velocidadeCarro * tempoPedagioCaminhao;
        distancia = distancia - distanciaCarro;

        double tempoCruzamento = distancia / (velocidadeCarro + velocidadeCaminhao);
        distanciaCarro = distanciaCarro + (velocidadeCarro * tempoCruzamento);

        System.out.println("O tempo de cruzamento entre o caminhão e o carro é de "
                + Math.round(tempoCruzamento * 100.0)/100.0
                + " horas, e ambos se encontram igualmente distantes de Ribeirão Preto, a uma distância de "
                + Math.round(distanciaCarro * 100.0)/100.0 +" km");

        //Questao 05

        System.out.println(Reversor.revertString("borboleta"));
    }
}