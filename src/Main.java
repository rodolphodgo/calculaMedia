public class Main {
    public static void main(String[] args) {
        double N1, N2, RES;
        System.out.print("Escreva o primeiro valor: ");
        N1 = Double.parseDouble(System.console().readLine());
        System.out.print("Escreva o segundo valor: ");
        N2 = Double.parseDouble(System.console().readLine());
        RES = (N1 + N2) / 2;
        System.out.print("A média entre os dois valores digitados é ");
        System.out.println(RES);
    }
}
