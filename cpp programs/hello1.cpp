#include<iostream>
using namespace std;
class Swap
{
	public:
		int x,y;
    Swap()
    {
    }
    Swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;

        x=a;
        y=b;
    }
    int get_A()
    {
  
        return x;
    }
    int get_B()
    {
        return y;
    }
};
int main()
{
    int m,n;
    Swap s;
    Swap s1(10,20);
    m=s1.get_A();
    n=s1.get_B();
    cout<<"a value is "<<m<<endl;
    cout<<"b value is "<<n<<endl;
    return 0;
}
