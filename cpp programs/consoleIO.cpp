#include<iostream>
using namespace std;
int main()
{
    char ch;
    char charAr[20];
    cout<<"\nENter your name:";
    cin.getline(charAr,20);
    cout<<"\nDisplaying your name:";
    cout.write(charAr,6);
    cout<<"\nEnter a character to store in ch variable:";
    ch=cin.get();
    cout<<"\nDisplaying character:";
    cout.put(ch);
    return 0;
}