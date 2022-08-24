package com.andresgalvano;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int num;
        String numero=String.valueOf(num)
                //Esto es para invertir el numero
                , reverse=new StringBuffer(numero).reverse().toString();
        System.out.print("Digite el numero: ");
        num=scanner.nextInt();scanner.nextLine();
        if(1<=num&&num<=100) {
            if (numero.length() == 1)
            {
                System.out.print("El numero tiene un digito");
            }
            else if(numero.length()==2)
            {
                System.out.println("El numero tiene dos digitos ");
            }
            else
            {
                System.out.println("El numero tiene tres digitos");
            }
        }
        else
        {
            System.out.println("Numero incorrecto");
        }
    }
}