import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segunto parametro:");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception){
            System.out.println("O segundo paramentro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm >= parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        for(int x = 1; x <= contagem; x++ ){
            System.out.println("Imprimindo número " + x);
        }
    }
}