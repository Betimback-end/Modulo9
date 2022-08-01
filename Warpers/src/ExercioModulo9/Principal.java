package ExercioModulo9;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Método para ler as informações digitada pelo Usuário
        Scanner valor = new Scanner(System.in);

        // Declaração das variáveis primitivas
        String nome;
        int num = 0;

        // Declaação variável Wrapper
        Integer numero = 0 ;

        System.out.println("************** Ola, Como voce se chama ? ****************");
        nome = valor.nextLine();

        System.out.println("*****************************************************************************");
        System.out.println ("Como vai " + nome +"? Espero que bem. ");

        System.out.println("Vamos comecar, digite um Numero. ");
        num = valor.nextInt();
        numero = num ;

        System.out.println("*****************************************************************************");
        System.out.println("Esse numero trasnformado em Wraper 'Integer'  e " + num);

        valor.close();
    }
}
