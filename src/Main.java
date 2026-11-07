import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
// Taller de practica de programación
//Punto 1)
public class Main {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);

        //   System.out.print("Ingrese el texto1: ");
        //  String texto1 =texto.nextLine();
        //  System.out.print("Ingrese el texto2: ");
        //  String texto2 = texto.nextLine();
        //  String union = texto1.concat(" ").concat(texto2);


        //  System.out.println(union);


        //   String hola= "Hola";
        //System.out.print("Escribe tu nombre: ");
        //  String nombre = texto.nextLine();
        //  String resultado = hola + " " + nombre;
        // System.out.println(resultado);

        // System.out.print(" Escribe un numero: ");
        //Double numero = texto.nextDouble();
        // Double operacion = Math.pow(numero, 2);

        // System.out.print("El cuadrado del numero es" + " " + operacion);


        //System.out.print("Ingrese el n1: ");
        //Double n1 = texto.nextDouble();
        // System.out.print("Ingrese el n2: ");
        // Double n2 = texto.nextDouble();
        //Double suma = n1+n2;
        // System.out.println("El resultado es" + suma);


        //System.out.print("Ingrese n3");
        // Double n3 = texto.nextDouble();
        // System.out.print("Ingrese n4");
        // Double n4 = texto.nextDouble();
        // Double suma2 = n3+n4;
        // Double resta = n3-n4;
        // Double multiplicacion = n3 * n4;
        // Double division = n3/n4;
        // Double residuo = n3%n4;
        // System.out.println("Las operaciones de los siguientes numeros: " + "suma" + " " + suma2 + " " +  "resta" + " " +
        //        resta + " " + "multiplicacion" + " " +  multiplicacion +" " + "division" + " " + division + " " + "residuo" + " " + residuo);
        // System.out.print("Ingresa un numero decimal");
        //double  numeroentero = texto.nextDouble();
        //int entero = (int) numeroentero;
        // double decimal = numeroentero-entero;
        // System.out.println("Parte decimal" + " "+ decimal + " " + "Parte entera"+ " "+ entero);

        //  System.out.print("Ingrese su nota 1 (de 0 hasta 50)");
        // double nota1=texto.nextDouble();
        // System.out.print("Ingrese su nota 2 (de 0 hasta 50)");
        //  double nota2=texto.nextDouble();
        //  System.out.print("Ingrese su nota 3 (de 0 hasta 50) ");
        // double nota3=texto.nextDouble();
        // System.out.print("Ingrese su nota 4 (de 0 hasta 50) ");
        //double nota4=texto.nextDouble();
        // System.out.print("Ingrese su nota 5 (de 0 hasta 50) ");
        // double nota5=texto.nextDouble();

        // double calcularPromedio= nota1*0.15 + nota2*0.20 + nota3*0.15 + nota4*0.30 + nota5*0.20;

        //System.out.println(" Su nota final es " + calcularPromedio);
        //  double Iva = 0.19;
        //System.out.print("Ingresa el precio original del producto");
        //double precioBruto=texto.nextDouble();
        //double valorIva= Iva*precioBruto;
        //double valorTotalIva=valorIva+precioBruto;
        //System.out.println("El precio bruto es" + " " + precioBruto + "El valor del iva es " + " "+ valorIva + "El valor total con iva es de:" + " " + valorTotalIva);
        //System.out.println("Ingrese el radio de su circulo");
        //double radio=texto.nextDouble();
        //double area= Math.pow(radio,2) * Math.PI;
        //double perimetro= 2 * Math.PI * radio;
        //System.out.println("Este es el area de su circulo: "+ " "+ area + "Este es el perimetro de su circulo" +" " + perimetro);
        //System.out.println("Ingrese el perimetro de su hexagono");
        //double perimetroh=texto.nextDouble();
        //System.out.println("Ingrese el apotema de su hexagono");
        //double apotema = texto.nextDouble();
        //double ahexagono = (perimetroh* apotema)/2;
        //System.out.println("Este es el area del hexagono"+ " "+ ahexagono);
        //     System.out.println("Ingrese la cantidad de numero que va a registrar");
        //    double nnumeros = texto.nextDouble();
        //    double acumuludonum = 0;
        //    for (int i = 1; i <= nnumeros; i++) {
        //        System.out.println("Ingrese el numero a registrar");
        //        double nummmmmm = texto.nextDouble();
        //        acumuludonum = acumuludonum + nummmmmm;
        //     }
        //    double promedionumeros = acumuludonum / nnumeros;
        //    System.out.println("El promedio es : " + promedionumeros);
        //System.out.println("Digite la coordenada x1");
        //double x1=texto.nextDouble();
        //System.out.println("Digite la coordenada x2");
        //double x2=texto.nextDouble();
        //System.out.println("Digite la coordenada y1");
        //double y1=texto.nextDouble();
        //System.out.println("Digite la coordenada y2");
        //double y2=texto.nextDouble();
        //double distancia= Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        //System.out.println("Esta es la distancia entre las coordenadas" + " " +distancia);

        //      System.out.println("Ingres el valor n");
        //    int n9 = texto.nextInt();
        //   System.out.println(n9 + " " + n9 + n9 + " " + n9 + n9 + n9);
        //   System.out.println("Suma: " + (n9 + (n9 * 101) + (n9 * 10101)));
        //System.out.println("Ingrese la cantidad de segundos");
        //int segundos=texto.nextInt();
        //int minutos= (segundos%3600)/60;
        //int horas= segundos/3600;
        //int segundos1=segundos% 60;
        //System.out.println("Esta es la hora: " +" "+ horas +":"+ minutos+":" +segundos1 );
        //System.out.println("Ingrese el numero");
        // int nip=texto.nextInt();
        // if (nip%2==0) {
        //     System.out.println("El numero es par");
        // }
        // else{
        //        System.out.println("El numero es impar");

        //    }
        // System.out.println("Ingrese el numero");
        //int nmm=texto.nextInt();
        //      if(nmm > 0){
        //        System.out.println("El numero es positivo");
        //  } else if (nmm < 0 ){
        //    System.out.println("El nummero es negativo");
        // } else{
        //     System.out.println("El numero es 0");
        // }
        //   System.out.println("Ingrese el valor de la venta");
        //   double ventaa = texto.nextInt();
        //   double ivavent = ventaa * Iva;
        //   double ventatotaliva = ivavent + ventaa;
        //   if (ventatotaliva > 150000) {
        //        double descuento = 0.05 * ventatotaliva;
        //       double totalvalordescuento = ventatotaliva - descuento;
        //       System.out.println("El valor total de la venta es " + totalvalordescuento);
        //    } else {
        //       System.out.println("El valor total de la venta es" + ventatotaliva);


        //    }
        //    System.out.println("Escribe la nota1");
        //    double nn1 = texto.nextDouble() * 0.15;
        //   System.out.println("Escribe la nota 2");
        //   double nn2 = texto.nextDouble() * 0.20;
        //   System.out.println("Escribe la nota3");
        //   double nn3 = texto.nextDouble() * 0.15;
        //    System.out.println("Escribe la nota4");
        //     double nn4 = texto.nextDouble() * 0.30;
        //    System.out.println("Escribe la nota5");
        //    double nn5 = texto.nextDouble() * 0.20;
        //    double totalnota = nn1 + nn2 + nn3 + nn4 + nn5;
        //     if (totalnota < 20) {
        //         System.out.println("Lamentablemente no puede habilitar");
        //     } else if (totalnota < 30) {
        //          System.out.println("Lamentablemente usted reprobo");

        //     } else if (totalnota >= 30) {
        //        System.out.println("Enhorabuena aprobo");
        //    } else {
        //         System.out.println("Felicitaciones aprobo con merito");
        //    }
        //      System.out.println("Ingrese a ");
        //       double a = texto.nextDouble();
        //      System.out.println("Ingrese b");
        //      double b = texto.nextDouble();
        //     System.out.println("Ingrese c ");
        //     double c = texto.nextDouble();

        //    double disc = b * b - 4 * a * c;

        //    if (disc >= 0) {
            //        double x1 = (-b + Math.sqrt(disc)) / (2 * a);
        //        double x2 = (-b - Math.sqrt(disc)) / (2 * a);
        //       System.out.println("x1=" + x1);
        //       System.out.println("x2= " + x2);

        //   } else {
        //        System.out.println("No tiene soluciones reales");
        //     }
        // Suponiendo que es un programa para comparar y no un sistema que tiene almacenado millones de usuarios porque
        // no tendria sentido decirle que la contraseña esta mal porque esa contraseña la puede tener otro usuario
        String contraseñacorrecta = "perrolindo10";
        String usuariocorrecto = "juan2007";
        System.out.println("Ingrese su usuario");
        String usuarioingresado = texto.next();
        System.out.println("Ingrese su contraseña");
        String contraseñaingresada = texto.next();

        if (usuariocorrecto.equals(usuarioingresado)) {
            if (contraseñacorrecta.equals(contraseñaingresada)) {
                System.out.println("Usuario y contraseña correctos");
            } else {
                System.out.println("Contraseña incorrecta");
            }
        } else {
            System.out.println("Usuario incorrecto");
        }
        //     System.out.println("Ingrese un numero entre 0 y 10");
        //    int numeroNombre = texto.nextInt();
        //   switch (numeroNombre) {
        //        case 0:
        //          System.out.println("CERO");
        //          break;
        //      case 1:
        //        System.out.println("UNO");
        //        break;
        //     case 2:
        //         System.out.println("DOS");
        //          break;
        //     case 3:
        //          System.out.println("TRES");
        //          break;
        //      case 4:
        //          System.out.println("CUATRO");
        //          break;
        //      case 5:
        //          System.out.println("CINCO");
        //          break;
        //      case 6:
        //          System.out.println("SEIS");
        //          break;
        //      case 7:
        //          System.out.println("SIETE");
        //          break;
        //      case 8:
        //          System.out.println("OCHO");
        //          break;
        //      case 9:
        //          System.out.println("NUEVE");
        //          break;
        //      case 10:
        //          System.out.println("DIEZ");
        //          break;
        //      default:
        //          System.out.println("El numero debe estar entre 0 y 10");
        //  }
        System.out.println("Ingrese un numero menor que 100000");
        int ndigit = texto.nextInt();

        if (ndigit < 0) {
            ndigit = ndigit * -1;
        }

        if (ndigit >= 100000) {
            System.out.println("El numero ingresado no cuimple la condicion");
        } else {

            int cantdigit;

            if (ndigit < 10) {
                cantdigit = 1;
            } else if (ndigit < 100) {
                cantdigit = 2;
            } else if (ndigit < 1000) {
                cantdigit = 3;
            } else if (ndigit < 10000) {
                cantdigit = 4;
            } else {
                cantdigit = 5;
            }

            System.out.println("La cantidad de digitos es: " + cantdigit);
        }
        System.out.println("Ingrese el primer numero de la secuencia");
        int numerocomp1=texto.nextInt();
        System.out.println("Ingrese el segundo numero de la secuencia");
        int numerocomp2=texto.nextInt();
        System.out.println("Ingrese el tercer numero de la secuencia");
        int numerocomp3=texto.nextInt();
        if (numerocomp1 < numerocomp2 && numerocomp2 < numerocomp3) {
            System.out.println("Los numeros estan incrementando");

        } else if (numerocomp1 > numerocomp2 && numerocomp2 > numerocomp3) {
            System.out.println("Los numeros estan disminuyendo");

        } else {
            System.out.println("Los numeros no incrementan ni disminuyen");
        }
        System.out.println("Ingrese un numero del 1 al 7");
        int dia=texto.nextInt();
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El numero debe estar entre 1 a 7");
                break;
        }
        
    }
    }