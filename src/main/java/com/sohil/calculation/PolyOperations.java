package com.sohil.calculation;

/**
 * @author Sohil Chhabriya
 */
public class PolyOperations {
    /**
     * @param poly1 first polynomial
     * @param poly2 second polynomial 
     */
    public static void addPoly(Polynomial poly1, Polynomial poly2) {
        Polynomial polyResult = new Polynomial();
        polyResult.setPoly(poly1.getPolynomial().length, 2);
        int[][] polyArray = polyResult.getPolynomial();
        for (int i = 0, j = 0; i<poly1.getPolynomial().length; i++) {
            for (int k = 0, l = 0; k<poly2.getPolynomial().length; k++) {
                if(poly1.getPolynomial()[i][j+1] == poly2.getPolynomial()[k][l+1]) {
                    polyArray[i][j] = poly1.getPolynomial()[i][j] + poly2.getPolynomial()[i][j];
                    polyArray[i][j+1] = poly1.getPolynomial()[i][j+1];
                    break;
                }
                else {
                   polyArray[i][j] = poly1.getPolynomial()[i][j];
                   polyArray[i][j+1] = poly1.getPolynomial()[i][j+1];
                }
            }
        }
        polyResult.setPoly(polyArray);
        printPoly(polyResult,"polyResult");
    }
    public static void printPoly(Polynomial polynomial) {
        printPoly(polynomial, "printing polynomial");
    }
    public static void printPoly(Polynomial polynomial, String comment) {
        int[][] poly = polynomial.getPolynomial();
        System.out.println(comment);
        if (poly != null && poly.length >= 0) {
            for (int i=0, j=0; i<poly.length; i++) {
                System.out.print(poly[i][j] +"x^"+ poly[i][j+1]);
                if (i<poly.length-1) {
                    System.out.print(" + ");
                }
                else {
                    System.out.print(" = 0");
                    System.out.println("");                
                }

            }
        }
    }
}
