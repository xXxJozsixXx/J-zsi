
package kerulet;
import java.util.Scanner;

/**
 *
 * @author Lonezsi
 */
public class Kerulet {
//ker�let

    public static double teglalapK (double a, double b) {
        return (a + b) * 2;
    }
    
    
    public static double korK (double r) {
        return 2 * r * Math.PI;
    }
    
   
    public static double haromszogK (double a, double b, double c) {
        return a + b + c;
    }
    
    
    public static double otszogK (double a) {
        return 5 * a;
    }
    
    
    public static double hatszogK (double a) {
        return 6 * a;
    }
    
    
    public static void main(String[] args) {
        
        char valasz;
        Scanner bemenet = new Scanner(System.in);
        int alakzatValasz;
        double aOldal, bOldal, bonuszOldal;
       
        
        do {
            
            do {

                System.out.println("\nMilyen alakzat kerületét szeretnéd kiszámolni? (1-5)\n1 - téglalap\n2 - kör\n3 - háromszög\n4 - ötszög\n5 - hatszög\n");
                alakzatValasz = bemenet.nextInt();

            } while(alakzatValasz < 1 || alakzatValasz> 5);
            
            switch (alakzatValasz) {
                
                case 1: 
                    System.out.println("\nAdd meg a téglalap két oldalát: ");
                    aOldal = bemenet.nextDouble();
                    bOldal = bemenet.nextDouble();
                    System.out.println("A téglalap kerülete: " + teglalapK(aOldal, bOldal));
                    break;
                
                case 2:     
                    System.out.println("\nAdd meg a kör sugarát: ");
                    bonuszOldal = bemenet.nextDouble();
                    System.out.println("A kör kerülete: " + korK(bonuszOldal));
                    break;
                    
                case 3: 
                    do {
                        System.out.println("\nAdd meg a háromszög 3 oldalát: ");
                        aOldal = bemenet.nextDouble();
                        bOldal = bemenet.nextDouble();
                        bonuszOldal = bemenet.nextDouble();
                    } while((aOldal + bOldal) < bonuszOldal);
                    
                    System.out.println("A háromszög kerülete: " + haromszogK(bOldal, bOldal, bonuszOldal));
                    break;
                    
                case 4:
                    System.out.println("\nAdd meg az ötszög oldalát: ");
                    aOldal = bemenet.nextDouble();
                    System.out.println("Az ötszög kerülete: " + otszogK(aOldal));
                    break;
                    
                case 5: 
                    System.out.println("\nAdd meg a hatszög oldalát: ");
                    aOldal = bemenet.nextDouble();
                    System.out.println("Az ötszög kerülete: " + hatszogK(aOldal));
                    break;
            }
            
            System.out.print("\nSzeretnél új alakzattal számolni? (i/n): ");
            valasz = bemenet.next().toLowerCase().charAt(0);
            
        } while (valasz == 'i');
        
        bemenet.close();
    }
    
}
