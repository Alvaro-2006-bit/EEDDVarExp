import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!\n");

        int vi = 2;
        double vd = 2.3;
        char vc ='A';
        String cad = "hola";
        boolean vb = false;
        System.out.println("vi: " + vi + " vd: " +vd);

        //Conversion de tipos de datos cambio
        vi = (int)2.8 + (int)1.6;
        System.out.println("vi: " + vi);
        vi = (int)(2.8 + 1.6);
        System.out.println("vi: " + vi);
        vi = vc + 1;
        System.out.println("vi (entero): " + vi + " vi (char): " + (char)vi);
        System.exit(0);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un entero: ");
        vi = sc.nextInt();
        System.out.println("El numero que has ingresado es: "+vi);


        if (vi % 2 == 0){
            System.out.println("El numero " + vi + " es par");
        }else{
            System.out.println("El numero " + vi + " es impar");
        }

        if (vi < 50) {
            System.out.println("El numero " + vi + " es menor que 50");
        }else if (vi > 50){
            System.out.println("El numero " + vi + " es mayor que 50");
        }else{
            System.out.println("El numero " + vi + " es 50");
        }

        System.out.println("Introduzca color (R/r, V/v, A/a): ");
        cad = sc.next();
        vc = cad.charAt(0);
        switch(vc){
            case 'R':
            case 'r':
                System.out.println("Color Rojo");
                break;
            case 'V':
            case 'v':
                System.out.println("Color Verde");
                break;
            case 'A':
            case 'a':
                System.out.println("Color Azul");
                break;
            default:
                System.out.println("Color Erroneo");
        }

        //bucle conociendo el numero de iteraciones
        int suma1 = 0, suma2 = 0;
        for(int i = 0; i < 10; i++){
            suma1 = suma1 + i;
            suma2 += 1;
        }
        System.out.println("Suma1: " + suma1 + "; Suma2: " + suma2);

        //bucle while sin conocer el numero de iteraciones
        //bucle que solicite al usuario numeros hasta que introduzca uno par
        int numero = 3;
        System.out.println("Introduce un numero: ");
        while (numero % 2 != 0){
            numero = sc.nextInt();
            if (numero % 2 == 0){
                System.out.println("El numero " + numero + " es par");
            }else{
                System.out.println("El numero " + numero + " es impar, introduzca otro numero");
            }
        }

        int numero1 = 3, numero2 = 0;
        System.out.println("Introduce un numero: ");
        while (numero1 % 2 != 0){
            numero1 = sc.nextInt();
            if (numero1 % 2 == 0){
                System.out.println("El numero " + numero1 + " es par, introduzca otro numero");
                numero2 = sc.nextInt();
                if (numero2 % 2 == 0){
                    System.out.println("Has ingresado dos numeros pares consecutivos");
                }else{
                    System.out.println("El segundo numero es impar vuelve a introducir otros numeros");
                }
            }else{
                System.out.println("El numero " + numero1 + " es impar, introduzca otro numero");
            }
        }
    }
}