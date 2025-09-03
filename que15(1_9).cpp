//You are given marks of N groups of students.Print the maximum marks of each group.
#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cout<<"Enter the size of each group";
	cin>>n;
	int arr[n];
	int max[n];
	for(int j=0;j<n;j++){
	for (int i=0;i<n;i++){
		cin>>arr[i];
	}
	max[j]=*max_element(arr,arr+n);
	}
	cout<<"The maximum of each group is as follows ";
	for (int i=0;i<n;i++){
		cout<<max[i]<<" ";
	}
}
