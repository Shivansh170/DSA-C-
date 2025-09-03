#include<bits/stdc++.h>
using namespace std;
int main(){
	int n,onumb=0,enumb=0;
	cout<<"Enter the size of the array:-";
	cin>>n;
	if (n<3 || n%2==0){
		cout<<"Invalid Size";
		return -1;
	}
	int myarr[n];
	cout<<"Enter the elements of the array"<<endl;
	for (int i=0;i<n;i++){
		cin>>myarr[i];
	}
	int mid=n/2;
	cout<<"The product is "<<myarr[0]*myarr[mid]*myarr[n-1];
}
