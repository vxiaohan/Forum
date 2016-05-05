package com.f1020.forum;

import java.util.*;

public class trans
{
	public trans () {
		
	}
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int X=0,K=0,Y=0;
        X=cin.nextInt();
        K=cin.nextInt();
        int i=0;
        while (i<K){
          Y++;
		  if((X&Y)==0){
			  i++;
		  }
		}
		System.out.println(Y);
    }
}