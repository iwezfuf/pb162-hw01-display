package cz.muni.fi.pb162.hw01.impl;

import java.util.HashMap;

/**
 * Class that represents a single segmentifiable character
 *
 * @author Martin Drazkovec, 536686
 */
public enum DisplayCharOptions {
    ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, ERROR, NULL;

    /**
     * Method that transforms object to a string representation of itself
     * @return string representation of self
     */
    public String[] segmentify() {
        HashMap<DisplayCharOptions, String[]> charSegments = new HashMap<>();
        charSegments.put(ZERO, new String[]{" _ ", "| |", "|_|"});
        charSegments.put(ONE, new String[]{"   ", "  |", "  |"});
        charSegments.put(TWO, new String[]{" _ ", " _|", "|_ "});
        charSegments.put(THREE, new String[]{" _ ", " _|", " _|"});
        charSegments.put(FOUR, new String[]{"   ", "|_|", "  |"});
        charSegments.put(FIVE, new String[]{" _ ", "|_ ", " _|"});
        charSegments.put(SIX, new String[]{"   ", "|_ ", "|_|"});
        charSegments.put(SEVEN, new String[]{" _ ", "  |", "  |"});
        charSegments.put(EIGHT, new String[]{" _ ", "|_|", "|_|"});
        charSegments.put(NINE, new String[]{" _ ", "|_|", "  |"});
        charSegments.put(ERROR, new String[]{" _ ", "|_ ", "|_ "});
        charSegments.put(NULL, new String[]{"   ", "   ", "   "});

        return charSegments.get(this);
    }

    /**
     * Method that transforms a character to a segmentifiable representation
     * @param character to transform
     * @return segmentifiable representation
     */
    public static DisplayChar parseChar(char character) {
        int num = Character.isDigit(character) ? Character.getNumericValue(character) : 10;
        return new DisplayChar(DisplayCharOptions.values()[num]);
    }
}