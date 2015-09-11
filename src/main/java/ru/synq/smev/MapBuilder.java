package ru.synq.smev;

import java.util.HashMap;

public class MapBuilder extends HashMap<String, Object> {
    public MapBuilder() {
        super();
    }

    public static MapBuilder map() {
        return new MapBuilder();
    }

    public MapBuilder put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
