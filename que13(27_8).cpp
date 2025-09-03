#include<bits/stdc++.h>
using namespace std;
int main(){
	int n,onumb=0,enumb=0;
	cout<<"Enter the size of the array:-";
	cin>>n;
	int myarr[n];
	cout<<"Enter the elements of the array"<<endl;
	for (int i=0;i<n;i++){
		cin>>myarr[i];
		if (myarr[i]%2==0){
			enumb+=1;
		}else{
			onumb+=1;
		}
	}
	if (enumb>onumb){
		cout<<"Even";
	}else if (enumb<onumb){
		cout<<"Odd";
	}else{
		cout<<"Tie";
	}
}
