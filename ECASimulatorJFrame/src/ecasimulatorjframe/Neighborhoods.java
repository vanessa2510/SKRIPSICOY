/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecasimulatorjframe;

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
    /*
    * konstruktor untuk membuat matriks neighbor berdasarkan banyaknya tetangga
    * n untuk jumlah wirausaha
    * m untuk banyaknya tetangga
    */
    Neighborhoods(int n, int m){
        this.numNeighbor = m;
        neighbors = new Neighbor[m];
        weight = new double[m];
        relation = new int[m];
        
        for (int i = 0; i < m; i++) {
            this.numNeighbor = m;
            neighbors[i] = new Neighbor(n);
            weight[i] = 0.0;
            relation[i] = 0;
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

