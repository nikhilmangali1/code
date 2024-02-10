#include<iostream>
using namespace std;
class abcd
{
    private:
    int x;
    public:
    void setX(int a)
    {
        x=a;
    }
    int getX()
    {
        return x;
    }
    friend void squareOfX(abcd&);
};
void squareOfX(abcd &obj)
{
    cout<<"\n square of x is "<<obj.x*obj.x<<endl;
}
int main()
{
    abcd kk;
    kk.setX(10);
    cout<<"\n value of the x is "<<kk.getX()<<endl;
    squareOfX(kk);
    return 0;
}