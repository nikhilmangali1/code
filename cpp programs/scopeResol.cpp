#include<iostream>
using namespace std;
class ScopeRes
{
    private:
    int A;
    public:
    void setA(int a)
    {
        A=a;
    }
    int getA()
    {
        return A;
    }
};
int A;
int main()
{
    int A;
    ScopeRes sr;
    sr.setA(10);
    int classVar=sr.getA();
    ::A=100;
    A=200;
    cout<<"\nClass variable A:"<<classVar;
    cout<<"\nGlobal variable A:"<<::A;
    cout<<"\nLocal variable A:"<<A;
    return 0;
}