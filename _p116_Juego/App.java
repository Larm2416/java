package _p116_Juego;

public class App {
    public static void main(String[] args) {
        JuegoDados juego1 = new JuegoDados();
        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();

        JuegoAdivina juego2 = new JuegoAdivina();
        juego2.iniciar();
        juego2.jugar();
        juego2.finalizar();
    }
}
