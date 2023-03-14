package cz.muni.fi.pb162.hw01.impl;

/**
 * Class that represents a single character on a display
 *
 * @author Martin Drazkovec, 536686
 */
public class DisplayChar {
    private final DisplayCharOptions displayChar;
    public DisplayCharOptions getDisplayChar() {
        return displayChar;
    }

    /**
     * Constructor
     * @param displayChar char on a display
     */
    DisplayChar(DisplayCharOptions displayChar) {
        this.displayChar = displayChar;
    }
}
