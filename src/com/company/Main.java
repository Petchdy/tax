package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x>150_000){
            if (x>=5_000_001){
                System.out.printf("%.2f",x*0.35);
            }
            else if (x>=2_000_001){
                System.out.printf("%.2f",x*0.30);
            }
            else if (x>=1_000_001){
                System.out.printf("%.2f",x*0.25);
            }
            else if (x>=750_001){
                System.out.printf("%.2f",x*0.20);
            }
            else if (x>=500_001){
                System.out.printf("%.2f",x*0.15);
            }
            else if (x>=300_001){
                System.out.printf("%.2f",x*0.1);
            }
            else if (x>=150_000){
                System.out.printf("%.2f",x*0.05);
            }
        }
        else {
            System.out.println("ไม่ต้องเสียภาษี");
        }
    }
}
