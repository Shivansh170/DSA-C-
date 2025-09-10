#include<bits/stdc++.h>
using namespace std;
int main(){
	int n,ele;
	vector <int> myArr;
	cin>>n;
	for (int i=0;i<n;i++){
		cin>>ele;
		myArr.push_back(ele);
	}
	int freq=count(myArr.begin(),myArr.end(),1);
	int element=myArr[freq];
	myArr.erase(myArr.begin()+freq);
	for (int i=0;i<myArr.size();i++){
		cout<<myArr[i]<<" ";
	}	
}
