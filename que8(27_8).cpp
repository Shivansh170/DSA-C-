//WAP that takes 3 space seperated integers as an input and then calculate the average of the first two and check whetehr the average is greater then the third number
#include <bits/stdc++.h>
using namespace std;
int main(){
	int a,b,c;
	float average;
	cout<<"Enter three numbers";
	cin>>a>>b>>c;
	average=(a+b)/2.0;
	if (average>c){
		cout<<"YES";
	}else{
		cout<<"NO";
	}
}
