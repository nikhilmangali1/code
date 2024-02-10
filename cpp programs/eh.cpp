#include <iostream>
#include <exception>

using namespace std;

int main() {
    int age;
    cout << "Enter your age: ";
    cin >> age;
    try {
        if (age < 18) {
            throw runtime_error("You must be at least 18 years old.");
        }
        else {
            cout << "You are eligible to vote." << endl;
        }
    }
    catch (const exception& e) {
        cout << "Error: " << e.what() << endl;
    }
    return 0;
}
