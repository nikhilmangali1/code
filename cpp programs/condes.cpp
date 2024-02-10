#include<iostream>
using namespace std;
class parent
{
    public:
    parent()
    {
        cout<<"\n parent con";
    }
    ~parent()
    {
        cout<<"\n parent des";
    }
};
class child1:public parent
{
    public:
    child1()
    {
        cout<<"\n c1 con";
    }
    ~child1()
    {
        cout<<"\n c1 des";
    }
};
class child2:public child1
{
    public:
     child2()
    {
        cout<<"\n c2 con";
    }
    ~child2()
    {
        cout<<"\n c2 des";
    }
};
int main()
{
    child2 c;
    return 0;
}