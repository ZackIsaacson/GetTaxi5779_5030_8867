package com.gettaxi.benzack.gettaxi5779_5030_8867.model.backend;

public class BackendFactory {
    private static final BackendFactory ourInstance = new BackendFactory();

    public static BackendFactory getInstance() {
        return ourInstance;
    }

    private BackendFactory() {
    }
}
