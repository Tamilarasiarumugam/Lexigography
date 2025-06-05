package Basics;
import java.util.*;

public class Lexigography {
	
	public static String countSort(String s)
	{
		int[] arr=new int[26];
		int index;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=0;
		}
		for(int i=0;i<s.length();i++)
		{
			index=(int)s.charAt(i)-97;
			
			arr[index]++;
		}
		String ans="";
		for(int i=0;i<26;i++)
		{
			int n=arr[i];
			for(int j=0;j<n;j++)
			{
				ans+=(char)(i+97);
				
			}
		}
		return ans;
	}
	
	public static void main(String[] args)
	{
		String s="geeksforgeeks";
		System.out.println(countSort(s));
	}

}
