import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário:");
        float salario = sc.nextFloat();
        System.out.println("Digite o abono");
        float abono = sc.nextFloat();

        float novoSalario = salario + abono;
        System.out.printf("Novo salário: %.2f", novoSalario);


        sc.close();
    }
}
