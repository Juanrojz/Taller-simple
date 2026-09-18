import java.util.Scanner;
// Taller de practica de programación
//Punto 1)
public class Main {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);

        System.out.print("Ingrese el texto1: ");
        String texto1 =texto.nextLine();
        System.out.print("Ingrese el texto2: ");
        String texto2 = texto.nextLine();
        String union = texto1.concat(" ").concat(texto2);



        System.out.println(union);


        String hola= "Hola";
        System.out.print("Escribe tu nombre: ");
        String nombre = texto.nextLine();
        String resultado = hola + " " + nombre;
        System.out.println(resultado);

        System.out.print(" Escribe un numero: ");
        Double numero = texto.nextDouble();
        Double operacion = Math.pow(numero, 2);

        System.out.print("El cuadrado del numero es" + " " + operacion);


        System.out.print("Ingrese el n1: ");
        Double n1 = texto.nextDouble();
        System.out.print("Ingrese el n2: ");
        Double n2 = texto.nextDouble();
        Double suma = n1+n2;
        System.out.println("El resultado es" + suma);


        System.out.print("Ingrese n3");
        Double n3 = texto.nextDouble();
        System.out.print("Ingrese n4");
        Double n4 = texto.nextDouble();
        Double suma2 = n3+n4;
        Double resta = n3-n4;
        Double multiplicacion = n3 * n4;
        Double division = n3/n4;
        Double residuo = n3%n4;
        System.out.println("Las operaciones de los siguientes numeros: " + "suma" + " " + suma2 + " " +  "resta" + " " +
                resta + " " + "multiplicacion" + " " +  multiplicacion +" " + "division" + " " + division + " " + "residuo" + " " + residuo);
        System.out.print("Ingresa un numero decimal");
        double  numeroentero = texto.nextDouble();
        int entero = (int) numeroentero;
        double decimal = numeroentero-entero;
        System.out.println("Parte decimal" + " "+ decimal + " " + "Parte entera"+ " "+ entero);

        System.out.print("Ingrese su nota 1 (de 0 hasta 50)");
        double nota1=texto.nextDouble();
        System.out.print("Ingrese su nota 2 (de 0 hasta 50)");
        double nota2=texto.nextDouble();
        System.out.print("Ingrese su nota 3 (de 0 hasta 50) ");
        double nota3=texto.nextDouble();
        System.out.print("Ingrese su nota 4 (de 0 hasta 50) ");
        double nota4=texto.nextDouble();
        System.out.print("Ingrese su nota 5 (de 0 hasta 50) ");
        double nota5=texto.nextDouble();

        double calcularPromedio= nota1*0.15 + nota2*0.20 + nota3*0.15 + nota4*0.30 + nota5*0.20;

        System.out.println(" Su nota final es " + calcularPromedio);

        }
    }
