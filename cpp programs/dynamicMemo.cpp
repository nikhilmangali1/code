#include<iostream>
using namespace std;
int main()
{
    int n,*a,*b;
    cout<<"\nENter no.of elements to allocate memory:";
    cin>>n;
    a=new int[n];
    cout<<"\nENter...."<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    cout<<"\nDisplay...";
    for(int i=0;i<n;i++)
    {
        cout<<endl<<a[i];
    }
    b=new int;
    cout<<"\nENter b value:";
    cin>>*b;
    cout<<"\nb value :"<<*b<<endl;
    delete []a;
    delete b;
    return 0;
}