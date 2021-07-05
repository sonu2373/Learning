package TestPackage;

import java.util.Scanner;

public class Random_prac {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*
		String str="Lovely";
		StringBuilder str2=new StringBuilder();
		str2.append(str);
		str2=str2.reverse();			
		System.out.print(str2);
		
		//Without inbuilt function
		
		char arr[]=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		//	System.out.print(arr[i]);

		//Printing alphabets
		char c = 'a';
		do {
			System.out.print(c);
			c++;
		}
			while(c<='z');
		
		//Prime-numbers
		
		int num=100;
		
		for(int i=2;i<num;i++)
		{
			int status=0;
			
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					status=1;
					break;
				}
			}
			if(status!=1)
				System.out.println(i);
		}
		
		//Armstrong numbers
		 
		int a,temp,digits=0,rem,sum=0;
		a=sc.nextInt();
		temp=a;
		
		while(temp!=0)
		{
			digits++;
			temp=temp/10;
		}
		temp=a;
		
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+(int)Math.pow(rem, digits);
			temp=temp/10;
		}
		if(sum==a)
			System.out.print("Number is Armstrong number");
		else
			System.out.print("Number is not Armstrong number");
		sc.close();
		

		//Floyd's Triangle
		int b=sc.nextInt();
		int num=1;
		for(int c=1;c<=b;c++)
		{
			for(int d=1;d<c;d++)
			{
				System.out.print(num+"\t");
				num++;
			}
			System.out.println();
		}
				*/
		
		String str="ABCS";
		StringBuilder str1=new StringBuilder(str);
		
	
	}

}
