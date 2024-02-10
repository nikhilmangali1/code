#include<iostream>
using namespace std;
class Student
{
    string name;
    int rollno;
    float marks;
    public:
    void enterStudentDetails();
    void showStudentDetails();
};
void Student::enterStudentDetails()
{
    cout<<"\nEnter student name:";
    cin>>name;
    cout<<"\nEnter student rollno:";
    cin>>rollno;
    cout<<"\nENter student marks:";
    cin>>marks;
}
void Student::showStudentDetails()
{
    cout<<"\n\nStudent Name:"<<name;
    cout<<"\nStudent ROllNO:"<<rollno;
    cout<<"\nStudent Marks:"<<marks;
}
int main()
{
    Student student1,student2;
    Student *ptr1,*ptr2;
    ptr1=&student1;
    ptr2=&student2;
    ptr1->enterStudentDetails();
    ptr2->enterStudentDetails();
    ptr1->showStudentDetails();
    ptr2->showStudentDetails();
    return 0;
}