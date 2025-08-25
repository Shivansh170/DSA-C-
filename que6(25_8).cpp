//WAP to read four integers and calculate the sum of first two integers and subtract this sum from last two integers
#include<bits/stdc++.h>
using namespace std;
int main(){
	int a,b,c,d,sum;
	cout<<"Enter four integers ";
	cin>>a>>b>>c>>d;
	sum=a+b;
	cout<<"The required results are as follows: "<<endl<<sum-c<<endl;
	cout<<sum-d;
}
