import java.io.*;
import java.util.*;

class Solution {
    public static String kthDistinct(String[] arr, int k) 
    {
        HashMap<String,Integer> hash = new HashMap<>();

        for(int i = 0; i<arr.length; i++)
        hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);

        int count = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(hash.get(arr[i])==1 && count==k)
            {
                return arr[i];
                break;
            }
            else
            count+=1;
        }

        return "";
    }
    public static void main(String[] args) {
        String arr[] = {"d","b","c","b","c","a"};
        int k = 2;
        
        kthDistinct(arr,k);
    }
}
