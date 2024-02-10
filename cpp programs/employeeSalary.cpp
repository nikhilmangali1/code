#include<iostream>
using namespace std;
class Employee
{
    public:
    string name;
    int No;
    float basic_salary;
    float direct_allowance;
    float income_tax;
    double net_salary;
};
int main()
{
    Employee e;
    cout<<"\nEnter Employee name:";
    cin>>e.name;
    cout<<"\nEnter Employee's ID Number:";
    cin>>e.No;
    cout<<"\nEnter Employee's basic salary:";
    cin>>e.basic_salary;
    cout<<"\nEnter Direct allowance:";
    cin>>e.direct_allowance;
    cout<<"\nEnter Income tax:";
    cin>>e.income_tax;
    e.basic_salary=e.basic_salary+e.direct_allowance;
    e.net_salary=e.basic_salary-e.income_tax;
    cout<<"\nEMPLOYEE DETAILS:";
    cout<<"\nEmployee Name: "<<e.name;
    cout<<"\nEmployee Mobile number: "<<e.No;
    cout<<"\nBAsic Salary: "<<e.basic_salary;
    cout<<"\nDA :"<<e.direct_allowance;
    cout<<"\nIT: "<<e.income_tax;
    cout<<"\nEmployee Net Salary: "<<e.net_salary;
    return 0;
}