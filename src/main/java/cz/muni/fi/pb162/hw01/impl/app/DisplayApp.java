package cz.muni.fi.pb162.hw01.impl.app;

import cz.muni.fi.pb162.hw01.cmd.Application;
import cz.muni.fi.pb162.hw01.impl.DisplayImpl;
import cz.muni.fi.pb162.hw01.impl.DisplayStringifierImpl;
import cz.muni.fi.pb162.hw01.impl.Factory;


/**
 * Display application
 */
public class DisplayApp implements Application<DisplayAppOptions> {

    /**
     * Runtime logic of the application
     *
     * @param options options
     * @return exit status code
     */
    public int run(DisplayAppOptions options) {
        Factory factory = new Factory();
        DisplayImpl displayImpl = (DisplayImpl) factory.display(options.getSize());
        DisplayStringifierImpl displayStringifierImpl = (DisplayStringifierImpl) factory.stringifier();
        displayImpl.set(options.getText());
        System.out.println(displayStringifierImpl.asString(displayImpl));
        return 1;
    }
}
