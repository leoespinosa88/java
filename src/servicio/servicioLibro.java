package servicio;

import entidad.Libro;
import java.util.Scanner;


public class servicioLibro {
    Scanner leer = new Scanner(System.in);
    Libro li= new Libro();
    public void pedirLibro(){
        String nom;
        System.out.println("Diga su nombre de usuario.");
        nom=leer.nextLine();
        
    }
    public void datoLibro(){
        li.setIsbn(123);
        li.setNumPag(500);
        li.setAutor("Campanita");
        System.out.println("Ingrese el libro que quiere");
        li.setTitulo(leer.next());
        if("capitan".equals(li.getTitulo())){
            System.out.println("El libro que elegiste tiene:");
            System.out.println(li.getNumPag()+ " páginas.");
            System.out.println("El autor del libro es "+li.getAutor());
            System.out.println("El ISBN del libro es "+li.getIsbn());
        }
    }
}
