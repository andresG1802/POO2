package com.andresgalvano;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        float precio,A,B,L;
        System.out.print("Ingrese el precio por metro cubico: ");
        precio= scanner.nextFloat();scanner.nextLine();
        System.out.print("Medida de A: ");
        A=scanner.nextFloat();scanner.nextLine();
        System.out.print("Medidad de L: ");
        B=scanner.nextFloat();scanner.nextLine();
        System.out.print("Medida de B: ");
        L=scanner.nextFloat();scanner.nextLine();
        System.out.println("Volumen total de la piscina: "+(A*B*L));
        System.out.println("Costo total: "+((A*B*L)*precio));
    }
}