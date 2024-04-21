package com.example;

public class MyApplication {
    public static void main(String[] args)
    {
        new PrintService().print(new MessageModel("MessageModel From Remote Master!!!!!"));
        new PrintService().print(new MessageModel1("MessageModel1 From Local Master!!!!!"));
        new PrintService().print(new MessageModel1("MessageModel2 From Local Master!!!!!"));
        new PrintService().print(new MessageModel1("MessageModel3 From Local Master!!!!!"));
        new PrintService().print(new MessageModel1("MessageModel4 From Local Master!!!!!"));
    }
    public void TestA() {String s = "sdfsdf";}
    public void TestB() {String s = "sdfsdf";}
    public void TestC() {String s = "sdfsdf1";}
}
