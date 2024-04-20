package com.example;

public class MyApplication {
    public static void main(String[] args)
    {
        new PrintService().print(new MessageModel("From Remote !!!!!"));
        new PrintService().print(new MessageModel("From Local !!!!!"));
        new PrintService().print(new MessageModel("From Local !!!!!"));
        new PrintService().print(new MessageModel("From Local !!!!!"));
    }
    public void TestA() {String s = "sdfsdf";}
    public void TestB() {String s = "sdfsdf";}
    public void TestC() {String s = "sdfsdf1";}
}
