#include <iostream>
#include <stdexcept>

using namespace std;

void doSomething() {
    // some code that may throw an exception
    throw runtime_error("Something went wrong");
}

int main() {
    try {
        doSomething();
    }
    catch (const exception& e) {
        cerr << "Exception caught: " << e.what() << endl;
        // rethrow the exception
        throw e;
    }

    return 0;
}
