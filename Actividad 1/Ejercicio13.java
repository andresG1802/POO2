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
        String numero=String.valueOf(num),reverse=new StringBuffer(numero).reverse().toString();

        if(numero.length()!=3)
        {
            System.out.println("Error Ingrese un numero de tres cifras");
        }
        else
        {
            System.out.println(reverse);
        }
    }
}