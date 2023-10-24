package _p114_Animal;

public class Perro implements Animal {
    @Override
    public void dormir() {
        System.out.println("EL gato duerme en la casa para perro. ");        
    }

    @Override
    public void sonido() {
        System.out.println("El perro hace wof. ");
    }
    
    @Override
    public void comer() {
        System.out.println("El perro come whiskas y a veces le toca sobre");
    }
}
