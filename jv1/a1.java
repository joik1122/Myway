package p1;

import java.util.Scanner;
public class a1 {
	
	public static void main(String[] args){
		
		System.out.println("�Է��� �ִ� �Ǽ��� ������ �Է��Ͻÿ�.>>");
		Scanner input = new Scanner(System.in);  
        int size = input.nextInt();    
        System.out.println("\n�߰��� 0�� �Է��ϸ� ���� �Է��ڷ�� ����ϰ� �����մϴ�.");  
        System.out.print("�Ǽ� " + size + "���� �Է��ϼ���. >> ");    
        
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
        
        
        
        
        
        System.out.println("��: " + sum + ", ���: " + sum/size);
	}
	
	

}
