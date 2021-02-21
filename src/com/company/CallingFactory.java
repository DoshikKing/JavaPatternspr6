package com.company;

public class CallingFactory {
    public Call createCall(String call){
        if (call == null || call.isEmpty())
            return null;
        if ("Moscow".equals(call)) {
            return new CallingToMoscow();
        }
        else if ("London".equals(call)) {
            return new CallingToLondon();
        }
        else if ("Tokio".equals(call)) {
            return new CallingToTokio();
        }
        return null;
    }
}
