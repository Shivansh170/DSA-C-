#include<bits/stdc++.h>
using namespace std;
int main(){
	int n,ele,sum;
	vector<int>arr;
	cin>>n;
	int max_sum=INT_MIN;
	for(int i=0;i<n;i++){
		cin>>ele;
		arr.push_back(ele);
	}
	for (int i=0;i<n;i++){
		sum=0;
		for (int j=i;j<n;j++){
			sum+=arr[j];
			max_sum=max(max_sum,sum);
		}
	}
	cout<<max_sum;
}
