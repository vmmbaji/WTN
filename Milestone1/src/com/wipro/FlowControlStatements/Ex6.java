package com.wipro.FlowControlStatements;

public class Ex6 {
	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("No value");
		}
		else
		{
			int n=0;
			for(String s:args)
			{
				System.out.print(s);
				if(n<args.length-1)
					System.out.print(",");
				n++;
			}
		}
	}

}
