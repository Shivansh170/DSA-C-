#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
//	cout<<"Enter the number of students";
	cin>>n;
	int arr[n];
//	cout<<"Start entering the marks of the students";
	for (int i=0;i<n;i++){
		cin>>arr[i];
	}
	sort(arr,arr+n,greater<int>());//sorting in place hui hai,isliye arr mein hi values sort ho gyi
	int sum=accumulate(arr,arr+5,0);
	cout<<sum<<endl;
	sort(arr,arr+n);
	for (int i=4;i>=0;i--){
		cout<<arr[i]<<" ";
	}
}
