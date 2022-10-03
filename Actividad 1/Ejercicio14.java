package com.andresgalvano;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int num;

        System.out.print("Digite el numero: ");
        num=scanner.nextInt();scanner.nextLine();
        String numero=String.valueOf(num)
                //Esto es para invertir el numero
                , reverse=new StringBuffer(numero).reverse().toString();

        if(numero.length()!=3)
        {
            System.out.println("Error numreo incorrecto");
        }
        if(numero.equals(reverse))
        {
            System.out.print("EL numero ingresado es capicua");
        }
        else
        {
            System.out.print("El numero ingresado no es capicua ");
        }

    }
}