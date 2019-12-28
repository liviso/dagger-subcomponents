package livs.walmart.com.daggercomponentssubcomponents.di;

import android.app.Application;

public class BaseApplication extends Application {
    private MotorComponent motorComponent;

    private CocheComponent cocheComponent;

    //Se declara el subcomponente
    private CocheSubComponent cocheSubComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        motorComponent= DaggerMotorComponent.builder().build();

        cocheComponent = DaggerCocheComponent.builder().motorComponent(getMotorComponent()).build();
    }

    public CocheSubComponent plusCocheSubComponent(){
        if(cocheSubComponent == null ){
            cocheSubComponent = motorComponent.plusCoche(new CocheModule());
        }
        return cocheSubComponent;
    }

    public MotorComponent getMotorComponent(){
        return motorComponent;
    }

    public CocheComponent getCocheComponent(){
        return cocheComponent;
    }
}
