//Benjamin Cigelnik  chapter 7 problem 1  June 25, 2015

#include <iostream>
#include <fstream>

using namespace std;

int main ()
{
    ifstream inFile;
    ofstream outFile1, outFile2, outFile3, outFile4, outFile5, outFile6, outFile7, outFile8, outFile9, outFile10; //Output files
    int pers, product, price, quantity, count =  0;
    int pers1 = 0, pers2 = 0, pers3 = 0, pers4 = 0, pers5 = 0, pers6 = 0, pers7 = 0, pers8 = 0, pers9 = 0, pers10 = 0; //Variables to add the total up
    
    
    inFile.open("Employee.txt"); //open the data file
    outFile1.open("salespers1.dat"); outFile2.open("salespers2.dat");
    outFile3.open("salespers3.dat"); outFile4.open("salespers4.dat"); outFile5.open("salespers5.dat"); outFile6.open("salespers6.dat");
    outFile7.open("salespers7.dat"); outFile8.open("salespers8.dat"); outFile9.open("salespers9.dat"); outFile10.open("salespers10.dat");
    
    while (inFile >> pers >> product >> quantity) //Run while file has numbers
    {
        inFile >> pers >> product >> quantity; //get the data into variables
        count ++;
        price = 0;
        cout << pers << endl;
        
        if ((pers != 1) && (pers != 2) && (pers != 3) && (pers != 4) && (pers != 5) && (pers != 6) && (pers != 7) && (pers != 8) && (pers != 9) && (pers != 10))
        {
            cout << "Invalid salesperson number at " << count << endl;
            break;
        }
        
        if ((product != 7) && (product != 8) && (product != 9) && (product != 10) && (product != 11) && (product != 12) && (product != 13) && (product != 14))
        {
            cout << "Invalid product ID at " << count << endl;
            break;
        }
        
        switch (pers) //switch for salespersons
        {
            case 1: outFile1 << product << " " <<  quantity; //print product ID and price to output file
                switch (product) //switch for all the products repeated for each salesman
            {
                case 7: price = quantity * 345; //total price of product
                    pers1 += price; //add onto total price of product
                    outFile1 << " $" << price << endl; //print product price to output file
                    break;
                    
                case 8: price = quantity * 853;
                    pers1 += price;
                    outFile1 << " $" << price << endl;
                    break;
                    
                case 9: price = quantity * 471;
                    pers1 += price;
                    outFile1 << " $" << price << endl;
                    break;
                    
                case 10: price = quantity * 933;
                    pers1 += price;
                    outFile1 << " $" << price << endl;
                    break;
                    
                case 11: price = quantity * 721;
                    pers1 += price;
                    outFile1 << " $" << price << endl;
                    break;
                    
                case 12: price = quantity * 663;
                    pers1 += price;
                    outFile1 << " $" << price << endl;
                    break;
                    
                case 13: price = quantity * 507;
                    pers1 += price;
                    outFile1 << " $" << price << endl;
                    break;
                    
                case 14: price = quantity * 259;
                    pers1 += price;
                    outFile1 << " $" << price << endl;
                    break;
            }
                
            case 2: outFile2 << product << " " << quantity;
                switch (product)
            {
                case 7: price = quantity * 345;
                    pers2 += price;
                    outFile2 << " $" << price << endl;
                    break;
                    
                case 8: price = quantity * 853;
                    pers2 += price;
                    outFile2 << " $" << price << endl;
                    break;
                    
                case 9: price = quantity * 471;
                    pers2 += price;
                    outFile2 << " $" << price << endl;
                    break;
                    
                case 10: price = quantity * 933;
                    pers2 += price;
                    outFile2 << " $" << price << endl;
                    break;
                    
                case 11: price = quantity * 721;
                    pers2 += price;
                    outFile2 << " $" << price << endl;
                    break;
                    
                case 12: price = quantity * 663;
                    pers2 += price;
                    outFile2 << " $" << price << endl;
                    break;
                    
                case 13: price = quantity * 507;
                    pers2 += price;
                    outFile2 << " $" << price << endl;
                    break;
                    
                case 14: price = quantity * 259;
                    pers2 += price;
                    outFile2 << " $" << price << endl;
                    break;
            }
                
            case 3: outFile3 << product << " " << quantity;
                switch (product)
            {
                case 7: price = quantity * 345;
                    pers3 += price;
                    outFile3 << " $" << price << endl;
                    break;
                    
                case 8: price = quantity * 853;
                    pers3 += price;
                    outFile3 << " $" << price << endl;
                    break;
                    
                case 9: price = quantity * 471;
                    pers3 += price;
                    outFile3 << " $" << price << endl;
                    break;
                    
                case 10: price = quantity * 933;
                    pers3 += price;
                    outFile3 << " $" << price << endl;
                    break;
                    
                case 11: price = quantity * 721;
                    pers3 += price;
                    outFile3 << " $" << price << endl;
                    break;
                    
                case 12: price = quantity * 663;
                    pers3 += price;
                    outFile3 << " $" << price << endl;
                    break;
                    
                case 13: price = quantity * 507;
                    pers3 += price;
                    outFile3 << " $" << price << endl;
                    break;
                    
                case 14: price = quantity * 259;
                    pers3 += price;
                    outFile3 << " $" << price << endl;
                    break;
            }
                
            case 4: outFile4 << product << " " << quantity;
                switch (product)
            {
                case 7: price = quantity * 345;
                    pers4 += price;
                    outFile4 << " $" << price << endl;
                    break;
                    
                case 8: price = quantity * 853;
                    pers4 += price;
                    outFile4 << " $" << price << endl;
                    break;
                    
                case 9: price = quantity * 471;
                    pers4 += price;
                    outFile4 << " $" << price << endl;
                    break;
                    
                case 10: price = quantity * 933;
                    pers4 += price;
                    outFile4 << " $" << price << endl;
                    break;
                    
                case 11: price = quantity * 721;
                    pers4 += price;
                    outFile4 << " $" << price << endl;
                    break;
                    
                case 12: price = quantity * 663;
                    pers4 += price;
                    outFile4 << " $" << price << endl;
                    break;
                    
                case 13: price = quantity * 507;
                    pers4 += price;
                    outFile4 << " $" << price << endl;
                    break;
                    
                case 14: price = quantity * 259;
                    pers4 += price;
                    outFile4 << " $" << price << endl;
                    break;
            }
                
            case 5: outFile5 << product << " " << quantity;
                switch (product)
            {
                case 7: price = quantity * 345;
                    pers5 += price;
                    outFile5 << " $" << price << endl;
                    break;
                    
                case 8: price = quantity * 853;
                    pers5 += price;
                    outFile5 << " $" << price << endl;
                    break;
                    
                case 9: price = quantity * 471;
                    pers5 += price;
                    outFile5 << " $" << price << endl;
                    break;
                    
                case 10: price = quantity * 933;
                    pers5 += price;
                    outFile5 << " $" << price << endl;
                    break;
                    
                case 11: price = quantity * 721;
                    pers5 += price;
                    outFile5 << " $" << price << endl;
                    break;
                    
                case 12: price = quantity * 663;
                    pers5 += price;
                    outFile5 << " $" << price << endl;
                    break;
                    
                case 13: price = quantity * 507;
                    pers5 += price;
                    outFile5 << " $" << price << endl;
                    break;
                    
                case 14: price = quantity * 259;
                    pers5 += price;
                    outFile5 << " $" << price << endl;
                    break;
            }
                
            case 6: outFile6 << product << " " << quantity;
                switch (product)
            {
                case 7: price = quantity * 345;
                    pers6 += price;
                    outFile6 << " $" << price << endl;
                    break;
                    
                case 8: price = quantity * 853;
                    pers6 += price;
                    outFile6 << " $" << price << endl;
                    break;
                    
                case 9: price = quantity * 471;
                    pers6 += price;
                    outFile6 << " $" << price << endl;
                    break;
                    
                case 10: price = quantity * 933;
                    pers6 += price;
                    outFile6 << " $" << price << endl;
                    break;
                    
                case 11: price = quantity * 721;
                    pers6 += price;
                    outFile6 << " $" << price << endl;
                    break;
                    
                case 12: price = quantity * 663;
                    pers6 += price;
                    outFile6 << " $" << price << endl;
                    break;
                    
                case 13: price = quantity * 507;
                    pers6 += price;
                    outFile6 << " $" << price << endl;
                    break;
                    
                case 14: price = quantity * 259;
                    pers6 += price;
                    outFile6 << " $" << price << endl;
                    break;
            }
                
            case 7: outFile7 << product << " " << quantity;
                switch (product)
            {
                case 7: price = quantity * 345;
                    pers7 += price;
                    outFile7 << " $" << price << endl;
                    break;
                    
                case 8: price = quantity * 853;
                    pers7 += price;
                    outFile7 << " $" << price << endl;
                    break;
                    
                case 9: price = quantity * 471;
                    pers7 += price;
                    outFile7 << " $" << price << endl;
                    break;
                    
                case 10: price = quantity * 933;
                    pers7 += price;
                    outFile7 << " $" << price << endl;
                    break;
                    
                case 11: price = quantity * 721;
                    pers7 += price;
                    outFile7 << " $" << price << endl;
                    break;
                    
                case 12: price = quantity * 663;
                    pers7 += price;
                    outFile7 << " $" << price << endl;
                    break;
                    
                case 13: price = quantity * 507;
                    pers7 += price;
                    outFile7 << " $" << price << endl;
                    break;
                    
                case 14: price = quantity * 259;
                    pers7 += price;
                    outFile7 << " $" << price << endl;
                    break;
            }
                
            case 8: outFile8 << product << " " << quantity;	
                switch (product)
            {
                case 7: price = quantity * 345;
                    pers8 += price;
                    outFile8 << " $" << price << endl;
                    break;
                    
                case 8: price = quantity * 853;
                    pers8 += price;
                    outFile8 << " $" << price << endl;
                    break;
                    
                case 9: price = quantity * 471;
                    pers8 += price;
                    outFile8 << " $" << price << endl;
                    break;
                    
                case 10: price = quantity * 933;
                    pers8 += price;
                    outFile8 << " $" << price << endl;
                    break;
                    
                case 11: price = quantity * 721;
                    pers8 += price;
                    outFile8 << " $" << price << endl;
                    break;
                    
                case 12: price = quantity * 663;
                    pers8 += price;
                    outFile8 << " $" << price << endl;
                    break;
                    
                case 13: price = quantity * 507;
                    pers8 += price;
                    outFile8 << " $" << price << endl;
                    break;
                    
                case 14: price = quantity * 259;
                    pers8 += price;
                    outFile8 << " $" << price << endl;
                    break;
            }
                
            case 9: outFile9 << product << " " << quantity;
                switch (product)
            {
                case 7: price = quantity * 345;
                    pers9 += price;
                    outFile9 << " $" << price << endl;
                    break;
                    
                case 8: price = quantity * 853;
                    pers9 += price;
                    outFile9 << " $" << price << endl;
                    break;
                    
                case 9: price = quantity * 471;
                    pers9 += price;
                    outFile9 << " $" << price << endl;
                    break;
                    
                case 10: price = quantity * 933;
                    pers9 += price;
                    outFile9 << " $" << price << endl;
                    break;
                    
                case 11: price = quantity * 721;
                    pers9 += price;
                    outFile9 << " $" << price << endl;
                    break;
                    
                case 12: price = quantity * 663;
                    pers9 += price;
                    outFile9 << " $" << price << endl;
                    break;
                    
                case 13: price = quantity * 507;
                    pers9 += price;
                    outFile9 << " $" << price << endl;
                    break;
                    
                case 14: price = quantity * 259;
                    pers9 += price;
                    outFile9 << " $" << price << endl;
                    break;
            }
                
            case 10: outFile10 << product << " " << quantity;	
                switch (product)
            {
                case 7: price = quantity * 345;
                    pers10 += price;
                    outFile10 << " $" << price << endl;
                    break;
                    
                case 8: price = quantity * 853;
                    pers10 += price;
                    outFile10 << " $" << price << endl;
                    break;
                    
                case 9: price = quantity * 471;
                    pers10 += price;
                    outFile10 << " $" << price << endl;
                    break;
                    
                case 10: price = quantity * 933;
                    pers10 += price;
                    outFile10 << " $" << price << endl;
                    break;
                    
                case 11: price = quantity * 721;
                    pers10 += price;
                    outFile10 << " $" << price << endl;
                    break;
                    
                case 12: price = quantity * 663;
                    pers10 += price;
                    outFile10 << " $" << price << endl;
                    break;
                    
                case 13: price = quantity * 507;
                    pers10 += price;
                    outFile10 << " $" << price << endl;
                    break;
                    
                case 14: price = quantity * 259;
                    pers10 += price;
                    outFile10 << " $" << price << endl;
                    break;
            }
        }
        
    }	
    
    
    cout << "Salesperson 1 total: $" << pers1 << endl;
    cout << "Salesperson 2 total: $" << pers2 << endl;
    cout << "Salesperson 3 total: $" << pers3 << endl;
    cout << "Salesperson 4 total: $" << pers4 << endl;
    cout << "Salesperson 5 total: $" << pers5 << endl;
    cout << "Salesperson 6 total: $" << pers6 << endl;
    cout << "Salesperson 7 total: $" << pers7 << endl;
    cout << "Salesperson 8 total: $" << pers8 << endl;
    cout << "Salesperson 9 total: $" << pers9 << endl;
    cout << "Salesperson 10 total: $" << pers10 << endl;
    
    
    inFile.close(); outFile1.close(); outFile2.close(); outFile3.close(); outFile4.close(); outFile5.close(); outFile6.close(); outFile7.close(); outFile8.close(); outFile9.close(); outFile10.close(); //Close all the files
    
    
    
    
    
    system("pause");
    return 0;
}
