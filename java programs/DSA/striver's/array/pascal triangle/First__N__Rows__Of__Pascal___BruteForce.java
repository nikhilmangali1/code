
/**
 * 
 * TIme Complexity --> O(n^3)
 */

import java.util.ArrayList;
import java.util.List;

public class First__N__Rows__Of__Pascal___BruteForce 
{
    private static int nCr(int n,int r)
    {
        int res=1;
        for(int i=0;i<r;i++)
        {
            res*=(n-i);
            res/=(i+1);
        }
        return (int)res;
    }
    private static List<List<Integer>> firstNROws(int n)
    {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> teampList;
        for(int row=1;row<=n;row++)
        {
        teampList=new ArrayList<>();
            for(int col=1;col<=row;col++)
            {
                teampList.add(nCr(row-1,col-1));
            }
            ans.add(teampList);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=10;
        List<List<Integer>> list=firstNROws(n);
        for(List<Integer> ele:list)
        {
            for(int i:ele)
            {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}
