import java.util.*;
class Main {
  public static void main(String[] args) {

    Scanner read = new Scanner(System.in);

    /*Discusion1
    //Crear un programa en consola que me permita saber si dos números son divisibles entre sí, para saber si un número es divisible por otro se tiene que obtener el modulo y si este es cero entonces este número es divisible por el otro. *

    int num1, num2, result;

    System.out.print("Programa para saber si dos numeros son divisibles...");
    System.out.println("Ingresa el primer numero: ");
    num1 = read.nextInt();
    System.out.println("Ingresa el segundo numero: ");
    num2 = read.nextInt();

    result = num1 % num2;

    if(result == 0){
      System.out.print("Los numeros son divisibles");
    }else{
      System.out.print("No son divisibles");
    }*/

    //Discusion2
    //Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores
    
    /*int valor1,valor2, nota;
    valor1=0;
    valor2=0;

    for(int k=1; k <= 10; k++){
        System.out.println("Ingrese valor nota del alumno "+k+" : ");
        nota = read.nextInt();
        if(nota>=7){
            valor1=valor1+1;
        }else if(nota>0){
            valor2=valor2+1;
        }
    }
    System.out.println("La cantidad de alumnos que tienen notas mayores o iguales a 7 son: "+valor1);
    System.out.println("La cantidad de alumnos que tienen notas menores a 7 son: "+valor2);*/

    //Discusion3
    //Desarrollar un programa que permita cargar n números enteros y luego nos informe cuántos valores fueron pares y cuántos impares

    /*int n, valor1, valor2, k, cont;
    valor1=0;
    valor2=0;
    cont=0;

    System.out.println("Cuantos numeros va a ingresar?: ");
    k = read.nextInt();

    for(n=0; n<k; n++){

        System.out.println("Ingrese numero en posicion: "+n);
        cont = read.nextInt();

        if(cont%2==0){
            valor1=valor1+1;
        }else{
            valor2=valor2+1;
        }
    }
    System.out.println("La cantidad de valores pares son: "+valor1);
    System.out.println("La cantidad de valores impares: "+valor2);
    */

    //Discusion4
    // Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano. Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante. Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar.

    int cuad1, cuad2, cuad3, cuad4, cant, x, y;

    cuad1=0;
    cuad2=0;
    cuad3=0;
    cuad4=0;

    System.out.println("Cuantos puntos procesara?: ");
    cant = read.nextInt();

    for(int f=1; f<=cant; f++){
        System.out.println("Ingrese coordenada en x: ");
        x = read.nextInt();
        System.out.println("Ingrese coordenada en y: ");
        y = read.nextInt();
        if(x > 0 && y > 0){
            cuad1++;
        }else{
            if(x < 0 && y > 0){
                cuad2++;
            }else{
                if(x < 0 && y < 0){
                    cuad3++;
                }else{
                    if(x > 0 && y < 0){
                        cuad4++;
                    }
                }
            }
        }
    }
    System.out.println("Cantidad en el 1er cuadrante: "+cuad1);
    System.out.println("Cantidad en el 2do cuadrante: "+cuad2);
    System.out.println("Cantidad en el 3er cuadrante: "+cuad3);
    System.out.println("Cantidad en el 4to cuadrante: "+cuad4);
  }
}