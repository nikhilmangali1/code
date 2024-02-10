#include<iostream>
using namespace std;
class Student
{
    public:
    string name;
    int rollno;
    char grade;
    void enterDetails();
    void showDetails();
};
void Student::enterDetails()
{
    cout<<"\nEnter student name:";
    cin>>name;
    cout<<"\nEnter student Roll No.:";
    cin>>rollno;
    cout<<"\nEnter student grade:";
    cin>>grade;
}
void Student::showDetails()
{
    cout<<"\nStuden name: "<<name;
    cout<<"\nStudent Roll No.: "<<rollno;
    cout<<"\nStudent Grade: "<<grade<<endl;
}
int main()
{
    Student s[3];
    for(int i=0;i<3;i++)
    {
    cout<<"\nEnter "<<i+1<<" student deatils:"<<endl;
    s[i].enterDetails();
    }
    for(int i=0;i<3;i++)
    {
    s[i].showDetails();
    }
}