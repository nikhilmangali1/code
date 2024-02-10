#include <iostream>
using namespace std;
class Arithmetic
{
public:
    void add(int a, int b)
    {
        cout << "\nSum:" << a + b << endl;
    }
    void sub(int a, int b, int c)
    {
        cout << "\nSubtraction:" << a - b - c << endl;
    }
    void mul(int a, int b, int c, int d)
    {
        cout << "\nProduct:" << a * b * c * d << endl;
    }
    void div(int a, int c)
    {
        cout << "\nDivision:" << a / c << endl;
    }
};
int main()
{
    int n;
    cout << "\nENter no.of funtions available :";
    cin >> n;
    Arithmetic *ptr[n];
    ptr[0]->add(-10, 20);
    ptr[1]->sub(20,-5,10);
    ptr[2]->mul(10,1,30,-40);
    ptr[3]->div(20,-2);
    return 0;
}