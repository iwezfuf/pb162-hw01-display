package cz.muni.fi.pb162.hw01.impl;

/**
 * Class that represents a virtual display
 *
 * @author Martin Drazkovec, 536686
 */
public class DisplayImpl implements cz.muni.fi.pb162.hw01.impl.displays.Display {
    private final int size;
    public int getSize() {
        return size;
    }
    private final DisplayChar[] chars;
    public DisplayChar[] getChars() {
        return chars;
    }

    /**
     * Constructor that initializes the display with the size parameter and fill it with null characters
     * @param size size of the display
     */
    public DisplayImpl(int size) {
        this.size = size;
        this.chars = new DisplayChar[size];
        clear();
    }

    @Override
    public void set(String text) {
        set(0, text);
    }

    @Override
    public void set(int pos, String text) {
        int endAtIndex = Math.min(size, pos + text.length());
        for (int i = pos; i < endAtIndex; i++) {
            chars[i] = DisplayCharOptions.parseChar(text.charAt(i - pos));
        }
        for (int i = endAtIndex; i < size; i++) {
            clear(i);
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            clear(i);
        }
    }

    @Override
    public void clear(int pos) {
        if (pos < size) {
            chars[pos] = new DisplayChar(DisplayCharOptions.NULL);
        }
    }
}
