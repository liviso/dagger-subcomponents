package livs.walmart.com.daggercomponentssubcomponents.di;

import dagger.Component;
import livs.walmart.com.daggercomponentssubcomponents.ui.MainActivity;

@Component(modules = CocheModule.class, dependencies = MotorComponent.class)
public interface CocheComponent {

    void inject(MainActivity mainActivity);
}
