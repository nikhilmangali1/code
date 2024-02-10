#include<iostream>
using namespace std;
void add(int a,int b)
{
    cout<<"sum value is "<<(a+b)<<endl;
}
int main()
{
    void (*ptrTOFun)(int,int); //function pointer declaration
    ptrTOFun=&add;
    ptrTOFun(10,30);
    return 0;
}