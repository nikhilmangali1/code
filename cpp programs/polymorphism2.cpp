#include<iostream>
using namespace std;
class Parent
{
    public:
    int x;
    Parent(int XYX)
    {
        this->x=XYX;
    }
    int SquareOfX()
    {
        return x*x;
    }
};
class Child:public Parent
{
    public:
    int a;
    Child(int x)
    {
        a=x;
    }
   int SquareOfX()
   {
    return a*a;
   }
};
int main()
{
    Child c(10);
    cout<<"\nChild classmethod "<<c.SquareOfX();
    cout<<"\nParent classmethod "<<c.SquareOfX();

    return 0;

}