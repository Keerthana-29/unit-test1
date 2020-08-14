/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KEERTHANA
 */
public class displayduplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4,1,2,4};
        System.out.println("Duplicate elements in array:");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                    System.out.println(arr[j]);
            }
        }
        // TODO code application logic here
    }
    
}
