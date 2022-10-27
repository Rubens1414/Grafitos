/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author slrosales
 */
import Ventanas.Main;

/**
 *
 * @author Loli
 */
public class Floyd {

    private Grafo grafo;
    private Nodo nodo[];
    private int tope;
    private int[][] Recorrido;

    public Floyd(Grafo grafo, int tope, int[][] Recorrido) {
        this.grafo = grafo;
        this.tope = tope;
        this.Recorrido = Recorrido;

    }

    public int[][] getRecorrido() {
        for (int x = 0; x < Recorrido.length; x++) {
            System.out.print("|");
            for (int y = 0; y < Recorrido[x].length; y++) {
                System.out.print(Recorrido[x][y]);
                if (y != Recorrido[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
        return Recorrido;
    }

    public int[][] Floyd(int tope) {
        int matrix[][] = new int[tope][tope];
        int i, j, k;

        for (i = 0; i < tope; i++) {
            for (j = 0; j < tope; j++) {
                matrix[i][j] = grafo.getmCoeficiente(i, j);
                if (i == j) {
                    Recorrido[i][i] = 0;
                } else {
                    Recorrido[i][j] = i;
                }
            }
        }

        // Adding vertices individually
        for (k = 0; k < tope; k++) {
            for (i = 0; i < tope; i++) {
                for (j = 0; j < tope; j++) {
                    if (matrix[i][k] + matrix[k][j] < matrix[i][j] && matrix[i][k] + matrix[k][j] != 0) {
                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                        Recorrido[i][j] = Recorrido[k][j];

                    }
                }
            }
        }
        return matrix;
    }
}
