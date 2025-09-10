#include<bits/stdc++.h>
using namespace std;
int main(){
	int n,ele,flag;
	vector<int>vect;
	cin>>n;
	for (int i=0;i<n;i++){
		cin>>ele;
		vect.push_back(ele);
	}
	for(int i=0;i<n;i++){
		flag=0;
		for (int j=i+1;j<n;j++){
			if(vect[j]>vect[i]){
				cout<<vect[j]<<" ";
				flag=1;
				break;
			}
		}
		if (flag==0){
			cout<<0<<" ";
		}
	}
}
