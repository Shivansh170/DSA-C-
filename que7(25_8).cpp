//WAP to read three input values,calculata it sum and divide it by 3.5
#include<bits/stdc++.h>
using namespace std;
int main(){
	float a,b,c,sum;
	cout<<"Enter three floating point numbers";
	cin>>a>>b>>c;
	sum=a+b+c;
	cout<<"The result is as follows: "<<fixed<<setprecision(2)<<sum/3.5;
}
