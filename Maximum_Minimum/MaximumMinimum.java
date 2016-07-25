/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toyprobs;
import java.util.*;


/**
 *
 * @author kimaiga
 */

public class MaximumMinimum {
	//get maximum value in array
	public static int maxValue(int[] x){
		int max = x[0];
		for(int i =0; i<x.length;i++){
		if(x[i]> max){
			max = x[i];
		}
			
		}
		return max;}
	
	//get min value in array
	public static int minValue(int[]x){
		int min = x[0];
		for(int j =0; j<x.length;j++){
			if(x[j]<min){
				min = x[j];
			}
		}
		return min;
	}
	
	public static void main(String[] args){
		
		int[] array = {1,2,3,4,5};
		MaximumMinimum mm = new MaximumMinimum();
		mm.maxValue(array);
		System.out.println("Max value be: "+mm.maxValue(array));
		System.out.println("Min Value be: "+mm.minValue(array));
		
	
}
	
	
}