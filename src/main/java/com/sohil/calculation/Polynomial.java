package com.sohil.calculation;

/**
 *
 * @author sohil chhabriya
 */
public class Polynomial {
    private int[][] poly;

    public void setPoly(int m, int n) {
        this.poly = new int [m][n];
    }
    
    public void setPoly(int[][]  poly) {
        this.poly = poly;
    }

    public int[][] getPolynomial() {
        return poly;
    }
    
    public Polynomial addElementsToPoly(int[] coefficient, int[] exponent) {
        //int[] coefficient = new int[]{2,4,5,6};
        //int[] exponent = new int[]{2,4,5,6};
        setPoly(coefficient.length, exponent.length);
        for(int i = 0, j=0; i<coefficient.length; i++) {
            poly[i][j] = coefficient[i];
            poly[i][j+1] = exponent[i];
        }
        Polynomial polyy = new Polynomial();
        polyy.setPoly(poly);
        return polyy;
    }
}
