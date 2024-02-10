#include<iostream>
using namespace std;
class copy
{
    public:
    int x;
    copy(int x)
    {
        this->x=x;
    }
    copy(const copy &obj)
    {
        x=obj.x;
    }
};
int main()
{
    copy c(10);
    copy c2(c);
    cout<<"\n Value of class member :"<<c.x;
    cout<<"\n Value of class member :"<<c2.x;
    return 0;
}
