#include<iostream>
using namespace std;
class Man
{
    public:
    virtual void eat()          //if eat=o; without definition --> pure virtual functions
    {
        cout<<"\n man eats food daily";
    }
};
class Nikhil:public Man
{
    public:
    void eat()
    {
        cout<<"\n nikhil eats food daily";
    }
};
class Srikanth:public Man
{
    public:
    void eat()
    {
        cout<<"\n srikanth eats food daily";
    }
};
int main()
{
    Man *ptr;

    Nikhil n;
    Srikanth s;
    
    ptr=&n;
    ptr->eat();

    ptr=&s;
    ptr->eat();

    return 0;
}