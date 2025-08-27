//In phone line a violet phone number consists of 5 digits with no leading zeroes.For ex-98765, 10000 and 71023 are valid phone numbers whereas 04123,9231 and 872310 are not.
//Alex went to a store and purchased N items,where the cost of each item is Y.Determine whether the total bill is quivalent to a valid phone number.
#include<bits/stdc++.h>
using namespace std;
int main(){
	int N;
	int Y;
	cout<<"Enter the number of items purchased:-";
	cin>>N;
	cout<<"Enter the price of an item:";
	cin>>Y;
	int price=N*Y;
	if (price<100000&&price>9999){
		cout<<"YES";
	}else{
		cout<<"NO";
	}
}
