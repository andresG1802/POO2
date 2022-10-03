import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
       Scanner scanner=new Scanner(System.in);
        System.out.print("Digite la nota del alumno: ");
        float nota=scanner.nextFloat();scanner.nextLine();
        if(nota<12.50)
        {
            System.out.println("El alumno desaprobo el curso ");
        }
        else
        {
            System.out.println("El alumno aprobo el curso ");    
        }
    }
}