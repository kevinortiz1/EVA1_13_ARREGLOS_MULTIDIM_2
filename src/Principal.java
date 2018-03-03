/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Ortiz
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[][] aiMatriz = new int[3][];//si no se define el segundo corchete cada fila puede tener diferentes columnas
        System.out.println(aiMatriz);
        aiMatriz[0] = new int[2];//damos valor al siguiente corchete
        System.out.println(aiMatriz[0]);//imprimimos direcciones
        System.out.println(aiMatriz[0][0]);
        aiMatriz[1] = new int[5];
        System.out.println(aiMatriz[1]);
        System.out.println(aiMatriz[1][3]);
        aiMatriz[2] = new int[10];
        System.out.println(aiMatriz[2]);
        System.out.println(aiMatriz[2][8]);
        System.out.println("");
        for (int i = 0; i < aiMatriz.length; i++) {//FILAS 
            for (int j = 0; j < aiMatriz[i].length; j++) {//COLUMNAS
                System.out.println(aiMatriz[i][j]);
            }
        }
    }
    
}
