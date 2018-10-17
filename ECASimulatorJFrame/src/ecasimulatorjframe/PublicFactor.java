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
public class PublicFactor {
    
    double[] factors;
    double[] weights;

    PublicFactor(int n) {
        factors = new double[n];
        weights = new double[n];
    }

    public void setFactors(double[] f) {
        this.factors = f;
    }

    public void setWeights(double[] w) {
        this.weights = w;
    }

    double getPublicIdx() {
        double idx = 0.0;
        for (int i = 0; i < factors.length; i++) {
            idx = idx + factors[i] * weights[i];
        }
        return idx / factors.length;
    }

}
