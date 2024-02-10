import java.util.*;
public class Arr
{
       public static void main(String[] args)
       {
              Scanner s=new Scanner(System.in);
              int t=s.nextInt();
              for(int i=0;i<t;i++)
              {
                     int n=s.nextInt();
                     int k=s.nextInt();
                     int[] a=new int[n];
                     for(int j=0;j<n;j++)
                     {
                            a[j]=s.nextInt();
                     }
                     if(k==1)
                     {
                           int small1=a[0];
                           int small2=a[0];
                           for(int l=0;l<n-1;l++)
                           {
                                  if(a[l]<a[l+1])
                                  {
                                         small1=a[l];
                                  }
                           }
                           for(int l=0;l<n;l++)
                           {
                                  if(a[l]==small1)
                                  {
                                         a[l]=0;
                                  }
                           }
                           for(int m=0;m<n-1;m++)
                           {
                                  if(a[m]<a[m+1]&&a[m]!=small1)
                                  {
                                         small2=a[m];
                                  }
                           }
                           for(int m=0;m<n;m++)
                           {
                                  if(a[m]==small2)
                                  {
                                         a[m]=0;
                                  }
                           }
                           int sum=0;
                           for(int r=0;r<n;r++)
                           {
                                  sum=sum+a[r];
                           }
                           System.out.println(sum);
                           
                     }
                     if(k==2)
                     {
                         int small1=a[0];
                           int small2=a[0];
                           for(int l=0;l<n-1;l++)
                           {
                                  if(a[l]<a[l+1])
                                  {
                                         small1=a[l];
                                  }
                           }
                           for(int l=0;l<n;l++)
                           {
                                  if(a[l]==small1)
                                  {
                                         a[l]=0;
                                  }
                           }
                           for(int m=0;m<n-1;m++)
                           {
                                  if(a[m]<a[m+1]&&a[m]!=small1)
                                  {
                                         small2=a[m];
                                  }
                           }
                           for(int m=0;m<n;m++)
                           {
                                  if(a[m]==small2)
                                  {
                                         a[m]=0;
                                  }
                           }
                           int big=a[0];
                           for(int r=0;r<n;r++)
                           {
                                  if(a[r]>a[r+1])
                                  {
                                         big=a[r];
                                  }
                           }
                           for(int e=0;e<n;e++)
                           {
                                  if(a[e]==big)
                                  {
                                         a[e]=0;
                                  }
                           }
                           int sum=0;
                           for(int f=0;f<n;f++)
                           {
                                  sum=sum+a[f];
                           }
                           System.out.println(sum);
                     }
              }
       }
}