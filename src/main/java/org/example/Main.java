package org.example;

public class Main {
    public static void main(String[] args) {
        int storageSize = 10;
        Manager manager = new Manager(storageSize);
        for(int i = 0; i < 20;i++){
            new  Producer(4,manager,i);
            new  Consumer(5,manager,i);
        }
    }
}