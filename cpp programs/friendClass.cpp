#include<iostream>
using namespace std;
class mainm
{
    private:
    int pvt;
    public:
    mainm()
    {
        pvt=100;
    }
    friend class submain;
};
class submain
{
    public:
    void display(mainm m)
    {
        cout<<"\n value of pvt variable in another class "<<m.pvt<<endl;
    }
};
int main()
{
    mainm m; 
    submain s;
    s.display(m);
    return 0;
}