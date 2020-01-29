package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name : ");
        String name = scanner.nextLine();
        Map<Double,String> map = new HashMap<>();
        String a="PASS";
        String b="MASHROOT";
        int i=0 ;
        System.out.println("enter marks : ");
        while(i <= 4){
            Double m=scanner.nextDouble();
            if( m < 10.00){
                map.put(m,b);
            }
            else if(m >= 10.00) {
                map.put(m,a);
            }
            i++;
        }
        Set set = map.keySet();
        System.out.println("name :" + name);
        for(Object n : set){
            System.out.println(n +":"+ map.get(n));
        }
    }
}
