/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fernando
 */
import utfpr.dainf.if62c.pratica.Circulo;
import utfpr.dainf.if62c.pratica.Elipse;

public class Pratica42 {
     public static void main(String[] args){
        Circulo c1 = new Circulo(3.5,"Circulo1");
        Circulo c2 = new Circulo(7.0,"Circulo2");
        Elipse e1 = new Elipse(2.0,3.5,"Elipse1");
        Elipse e2 = new Elipse(4.7,9.0,"Elipse2");
        
        System.out.println("A area do circulo "+c1.getNome()+" é "+c1.getArea()+" e o perimetro é "+c1.getPerimetro());
        System.out.println("A area do circulo "+c2.getNome()+" é "+c2.getArea()+" e o perimetro é "+c2.getPerimetro());
        System.out.println("A area da elipse "+e1.getNome()+" é "+e1.getArea()+" e o perimetro é "+e1.getPerimetro());
        System.out.println("A area da elipse "+e2.getNome()+" é "+e2.getArea()+" e o perimetro é "+e2.getPerimetro());
    }
}
