package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        // Estructura de control if
        /*
        if(condition) {
        } else if () {
        } else {
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        System.out.println("¿Cual es tu nombre?");
        sc.nextLine();
        String nombre = sc.nextLine();
        if(edad > 18) {
            System.out.println("Felicidades " + nombre + "puedes votar");
        } else {
            System.out.println(nombre + "no puedes votar");
        }
        //  Scanner sc = new Scanner(System.in);  //Se crea un objeto Scanner
        // lado1,lado2,lado3;
/*
                System.out.println("ingresa los lados de un triangulo");
                System.out.println("ingresa primer lados");
                 boolean  lado1= sc.nextBoolean();
                System.out.println("ingresa primer lados");
                boolean lado2= sc.nextBoolean();
                System.out.println("ingresa primer lados");
                boolean lado3= sc.nextBoolean();


                if(lado1==lado2==lado3){
                    System.out.println("es un triangulo equlatero");
                } else if(lado1==lado2!=lado3){
        System.out.println("es un triangulo isoceless");
        }else{
        System.out.println("es un triangulo escleno");
        }
    }
}

 ------
        int a;
        System.out.println("Ingresa el año");
        a = sc.nextInt();

        if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))) {
            System.out.println( " El año" + a + " resulto ser bisiesto" );
        }else {
            System.out.println( " El año " + a + " resulto ser no es bisiesto");
        }
    }
}*/
/*
        Scanner datos = new Scanner(System.in);
        System.out3.println("Ingrsa primer numero:");
        int numero1 = datos.nextInt();
        System.out.println("Ingresa segundo numero:");
        int numero2 = datos.nextInt();
        System.out.println("operacion a realizar : \n1)Suma:\n 2)Resta");
        int operacion = datos.nextInt();
        float resultado = 0;
        switch (operacion) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            default:
                System.out.println("elleccion invalida");
                break;

        }
        System.out.println(resultado);
    }
}
*/
        Scanner dia = new Scanner(System.in);
        System.out.println("ingresa dia");
        int dato = dia.nextInt();

        switch (dato) {
            case 1:

        System.out.println("lunes");
        break;
            case 2:

        System.out.println("martes");

        break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
            case 5:
                System.out.println("viernes");
                break;
                case 6:
                System.out.println("sabado");
                break;
                case 7:
            System.out.println("Domingo");
                break;

        default:
        System.out.println("no esta en el semana");

        break;
    }

}
}