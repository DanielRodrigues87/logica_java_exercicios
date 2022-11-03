import java.util.Scanner;

public class VerificarCodigo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int CODIGO;

        System.out.println("Verificador de código");

        System.out.println("Digite o Código: ");
        CODIGO = entrada.nextInt();

        switch (CODIGO) {
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("três");
                break;
            default:
                System.out.println("Código inválido");
        }

    }
}
