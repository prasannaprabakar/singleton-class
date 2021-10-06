package com.company;

public class Main {

    public static void main(String[] args) {
            GOF_Design_pattern singleton_obj1 = GOF_Design_pattern.getInstance();
            GOF_Design_pattern singletonobj2 =new GOF_Design_pattern();

    }
}
class GOF_Design_pattern{
    static GOF_Design_pattern singleton_obj =new GOF_Design_pattern();
    private GOF_Design_pattern(){

    }
public static GOF_Design_pattern getInstance(){
        return singleton_obj;
}
}