#include<iostream>
using namespace std;
class Child
{
    public:
    void Pol(int x)
    {
        cout<<x+x<<endl;
    }
    void Pol(int x,int c)
    {
        cout<<x+c<<endl;
    }
};
int main()
{
    Child c;
    c.Pol(5,10);
    c.Pol(10);
    return 0;
}