import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
       Scanner scanner=new Scanner(System.in);
        System.out.print("Tarifa horaria: ");
        float tarifa_horario=scanner.nextFloat();scanner.nextLine();
        System.out.print("Cantidad de horas trabajadas: ");
        float horas=scanner.nextFloat();scanner.nextLine();
        double sueldo_bruto=tarifa_horario*horas;
        double descuento_total=(sueldo_bruto*0.09)+(sueldo_bruto*0.115);
        System.out.println("El sueldo bruto es: "+sueldo_bruto);
        System.out.println("El descuento de ESSALUD:"+sueldo_bruto*0.09);
        System.out.println("El descuento por AFP: "+sueldo_bruto*0.115);
        System.out.println("El Sueldo neto: "+(sueldo_bruto-descuento_total));
    }
}