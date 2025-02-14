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

        //Operadores
        int a = 1, b = 2;
        System.out.println("a: " + a + " b: " + b);
        a++; //postincremento
        ++b; //preincremento
        System.out.println("a: " + a + " b: " + b);
        int c = a++ * ++b;
        System.out.println("a: " + a + " b: " + b + " c: " + c);

        //precedencia de operadores () ++ -- */% +- << = ==!= > >=  || && !
        boolean bo = (2+8) < ++a || 2 + 5 * 9 == a++ + 43;
        //10 < ++a || 2 + 5 * 9 == 4++ + 43;
        //10 < 4 || 2 + 5 * 9 == 4 + 43; (a vale 5)
        //10 < 4 || 2 + 45 == 47
        //10 < 4 || 47 == 47
        //false || true
        //true
        System.out.println("bo: " + bo);
        bo = ++a < 10 || ++a == 6; //no hace la segunda parte del or porque la primera ya es true (||)
        System.out.println("bo: " + bo + " a: " + a);
        bo = ++a < 10 | ++a == 6; //hace las dos partes del or aunque la primera sea verdadera (|)
        System.out.println("bo: " + bo + " a: " + a);

        cad = "Hola";
        //Sobrecarga de operadores: el operador se comporta de forma diferente
        //Segun sus operandos
        a = 1 + 1; // + es suma algebraica
        cad = "1" + "1" + 2 + 3; // + es concatencacion incluir otro tipo se denomina wrapping
        System.out.println("cad: " + cad);
        String cad1 = cad.substring(3, 4); //posicion inicial (0->) posicion final (1->)
        System.out.println("cad1: " + cad1);

        bo = "hola" .equals("Hola");
        System.out.println("bo: " + bo);

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