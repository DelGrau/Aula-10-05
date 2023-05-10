package terbimestre.aula1005;

/**
 *
 * @author Alan H
 */
public class Gato extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("O Gato miou.");
    }
    
    @Override
    public void mover() {
        System.out.println("O Gato se moveu.");
    }
}
