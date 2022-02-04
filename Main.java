import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
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
    }
  }
}