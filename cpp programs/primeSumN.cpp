#include <iostream>
using namespace std;

int main()
{
    int n;
    int k;
    int sum = 0;
    cout << "\n Enter n: ";
    cin >> n;
    k = n;
    for (int i = 1; i <= n; i++)
    {
        int count = 0;
        for (int j = 1; j <= i; j++)
        {
            if (i % j == 0)
            {
                count++;
            }
        }
        if (count == 2)
        {
            sum += i;
        }
    }
    cout << "\n sum of all prime numbers from 1 to " << k << " is " << sum << endl;
    return 0;
}