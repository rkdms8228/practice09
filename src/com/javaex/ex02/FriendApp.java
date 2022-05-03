package com.javaex.ex02;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Friend[] ArrayList = new Friend[3];
    	
    	Scanner sc = new Scanner(System.in);
    	
    	for(int i =0; i<ArrayList.length; i++) {
    		
    		String[] info = sc.nextLine().split(" ");
    		ArrayList[i] = new Friend(info[0], info[1], info[2]);
    		
    	}
    	
    	for(int i =0; i<ArrayList.length; i++) {
    		ArrayList[i].showInfo();
    	}
    	
    	sc.close();
    
    }

}
