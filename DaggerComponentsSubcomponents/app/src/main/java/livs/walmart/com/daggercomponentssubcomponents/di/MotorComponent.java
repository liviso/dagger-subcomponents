package livs.walmart.com.daggercomponentssubcomponents.di;

import javax.inject.Named;

import dagger.Component;
import livs.walmart.com.daggercomponentssubcomponents.Motor;
import livs.walmart.com.daggercomponentssubcomponents.ui.Main2Activity;

@Component(modules = MotorModule.class)
public interface MotorComponent {

    //Indica el objeto dependiente
    Motor motor();
    @Named("electrico") Motor motorElectrico();


    void inject(Main2Activity main2Activity);

    //Se declara el subcomponente
    CocheSubComponent plusCoche(CocheModule cocheModule);
}
