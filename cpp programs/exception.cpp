#include <iostream>
#include <stdexcept>

using namespace std;

int main()
{
    try
    {
        // some code that may throw an exception
        int num = 10 / 0; // division by zero exception
        char c = 'a';
        if (!isdigit(c))
        {
            throw invalid_argument("Invalid argument: not a digit");
        }
    }
    catch (const char *msg)
    {
        cerr << "Error: " << msg << endl;
    }
    catch (const std::exception &e)
    {
        cerr << "Exception caught: " << e.what() << endl;
    }
    catch (...)
    {
        cerr << "Unknown exception caught" << endl;
    }

    return 0;
}
