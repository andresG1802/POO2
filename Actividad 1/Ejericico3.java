package com.andresgalvano;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        float part1,part2,part3,capital;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Primera parte: ");
        part1=scanner.nextFloat();scanner.nextLine();
        System.out.println("Segunda parte: ");
        part2=scanner.nextFloat();scanner.nextLine();
        System.out.println("Tercera parte: ");
        part3=scanner.nextFloat();scanner.nextLine();
        capital=part1+part2+part3;

        part1=(part1*100)/capital;
        part2=(part2*100)/capital;
        part3=(part3*100)/capital;
        System.out.println("El capital total es: "+capital);
        System.out.println("Primer porcentaje: "+part1);
        System.out.println("Segundo porcentaje: "+part2);
        System.out.println("Tercer ddddddddddporcentaje: "+part3);
    }
}
