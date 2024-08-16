package FactoryDesignPattern.FactoryEXE2;

import FactoryDesignPattern.FactoryEXE2.Library.OperatingSystem;

import java.util.Scanner;

public class Coustomer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        OperatingSystem os =  SelectionFactory.getInstance(input);
        os.specs();
    }
}
