#include<iostream>
using namespace std;
class Stat
{
    public:
    static int Field1,Field2;
    static void printData()
    {
        cout<<"\n value 1 :"<<Field1<<"\n value 2 :"<<Field2<<endl;
    }
};
int Stat::Field1=10;
int Stat::Field2=20;
int main()
{
    Stat s;
    
    s.printData();
    return 0;
}