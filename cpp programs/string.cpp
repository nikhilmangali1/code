#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int main()
{
    string input = "3.1415";
    stringstream ss(input); // create a stringstream object with the input string

    double pi;
    ss >> pi; // read the double value from the stringstream

    string output = "The value of pi is " + to_string(pi); // concatenate the double value with a string

    cout << output << endl; // output the result

    return 0;
}
