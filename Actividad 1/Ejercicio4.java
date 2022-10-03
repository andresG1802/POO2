package com.andresgalvano;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);
        ArrayList<Float> cantidades=new ArrayList<Float>();
        float cantidad_total=0;
        System.out.print("Digite la ganacia que ha tenido la empresa: ");
        float accion_valor=scanner.nextFloat();scanner.nextLine();
        for(int i=0;i<3;i++)
        {
            System.out.print("Cantidad de acciones del "+"accionista "+(i+1)+" : ");
            float cantidad=scanner.nextFloat();scanner.nextLine();
            cantidades.add(cantidad);
            cantidad_total+=cantidad;
        }
        accion_valor/=cantidad_total;
        for(int i=0;i< cantidades.size();i++)
        {
            System.out.println("El accionista "+(i+1)+" recibe: "+(cantidades.get(i)*accion_valor));
        }
    }
}