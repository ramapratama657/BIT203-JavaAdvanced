/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */
import java.util.Scanner;
public class task1q3 {
    public static void main(String[] args){
        Point a = new Point();
        Circle b = new Circle();
        
        Scanner inp = new Scanner(System.in);
        System.out.println("Input Nilai x: ");
        a.setX(key.nextDouble());
        
        System.out.println("Input nilai y: ");
        a.setY(key.nextDouble());
        
        System.out.println("Input nilai lingkaran(x): ");
        b.centre.setX(key.nextDouble());
        
        System.out.println("Input nilai lingkaran(y): ");
        b.centre.setY(key.nextDouble());
        
        System.out.println("Input nilai radius: ");
        b.setRadius(key.nextDouble());
        
        double c = Math.sqrt(Math.pow(a.getX() - b.centre.getX())+ Math.pow(a.getY() - b.centre.getY()));
        double z = Math.pow(c, c);
    }
}
