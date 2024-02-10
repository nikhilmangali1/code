#include<iostream>
using namespace std;
class Base
{
    private:
    int BaseMember;
    public:
    Base()
    {}
    void setBaseMem(int b)
    {
        BaseMember=b;    
    }
    int getBaseMem()
    {
        return BaseMember;
    }
    virtual void function(int i)
    {
        cout<<"\n Square of "<<i<<" is "<<i*i<<endl;
    }
};
class Derived:public Base
{
    private:
    int DerivedMember;
    public:
    void setDerivedMem(int d)
    {
        DerivedMember=d;
    }
    int getDerivedMem()
    {
        return DerivedMember;
    }
    void function(int i)
    {
        cout<<"\n Cube of "<<i<<" is "<<i*i*i<<endl;
    }
};
int main()
{
    Derived d;
    Base *BASEptr;
    BASEptr=&d;
    BASEptr->setBaseMem(10);
    cout<<"\n Base member value is "<<BASEptr->getBaseMem()<<endl;
    BASEptr->function(10);
    Derived *DERIVEDptr;
    DERIVEDptr=&d;
    DERIVEDptr->setDerivedMem(20);
    cout<<"\n Derived  member value is "<<DERIVEDptr->getDerivedMem()<<endl;
    DERIVEDptr->function(120);
}