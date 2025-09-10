#include<bits/stdc++.h>
using namespace std;
int main(){
	int n,m;
	cout<<"Enter the value of n and m: ";
	cin>>n>>m;
	int arr1[n];
	int arr2[m];
	for (int i=0;i<n;i++){
		cin>>arr1[i];
	}
	for (int j=0;j<m;j++){
		cin>>arr2[j];
	}
	int count=0;
	vector<int>vect;
	for (int j=0;j<m;j++){
		for (int i=0;i<n;i++){
			if (arr1[i]>arr2[j]){
				count+=1;
			}
		}
		vect.push_back(count);
		count=0;
	}
	for (int i=0;i<vect.size();i++){
		cout<<vect[i]<<" ";
	}
}
