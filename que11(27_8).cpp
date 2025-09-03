//Given N integers.Find the sum of the first 2 elements and last 2 elements in separate lines.You can assume that N>=4
#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cout<<"Enter the size of the array:-";
	cin>>n;
	if (n<4){
		cout<<"The size of the array must be greater then 4";
		return -1;
	}
	int myarr[n];
	cout<<"Enter the elements of the array"<<endl;
	for (int i=0;i<n;i++){
		cin>>myarr[i];
	}
	cout<<"The sum of the first two elements is "<<myarr[0]+myarr[1]<<endl;
	cout<<"The sum of the last two elements is "<<myarr[n-2]+myarr[n-1];
}
