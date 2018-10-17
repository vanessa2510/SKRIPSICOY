/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecasimulatorjframe;

import java.util.Scanner;

/**
 *
 * @author Vanessa
 * himpunan ketetanggaan tersusun atas sejumlah ketetanggaan
 */
public class Neighborhoods {
    int numNeighbor; // banyaknya ketetanggaan
    Neighbor[] neighbors;
    double[] weight;
    int[] relation; // jenis hubungan ketetanggaan, sama dengan, lebih kecil atau yang lain --> perlu didefinisikan
    
    Neighborhoods(int n, int m){
        this.numNeighbor = m;
        neighbors = new Neighbor[m];
        weight = new double[m];
        relation = new int[m];
        
        for (int i = 0; i < m; i++) {
            neighbors[i] = new Neighbor(n);
            weight[i] = 0.0;
            relation[i] = 0;
//            System.out.println(neighbors[i]);
//            System.out.println(weight[i]);
//            System.out.println(relation[i]);
        }
    }

    public void setWeight(double[] weight) {
        this.weight = weight;
    }

    public void setRelation(int[] relation) {
        this.relation = relation;
    }

    public void setNumNeighbor(int numNeighbor) {
        this.numNeighbor = numNeighbor;
    }
    
    
}

