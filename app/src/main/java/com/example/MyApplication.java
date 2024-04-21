package com.example;

public class MyApplication {
    public static void main(String[] args)
    {
        new PrintService().print(new MessageModel("From Local a !!!!!"));
        new PrintService().print(new MessageModel("From Local A !!!!!"));
    }
    public void TestA() {String s = "sdfsdf";}
    public void TestB() {String s = "sdfsdf";}
    public void TestC() {String s = "sdfsdf1";}
    public void TestD() {String s = "sdfsdf1";}
}