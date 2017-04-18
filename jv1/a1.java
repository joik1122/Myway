package p1;

import java.util.Scanner;
public class a1 {
	
	public static void main(String[] args){
		
		System.out.println("입력할 최대 실수의 갯수를 입력하시오.>>");
		Scanner input = new Scanner(System.in);  
        int size = input.nextInt();    
        System.out.println("\n중간에 0을 입력하면 이전 입력자료로 계산하고 종료합니다.");  
        System.out.print("실수 " + size + "개를 입력하세요. >> ");    
        
        double a[] = new double[size];
        
        for(int t = 0; t<a.length; t++){
        	
        	a[t] = input.nextDouble();
        	if(a[t] == 0){
        		break;
        	}
        }
     
        double sum = 0;
        for(int i = 0; i<a.length; i++){
        	
        	sum = a[i]+sum;
        }
        
        
        
        
        
        System.out.println("합: " + sum + ", 평균: " + sum/size);
	}
	
	

}
