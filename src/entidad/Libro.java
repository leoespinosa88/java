package entidad;


public class Libro {
    //ATRIBUTOS.
    public int isbn;
    public String titulo;
    public String autor;
    public int numPag;

    
    //CONTRUCTOR POR DEFECTO.
    public Libro() {
    }
    
    //CONTRUCTOR POR PARAMETRO.

    public Libro(int isbn, String titulo, String autor, int numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
    
    //SETTER & GETTER.

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + '}';
    }
    
    
}
