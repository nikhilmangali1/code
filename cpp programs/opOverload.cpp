#include<iostream>
using namespace std;
class base
{
    public:
    int k;
    base()
    {
        k=10;
    }
    void operator ++()
    {
        k=k+1;
    }
    void print()
    {
        cout<<k;
    }
};
int main()
{
    base b;
    ++b;
    b.print();
    return 0;
}