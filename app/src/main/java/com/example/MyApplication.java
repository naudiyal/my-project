package com.example;

public class MyApplication {
    public static void main(String[] args)
    {
        new PrintService().print(new MessageModel("Hi!! :) :) :) A B C"));
        
        new PrintService().print(new MessageModel("Hi!! :) :) :) 1 2 3"));
        new PrintService().print(new MessageModel(":( :( :( 1 2 3"));
        new PrintService().print(new MessageModel("Hi!! :) :) :) 1 "));
        new PrintService().print(new MessageModel("Hi!! :) :) :) 1 "));
        new PrintService().print(new MessageModel("Hi!! :) :) :) 12121212 "));

        new PrintService().print(new MessageModel("Hi!! :) :) :) 333333 "));
        new PrintService().print(new MessageModel("Hi!! :) :) :) 444444 "));

    }
    public void TestA() {String s = "sdfsdf";}
    public void TestB() {String s = "sdfsdf";}
    public void TestC() {String s = "sdfsdf1";}
}
