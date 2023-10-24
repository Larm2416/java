package _p114_Animal;

public class App {
    public static void main(String[] args) {
       //no se puede instanciar una interfaz Animal animal = new Animal() {};
       Gato miGato = new Gato();
       miGato.dormir();
       miGato.sonido();
       miGato.comer();

       Perro miPerro = new Perro();
       miPerro.dormir();
       miPerro.sonido();
       miPerro.comer();
    }
}