package com.j0k3r.springdatajpa.utils;

public class Validation {
    
    public static boolean validateStrings(String... args){

        for (String string : args) {
            if (string == null || string.isEmpty()){
                return false;
            }
        }
        return true;
    }

}
