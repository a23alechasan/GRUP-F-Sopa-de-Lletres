public class SopaDeLLetres {
    public static void main(String[] args) {
        /*
        (Fer Funcio main) -Alex
        >demanar lletres (min max 100) -Iker (demanarLletres)
        >convertir-les a matriu 10x10 -Marc (lletresAMatriu)
        >imprimir matriu -Adrian (ImprimirMatriu)
        >solicitar paraules while (!true)
        -->descartar si la paraula introduida < 3 caracters i > 10 caracters
        -->detectar si la paraula introduida es troba (horitzontal)
        -->detectar si la paraula introduida es troba (vertical)
        -->pintar paraules de vermell quan son trobades
        -->identificar si les 5 paraules s'han trobat
        >while (!true) s'acaba*/

    }

    public char[][] convertirMatriz() {
        String StringNombre="AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        char[][] matriz = new char[10][10];
        int posicion = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                matriz[fila][col] = StringNombre.charAt(posicion);
                posicion++;
            }
        }
        return matriz;

    }
}
