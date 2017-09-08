package testes;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class ServoMotor extends MotorBase{

    @Override
    public void ligarMotorServo() {
        System.out.println("Ligando motor Servo");
    }
    
    @Override
    public void desligarMotorServo() {
        System.out.println("Desligando motor Servo");
    }
}
