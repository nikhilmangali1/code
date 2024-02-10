#include<iostream>
using namespace std;
struct Student
{
    string name;
    int rollno;
    float marks;
};
int main()
{
    Student student1,student2;
    cout<<"\nENter Student 1 details:\n";
    cin>>student1.name>>student1.rollno>>student1.marks;
    cout<<"\nENter student 2 details\n";
    cin>>student2.name>>student2.rollno>>student2.marks;
    cout<<"\n--------------\n";
    cout<<"Student 1 Details:\n";
    cout<<"\nStudent 1 Name:"<<student1.name<<"\n";
    cout<<"\nStudent 1 Roll No:"<<student1.rollno<<"\n";
    cout<<"\nStudebt 1 Marks:"<<student1.marks<<"\n";
    cout<<"\n---------------\n";
    cout<<"\nStudent 2 Details:\n";
    cout<<"\nStudent 2 Name:"<<student2.name<<"\n";
    cout<<"\nStudent 2 Roll No:"<<student2.rollno<<"\n";
    cout<<"\nStudebt 2 Marks:"<<student2.marks<<"\n";
    return 0;
}