package com.andresgalvano;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Digite la cantidad cosumida en GB: ");
        int consumo=scanner.nextInt();scanner.nextLine();
        if(consumo<4)
        {
            System.out.println("Usted pagara s/.50");
        }
        else if(consumo>4&&consumo<=8)
        {
            System.out.println("Usted pagara s/.85");
        }
        else
        {
            float precio=85;
            consumo-=8;
            if(consumo>0)
            {
                precio+=(4.50*consumo);
            }
            System.out.println("Usted pagara s/."+precio);
        }
    }
}