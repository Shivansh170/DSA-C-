#include<bits/stdc++.h>
using namespace std;
int main(){
	int n,k,ele;
	vector<int>vect;
	cin>>n>>k;
	for(int i=0;i<n;i++){
		cin>>ele;
		vect.push_back(ele);
	}
	for (int i=0;i<n;i++){
		for (int j=i;j<n;j++){
			if (i!=j){
				if (vect[i]+vect[j]==k){
					cout<<vect[i]<<" "<<vect[j]<<endl;
				}
			}
		}
	}
}
