package ec.calculator;

public class CalcularaMain {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("La suma de 3 + 5 es = "+ calculadora.sumar(3,5));

        System.out.println("Cambia realizado");

        System.out.println("La resta de 5 - 3 es = "+ calculadora.restar(5,3));

    }

}
