#include <iostream>
#include "calculateNum.h"
using namespace std;


void calculateNum() {
	months = numYears * 12;
	totalAmount = initialInvest;

	cout << endl << endl;
	cout << "\tBalance and Interest With Additional Monthly Deposits" << endl;
	cout << "==============================================================" << endl;
	cout << "Year\t\tYear End Balance\tYear End Earned Interest" << endl;
	cout << "--------------------------------------------------------------" << endl;

	for (int i = 0; i < numYears; i++) {
		yearInterest = 0;
		for (int j = 0; j < 12; j++) {
			interestAmount = (totalAmount + monthlyDep) * ((annualInterest / 100) / 12);
			yearInterest = yearInterest + interestAmount;
			totalAmount = totalAmount + monthlyDep + interestAmount;
		}
		cout << (i + 1) << "\t\t" << fixed << setprecision(2) << totalAmount << "\t\t\t\t" << yearInterest << endl;
	}

}