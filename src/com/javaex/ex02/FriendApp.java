package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	List<Friend> fList = new ArrayList<Friend>();
    	
    	for(int i =0; i<3; i++) {
    		
    		String[] info = sc.nextLine().split(" ");
    		fList.add(new Friend(info[0], info[1], info[2]));
    		
    	}
    	
    	for(Friend info : fList) {
    		info.showInfo();
    	}
    	
    	sc.close();
    
    }

}
