#inlclude<iostream>
#include<string>
using namespace std;
class employee
{
    public:
    int id;
    char name[30];
    float salary;
    employee(int id,char name[30],float salary)
    {
        this->id=id;
        strcpy(this->name,name);
        this->salary=salary;
    }
    void show()
    {
        cout<<this->id <<" "<<this->name<<" "<<this->salary;
    }
};
int main()
{
    employee e1=employee(1,"anu",10000.0);
    employee e2=employee(2,"adres",20000.0);
    e1.show();
    e2.show();
    return 0;
}