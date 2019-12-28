package livs.walmart.com.daggercomponentssubcomponents;

public class Coche {

    private Motor motor;


    public Coche(Motor motor){
        this.motor=motor;
    }

    public String getCoche(){
        return ("Coche con "+motor.getTipoMotor());
    }
}
