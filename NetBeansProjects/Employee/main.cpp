//Benjamin Cigelnik  chapter 7 problem 1  June 25, 2015

#include <iostream>
#include <fstream>
#include <cstdlib>
void toss();  // prototype
void newToss();

using namespace std;

int main() {
    // Write the code to prompt the user for the number of tosses
    int numberTosses;
    cout << "How many times should the coin be tossed?" << endl;
    cin >> numberTosses;
    // Define a for-loop starting at 0 with a limit of the number entered above
    srand(time(NULL)); // seed the randomizer
    for (int counter = 0; counter < numberTosses; counter++) //took out <=
    {
        // Write the code to call the function toss
        newToss();


    }
    cin.sync();
    cin.get();
    return 0;

}
void toss() {
    int rnd = rand() % 2 + 1; // returns either a 1 or a 2
    // Write the statement(s) to test rnd.  If it is 1, output heads else tails
    if (rnd == 1)
        cout << "Heads" << endl;
    else if (rnd == 2)
        cout << "Tails" << endl;
    else
        cout << "Error" << endl;
}

void newToss(){
    bool rndb = rand();
    cout << rndb << endl;
    if (rndb == true)
        cout << "Heads" << endl;
    else if (rndb == false) 
        cout << "Tails" << endl;
    else
        cout << "Error" << endl;
}


