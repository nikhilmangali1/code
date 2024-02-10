#include<iostream>
using namespace std;
class A1
{
    private:
    int a;
    public:
    void setA(int a)
    {
        this->a=a;
    }
    int getA()
    {
        return a;
    }
};
class A2:public A1
{
    private:
    int b;
    public:
    void setB(int B)
    {
        b=B;
    }
    int ADD()
    {
        int classA=getA();
        int sum=b+classA;
        return sum;
    }
};
class A3:public A2
{
    private:
    int c;
    public:
    void setC(int C)
    {
        c=C;
    }
    int MUL()
    {
        int add=ADD();
        return add*c;
    }
};
int main()
{
    A3 a3;
    a3.setA(10);
    a3.setB(20);
    a3.setC(30);
    int product=a3.MUL();
    cout<<"\nMUltiplication:"<<product<<endl;
    return 0;
}