#include<iostream>
using namespace std;
int main()
{
    int *a,n;
    cout<<"\nENter n";
    cin>>n;
    a=new int[n];
    for(int i=0;i<n;i++)
    {
        cout<<"\nEnter "<<i<<" element : ";
        cin>>a[i];
    }
    for(int i=0;i<n;i++)
    {
        cout<<"\n "<<i<<" element is : "<<a[i];
    }
    delete []a;
    return 0;
}