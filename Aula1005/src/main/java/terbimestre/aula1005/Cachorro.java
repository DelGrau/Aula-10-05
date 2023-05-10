package terbimestre.aula1005;

/**
 *
 * @author Alan H
 */
public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("O Cachorro latiu.");
    }
    
    @Override
    public void mover() {
        System.out.println("O Cachorro se moveu.");
    }
}
