package cz.muni.fi.pb162.hw01.impl.app;

import cz.muni.fi.pb162.hw01.cmd.Application;
import cz.muni.fi.pb162.hw01.impl.Display;
import cz.muni.fi.pb162.hw01.impl.DisplayStringifier;
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
        Display display = (Display) factory.display(options.getSize());
        DisplayStringifier displayStringifier = (DisplayStringifier) factory.stringifier();
        display.set(options.getText());
        System.out.println(displayStringifier.asString(display));
        return 1;
    }
}
