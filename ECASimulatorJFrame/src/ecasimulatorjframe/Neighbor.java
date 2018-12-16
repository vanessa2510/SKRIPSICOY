/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecasimulatorjframe;

/**
 *
 * @author Vanessa
 */
public class Neighbor {
    double[][] neighborMatrix;
    /*
    * Method untuk membuat matriks berdasarkan atribut tetangga
    * n merupakan jumlah wirausaha
    */
    Neighbor(int n){
        neighborMatrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                neighborMatrix[i][j] = 0.0; 
            }
        }
    }
}

