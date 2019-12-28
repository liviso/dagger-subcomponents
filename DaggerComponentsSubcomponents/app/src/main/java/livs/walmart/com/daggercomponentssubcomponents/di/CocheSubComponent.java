package livs.walmart.com.daggercomponentssubcomponents.di;

import dagger.Subcomponent;
import livs.walmart.com.daggercomponentssubcomponents.ui.Main3Activity;

@Subcomponent(modules = CocheModule.class)
public interface CocheSubComponent {

    void inject(Main3Activity main3Activity);
}
