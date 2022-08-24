package com.andresgalvano;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        double area_circle,area_trian;
        System.out.print("Digite el valor de R: ");
        float R=scanner.nextFloat();scanner.nextLine();
        System.out.print("Digite el valor de H: ");
        float H=scanner.nextFloat();scanner.nextLine();
        area_circle=(Math.PI*R*R)/2;
        area_trian=2*((Math.sqrt((H*H)-(R*R))*R));
        System.out.println(" Area total de la figura: "+(area_circle+area_trian));
    }
}