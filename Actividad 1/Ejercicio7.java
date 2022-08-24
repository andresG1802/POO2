import java.util.Scanner;
public class main {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.print("Digite la horas trabajadas: ");
        float horas=scanner.nextFloat();scanner.nextLine();
        System.out.print("Digite la tarifa horario: ");
        float tarifa_horario=scanner.nextFloat();scanner.nextLine();
        float sueldo_basico=tarifa_horario*horas;
        double sueldo_bruto=sueldo_basico+(sueldo_basico*0.18),
                sueldo_neto=sueldo_bruto-(sueldo_bruto*0.12);
        System.out.println("Sueldo basico: "+sueldo_basico);
        System.out.println("Sueldo bruto: "+sueldo_bruto);
        System.out.println("Sueldo neto: "+sueldo_neto);
    }
}