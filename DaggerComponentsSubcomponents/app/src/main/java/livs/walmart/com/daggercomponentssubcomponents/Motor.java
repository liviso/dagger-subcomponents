package livs.walmart.com.daggercomponentssubcomponents;

public class Motor {

    private String tipoMotor;
    public Motor(String tipoMotor){
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor(){
        return "motor: "+tipoMotor;
    }
}
