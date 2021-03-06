package ir.sharif.ap2020.tetris.configs;

import java.awt.*;
import java.util.Properties;

public class ConfigFile extends Properties {
    public int readInt(String name) {
        return Integer.parseInt(getProperty(name));
    }

    public Rectangle readRectangle(String name) {
        int x = Integer.parseInt(getProperty(name + "_x"));
        int y = Integer.parseInt(getProperty(name + "_y"));
        int width = Integer.parseInt(getProperty(name + "_width"));
        int height = Integer.parseInt(getProperty(name + "_height"));
        return new Rectangle(x, y, width, height);
    }

    public Dimension readDimension(String name) {
        int width = Integer.parseInt(getProperty(name + "_width"));
        int height = Integer.parseInt(getProperty(name + "_height"));
        return new Dimension(width, height);
    }

    public Point readPoint(String name) {
        int x = Integer.parseInt(getProperty(name + "_x"));
        int y = Integer.parseInt(getProperty(name + "_y"));
        return new Point(x, y);
    }

    public Color readColor(String name) {
        int r = readInt(name + "_r");
        int g = readInt(name + "_g");
        int b = readInt(name + "_b");
        return new Color(r, g, b);
    }

    public Font readFont(String name) {
        int size = readInt(name + "_size");
        String fontName = getProperty(name + "_name");
        return new Font(fontName, Font.PLAIN, size);
    }
}
