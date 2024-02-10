#include<iostream>
using namespace std;
class A
{
    public:
    void fun()
    {
       cout<<"Func\n"; 
    }

};
int main()
{
A a,*a1;
a.fun();
a1=&a;
a1->fun();
return 0;
}