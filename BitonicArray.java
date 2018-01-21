/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biotonicarray;

/**
 *
 * @author spandyie
 */
import java.util.*;
public class BiotonicArray {

    /**
     * @param args the command line arguments
     */
    
    public static boolean find(int[] IntAr, int val){
        int l = 0;
        int r = IntAr.length-1; 
        int m = max(IntAr);
        int left,right;
        
        if (val == IntAr[m]) return true;
        else{
            left = BinarySearchAsc(IntAr, 0,m,val);
            right = BinarySearchDsc(IntAr,m,r,val);
        }
        
        if(left == -1 && right == -1) return false;
        else return true;

        
    }
 
    private static int BinarySearchAsc(int[] array, int l, int r, int val){
        
        if( r >= l){
            int mid = l + (r-l)/2;
            if(array[mid] == val) return mid;
            if(array[mid] > val) return BinarySearchAsc(array, l, mid-1, val);
            if(array[mid] < val) return BinarySearchAsc(array, mid+1, r, val);
        }
        
        return -1;
    }

    private static int BinarySearchDsc(int[] array, int l, int r, int val){
        
        if( r >= l){
            int mid = l + (r-l)/2;
            if(array[mid] == val) return mid;
            if(array[mid] > val) return BinarySearchDsc(array, mid+1, r, val);
            if(array[mid] < val) return BinarySearchDsc(array, l, mid-1, val);
        }
        
        return -1;
    }
    
    private static int max(int[] array){
        int max  = array[0];
        int index = 0;
        for(int i=1; i< array.length; i++){
            if(array[i] > max){
               max = array[i];
               index = i;
            }
            
        }
        return index;
    }
    public static void main(String[] args) {
        int[] data1, data2, data3;
        data1 = new int[] {5, 6, 7, 8, 9, 10, 3,2, 1};
        data2 = new int[]  { 10,5,3,2,1};
        data3 = new int[]  { 5, 6, 7, 8, 9, 10};
        //System.out.print("The input Bitonic array is as follows: ");
      
        //System.out.print(BinarySearchAsc(data1,0,5,5));
       // System.out.print("The max of the input Bitonic array is as follows: ");
      
        //System.out.print(BinarySearchDsc(data1,5,8,1));
       // System.out.print( BinarySearchAsc(data1,0, 5, 10));
        Scanner inp = new Scanner(System.in);
        int val = inp.nextInt();
        System.out.print(val + "  is  present in bitonic array? 2: ");
        System.out.print( find(data1,val));
        
        
    }
    
}
