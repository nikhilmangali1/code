#include<iostream>
using namespace std;
int m=20;
int main()
{
    int m=30;
    {
    int m=42;
    cout<<m;
    cout<<::m;
    }
    cout<<::m;
}
