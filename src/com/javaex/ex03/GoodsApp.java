package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	List<Goods> product = new ArrayList<Goods>();

    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("상품을 입력해 주세요.(종료: q)");
    	
    	
    	int sum = 0;
    	
    	while(true) {
    		
    		String str = sc.nextLine();
    		
    		if(str.equals("q")) {
        		break;
        	}else {
        		String[] goods = str.split(",");
            	product.add(new Goods(goods[0], Integer.parseInt(goods[1]), Integer.parseInt(goods[2])));
        	}
    		
    	}
    		
    		System.out.println("[입력 완료]");
    		System.out.println("=========================");

    		for(Goods g : product) {
    			g.showInfo();
    			sum = sum+g.getCount();
    		}
 
    		System.out.println("모든 상품의 갯수는 "+sum+"개입니다.");
    		
    		
    	
    	
    		
    	sc.close();
    	
    }

}
