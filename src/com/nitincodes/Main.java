package com.nitincodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// java program to print the reverse of a number:
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        int rev = 0;
        while(n!=0){
            rem=n%10;
            rev = rev*10 + rem;
            n=n/10;
        }
        System.out.println("the reverse of the given number is "+rev);
    }
}
