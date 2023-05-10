package terbimestre.aula1005;

/**
 *
 * @author Alan H
 */
public class Aula1005 {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        
        cachorro.emitirSom();
        cachorro.mover();
        System.out.println("");
        
        gato.emitirSom();
        gato.mover();
    }
}
