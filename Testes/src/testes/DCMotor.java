package testes;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class DCMotor extends MotorBase{
    @Override
    public void ligarMotorDC() {
        System.out.println("Ligando motor DC");
    }
    
    @Override
    public void desligarMotorDC() {
        System.out.println("Desligando motor DC");
    }
}
