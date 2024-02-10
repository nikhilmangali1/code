#include<iostream>
using namespace std;
class base
{
    private:
    int x;
    public:
    void setX(int a)
    {
        x=a;
    }
    int getX()const;
};
int base::getX() const
{
    return x;
}
int main()
{
    base b;
    b.setX(10);
    cout<<"\n value of x "<<b.getX()<<endl;
    return 0;
}