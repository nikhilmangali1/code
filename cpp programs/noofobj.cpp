#include<iostream>
using namespace std;
class Base
{
    public:
    static int count;
    Base()
    {
        count=count+1;
    }
};
int Base::count=0;
int main()
{
    Base b1,b2,b3;
    cout<<Base::count<<endl;
    return 0;
}