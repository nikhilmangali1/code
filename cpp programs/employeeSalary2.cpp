#include<iostream>
using namespace std;
class Employee
{
    public:
    string name;
    int no;
    float basic;
    float da;
    float it;
    float net;
    void enter();
    void show();
};
void Employee::enter()
{
    cout<<"\nEnter employee name:";
    cin>>name;
    cout<<"\nEnter no:";
    cin>>no;
    cout<<"\nEnter Basic salary:";
    cin>>basic;
}
void Employee::show()
{
    cout<<"\nEmployee Name: "<<name;
    cout<<"\nEmployee NO.:"<<no;
    cout<<"\n Net Salary :"<<net;
}
int main()
{
    Employee e[10];
    int n;
    cout<<"\nEnter no.of employees:";
    cin>>n;
    for(int i=0;i<n;i++)
    {
        e[i].enter();
    }
    for(int i=0;i<n;i++)
    {
        e[i].da=0.52*e[i].basic;
        e[i].it=0.3*e[i].basic;
        e[i].basic=e[i].basic+e[i].da;
        e[i].net=e[i].basic-e[i].it;
    }
    for(int i=0;i<n;i++)
    {
        e[i].show();
    }
    return 0;
}