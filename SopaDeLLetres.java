import java.util.Scanner;

public class SopaDeLLetres {
    public static void main(String[] args){
        /*
        (Fer Funcio main) -Alex
        >demanar lletres (min max 100) -Iker (demanarLletres)
        >convertir-les a matriu 10x10 -Marc (lletresAMatriu)
        >imprimir matriu -Adrian (imprimirMatriu)
        >solicitar paraules  -Alex (solicitarParaula)
        while (paraulesContades < 5)
        -->descartar si la paraula introduida < 3 caracters i > 10 caracters -??? (esValida)
        -->separar la paraula en caracters -??? (separarParaula)
        -->detectar si la paraula introduida es troba (horitzontal) -??? (detectarHoritzontal)
        -->detectar si la paraula introduida es troba (vertical) -??? (detectarVertical)
        -->pintar paraules de vermell quan son trobades -??? (pintarParaules)
        -->imprimir paraules (noves o no) -Adrian (imprimirMatriu(reciclada))
        --> augmentar paraulesContades si s'han trobat.
        >while s'acaba quan s'han trobat més de 5 paraules
        */

        System.out.println("Sisplau, introdueix les lletres de la sopa de lletres");
        int paraulesContades = 0;
        String lletres = demanarLletres();
        char[] matriu = lletresAMatriu(lletres);
        imprimirMatriu;
        while (paraulesContades < 5) {
            System.out.println("Introdueix una paraula per comprovar si existeix.");
            String paraula = solicitarParaula();
            char[] lletresParaula = separarParaula(paraula);
            while (!esValida(lletresParaula)){
                System.out.println("Sisplau, introdueix una paraula vàlida.");
                paraula = solicitarParaula();
                lletresParaula = separarParaula(paraula);
            }
            detectarHoritzontal = (lletresParaula);
            detectarVertical = (lletresParaula);

            /*
            Aquestes dues funcions han de fer les següents coses:
            - Comprovar si la paraula es troba
            -Extraure les coordenades de la lletra d'inici i la lletra del final
            en format coordenades[xInici,xFinal][yInici,yFinal]
             */

            //if (coordenades[0][0] != void){
            //pintarParaules(coordenades[0[0], coordenades[1][1];
            //imprimirMatriu(matriu);
            //paraulesContades++;
            //} else {
            //imprimirMatriu(matriu);
            //}
            //}
        }
    }
    public static String solicitarParaula(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public static char[] separarParaula(String paraula){
        char[] lletresParaula;
        lletresParaula = paraula.toCharArray();
        return lletresParaula;
    }
    public  static boolean esValida(char[] lletres){
        return lletres.length >= 3 && lletres.length <= 10;
    }
}
