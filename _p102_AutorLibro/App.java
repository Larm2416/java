package _p102_AutorLibro;

public class App {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Autor autor = new Autor();
        autor.setNombre("Baldor");
        autor.setCorreo("Baldor@gmail.com");
        libro1.setIsbn("100010145");
        libro1.setNombre("Algebra para principiantes");
        libro1.setPrecio(1500);
        libro1.setCant(30);
        libro1.setAutor(autor);
        System.out.println(libro1);

        Libro libro2 = new Libro("10232320","Ecuaciones Diferenciales", new Autor("hijo de baldor", "BaldorSons@hotmal.com"), 2000, 30);
        System.out.println(libro2);

        System.out.println("Nombre del libro : "+ libro2.getNombre());
        System.out.println("Nombre del autor : "+ libro2.getAutor() .getNombre());
        
        }
    
}
