import java.util.ArrayList;
import java.util.List;

public class First__N__Rows__Of__Pascal___Better {
    private static List<Integer> generateRow(int n)
    {
        int res=1;
        List<Integer> list=new ArrayList<>();
        list.add(0,1);
        for(int col=1;col<=n;col++)
        {
            res*=(n-col);
            res/=(col+1);
            list.add(res);
        }
        return list;
    }
    private static List<List<Integer>> pascalTriangle(int n)
    {
        List<List<Integer>> ans=new ArrayList<>();
        for(int row=1;row<=n;row++)
        {
            ans.add(generateRow(row));
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=10;
        List<List<Integer>> list=pascalTriangle(n);
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
