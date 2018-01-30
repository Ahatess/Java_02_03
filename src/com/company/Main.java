package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	System.out.println("Iveskite 2 skaicius");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("Suma: " + (a+b));
	System.out.println("Skirtumas: " + (a-b));
    }
}
