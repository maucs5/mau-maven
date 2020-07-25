package com.mau;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Args: " + args.length);
        System.out.print("Uppercase args: ");
        for (String arg : args) {
            System.out.print(arg.toUpperCase() + ":");
        }
        System.out.println();
    }
}
