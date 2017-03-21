import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
	
        System.out.print("입력할 최대 실수의 갯수를 입력하세요. >> ");
        Scanner input = new Scanner(System.in);
        
         int size = input.nextInt();
        System.out.println("\n중간에 0을 입력하면 이전 입력자료로 계산하고 종료합니다.");
        double ary[] = new double[size];
        System.out.print("실수 " + size + "개를 입력하세요. >> ");
        Scanner num = new Scanner(System.in);
        for(int i=0; i<size; i++)
            ary[i] = num.nextDouble();            
            
         double sum=0;
        
         for(int j=0; j<size; j++)
        	sum+=ary[j];
       
        
       System.out.println("합: " + sum + ", 평균: " + sum/size);
    }

}
