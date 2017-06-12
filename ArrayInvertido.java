package hackerrank.datastructure;


import java.util.Scanner;

public class ArrayInvertido {

    public static void main(String[] args) {
	        Scanner stdin = new Scanner(System.in);
	        int n = stdin.nextInt();
	        int arr[] = new int[n];
	        for(int i=0; i < n; i++)
	            arr[i] = stdin.nextInt();

	        for(int i=0; i < n; i++)
	            System.out.print(arr[n-1-i] + " ");

	        stdin.close();
	    }
}
