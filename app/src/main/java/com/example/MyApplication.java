package com.example;

public class MyApplication {
    public static void main(String[] args)
    {
        new PrintService().print(new MessageModel("Hi!! :) :) :) 1 2 3"));
        new PrintService().print(new MessageModel(":( :( :( 1 2 3"));
    }
}
