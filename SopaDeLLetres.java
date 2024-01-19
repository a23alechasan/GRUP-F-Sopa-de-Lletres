import java.util.Scanner;

public class SopaDeLLetres {
    public static void main(String[] args) {
        char[][] matriu = demanarLletres();
        mostrarMatriu(matriu);
    }

    /**
     * Demana un String on comprova si hi han 100 lletres.
     * @return lletres a la funcio convertirLletresMatriu
     */

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
        return convertirLletresMatriu(lletres);
    }

    /**
     * Converteix y separa les 100 lletres en una matriu de 10*10
     * @param lletres String ons està guardat les 100 lletres
     * @return matriu Resultat final de la matriu convertida
     */

    public static char[][] convertirLletresMatriu(String lletres) {
        char[][] matriu = new char[10][10];
        int index = 0;

        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                matriu[f][c] = lletres.charAt(index++);
            }
        }

        return matriu;
    }

    /**
     * Mostra la matriu per pantalla
     * @param matriu char a mostrar
     */
    public static void mostrarMatriu(char[][] matriu) {
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                System.out.print(matriu[f][c] + " ");
            }
            System.out.println();
        }
    }
}