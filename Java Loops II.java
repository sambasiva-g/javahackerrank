import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int bs=0;
            for(int j=0;j<n;j++){
            int f=0;
            int z;
            z=(int)Math.pow(2,j);
            bs=bs+z*b;
            f=a+bs;
            System.out.print(f+" ");
            
            }
            System.out.println();
        }
        in.close();
    }
}
