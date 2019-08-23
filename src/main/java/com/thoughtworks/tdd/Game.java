package com.thoughtworks.tdd;

public class Game {
   String result ="";
    public String fizzBuzz(int i){
        if (i==3){
            result+= "Fizz";
        }else {
            result = String.valueOf(i);
        }
        return result;
    }

}
