//Given N integers.Find the sum of the first half and check whether it is greater from the sum of the second half
//It is guranted that N will be even.
#include<bits/stdc++.h>
using namespace std;
int main(){
	int n,fsum=0,lsum=0;
	cout<<"Enter the size of the array:-";
	cin>>n;
	int myarr[n];
	cout<<"Enter the elements of the array"<<endl;
	for (int i=0;i<n;i++){
		cin>>myarr[i];
	}
	int mid=n/2;
	for (int i=0;i<mid;i++){
		fsum+=myarr[i];
	}
	for (int i=mid;i<n;i++){
		lsum+=myarr[i];
	}
	if (lsum>fsum){
		cout<<"Last sum is greater than the first sum";
	}else if (fsum>lsum){
		cout<<"First sum is greater than the second sum";
	}else{
		cout<<"Chutiye sum barabar hai!";
	}
}
