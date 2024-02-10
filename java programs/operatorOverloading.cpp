#include<iostream>
using namespace std;
class op
{
    int x,y;
    public:
    op(int x,int y)
    {
        this->x=x;
        this->y=y;
    }
    op operator+(const op &obj)
    {
        return op(x+obj.x,y+obj.y);
    } 
    op operator-(const op &obj)
    {
        return op(x-obj.x,y-obj.y);
    } 
    void display()
    {
        cout<<"x :"<<x<<"\ny :"<<y<<endl;
    }
};
int main()
{
    op o1(60,90);
    op o2(30,40);
    op res1=o1+o2;
    op res2=o1-o2;
    res1.display();
    res2.display();
    return 0;
}