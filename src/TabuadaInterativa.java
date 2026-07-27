import java.util.Scanner;

public class TabuadaInterativa { public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 's' ;


        while (continuar == 's' || continuar == 'S') {
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("\n--- Tabuada Interativa do " + numero + "---");

        for(int i = 1 ; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Pergunta se o usuário deseja ver outra tabuada
            System.out.print("\nDeseja ver outra tabuada? (s/n): ");
            continuar = scanner.next().charAt(0);
            System.out.println(); // Pula uma linha para organizar a saída
        }

            System.out.println("Programa encerrado. Até mais!");
            scanner.close();
            }



        }











