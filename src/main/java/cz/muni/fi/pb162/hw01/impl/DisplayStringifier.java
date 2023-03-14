package cz.muni.fi.pb162.hw01.impl;

import cz.muni.fi.pb162.hw01.impl.displays.Display;

/**
 * Class that can convert a display to a string representation
 *
 * @author Martin Drazkovec, 536686
 */
public class DisplayStringifier implements cz.muni.fi.pb162.hw01.impl.displays.DisplayStringifier {
    @Override
    public boolean canStringify(Display display) {
        return display.getClass() == cz.muni.fi.pb162.hw01.impl.Display.class;
    }

    @Override
    public String[] asLines(Display display) {
        if (!canStringify(display)) {
            return new String[] {};
        }
        cz.muni.fi.pb162.hw01.impl.Display displayImpl = (cz.muni.fi.pb162.hw01.impl.Display) display;
        String[] lines = {"", "", ""};
        for (int i = 0; i < displayImpl.getSize(); i++) {
            String[] segmentifiedChar = displayImpl.getChars()[i].getDisplayChar().segmentify();
            for (int j = 0; j < 3; j++) {
                lines[j] = String.join("", lines[j], segmentifiedChar[j]);
            }
        }
        return lines;
    }

    @Override
    public String asString(Display display) {
        return String.join(System.lineSeparator(), asLines(display));
    }
}
