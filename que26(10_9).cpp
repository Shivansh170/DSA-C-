#include<bits/stdc++.h>
using namespace std;
int main(){
	int n,ele;
	vector<int>vect;
	cin>>n;
	int max_profit=INT_MIN;
	for (int i=0;i<n;i++){
		cin>>ele;
		vect.push_back(ele);
	}
	for (int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			max_profit=max(max_profit,(vect[j]-vect[i]));
		}
	}
	cout<<max_profit;
}
