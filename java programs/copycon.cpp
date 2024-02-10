#include<iostream>
using namespace std;
class copyy
{
    public:
    int x;
    copyy(int x)
    {
        this->x=x;
    }
    copyy(copyy &obj)
    {
        x=obj.x;
    }
};
int main()
{
    copyy c(10);
    copyy c2=c;
    cout<<"\n Value of class member :"<<c.x;
    cout<<"\n Value of class member :"<<c2.x;
    return 0;
}