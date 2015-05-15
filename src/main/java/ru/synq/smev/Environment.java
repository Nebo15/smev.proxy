package ru.synq.smev;

public enum Environment {
    test, prod;

    public boolean isProd() {
        return this == prod;
    }
}
