#include<iostream>
using namespace std;
int main()
{
    string s="welcometojntuhcejcollege";
    string p="nikhil";
    int ls=s.length();
    int lp=p.length();
    int i=0;
    int j=0;
   while(i<=ls-lp)
   {
    j=0;
    while(j<lp)
    {
        if(s[i+j]!=p[j])
        {
            break;
        }
        j++;
    }
    if(j==lp)
    {
        cout<<"\nPattern found at "<<i<<endl;
    }
    i++;
   }
   return 0;
}