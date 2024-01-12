import java.util.Scanner;

public class SopaDeLLetres {
    public static void main(String[] args) {
        char[][] matriu = demanarLletres();
        mostrarMatriu(matriu);
    }

    private static char[][] demanarLletres() {
        Scanner input = new Scanner(System.in);
        System.out.println("Dona 100 lletres seguides per començar el joc:");
        String lletres = input.nextLine();
        for(int i = 0; i < 100; i++) {
            if (lletres.length() != 100) {
                System.out.println("No hi han 100 lletres, torna a provar");
                lletres = input.nextLine();
            }

        }
        return convertirLletresMatriz(lletres);
    }

    public static char[][] convertirLletresMatriz(String lletres) {
        char[][] matriu = new char[10][10];
        int index = 0;

        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                matriu[f][c] = lletres.charAt(index++);
            }
        }

        return matriu;
    }

    public static void mostrarMatriu(char[][] matriu) {
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                System.out.print(matriu[f][c] + " ");
            }
            System.out.println();
        }
    }
}