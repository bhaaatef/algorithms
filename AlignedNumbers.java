package com.example.demo;

public class AlignedNumbers {
	 public int solution(int[] A, int M) {
	        // write your code in Java SE 8
	        int[] f = new int[M];
	        
	        for(int i = 0; i < A.length; i++){
	            f[Math.abs(A[i] % M)]++;
	        }
	        
	        /*if(M %2 == 0){
	            f[M/2] = Math.max(f[M/2], 1);
	        }*/
	        
	        //int result = Math.max(f[0], 1);
	        int result  = 1;
	        for(int i = 0; i < M; i++){
	            //result += f[i]/2;
	        	result = Math.max(result, f[i]);
	        }
	        
	        for(int i = 0; i < f.length; i++){
	            System.out.println(f[i]);
	        }
	        return result;
	    }
	public static void main(String[] args){
		AlignedNumbers alignedNumbers = new AlignedNumbers();		
		System.out.println(alignedNumbers.solution(new int[]{7, 1, 11, 8, 4, 10}, 8));
		//System.out.println(-2%3);
	}
}
