package testes;

/**
 *
 * @author Ailton Cardoso Jr
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor = new ServoMotor();
        motor.ligarMotorServo();
        
        motor = new DCMotor();
        motor.desligarMotorDC();
    }

}
