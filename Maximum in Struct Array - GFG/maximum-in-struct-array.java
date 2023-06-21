//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Height
{
    int feet;
    int inches;
    
      public Height(int ft, int inc)
      {
           feet = ft;
           inches = inc;
      }
}

class maximum
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Height arr[] = new Height[n];
            for(int i = 0; i < n; i++)
            {
                int temp1 = sc.nextInt();
                int temp2 = sc.nextInt();
                arr[i] = new Height(temp1, temp2);
              
            }
            GfG gfg = new GfG();
            
            int res = gfg.findMax(arr, n);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


/*
Class of the element of the array is as
class Height {
	int feet;
	int inches;
	public Height(int ft, int inc)
	{
	    feet = ft;
	    inches = inc;
	}
	
}

in inches=12*feets
*/
// function must return the maximum Height
// return the height in inches
class GfG
{
    public static int findMax(Height a[], int n)
    {
       int maxHeight=0;
       for(int i=0; i<n; i++){
    if(maxHeight < a[i].feet*12+a[i].inches) {      
     maxHeight = a[i].feet*12+a[i].inches;
       // your code here
    }
       }
       return maxHeight;
       }
    
    
    
}