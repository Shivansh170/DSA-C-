//Give an array oF N integers and a possitive integer K. Swap every K element witht he next K elements.
//N is a multiple of 2K.
#include <bits/stdc++.h>
using namespace std;
int main(){
	int n,k;
	cin>>n>>k;
	int arr[n];
	for (int i=0;i<n;i++){
		cin>>arr[i];
	}
	for (int i=k;i<n;i+=2*k){
		for (int j=0;j<k;j++){
			int temp=arr[i+j];
			arr[i+j]=arr[i+j-k];
			arr[i+j-k]=temp;
		}
	}
	for (int i=0;i<n;i++){
		cout<<arr[i]<<" ";
	}
}
