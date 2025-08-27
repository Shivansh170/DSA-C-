#include <bits/stdc++.h>
using namespace std;
int main(){
	string input;
	cout<<"Enter the input:-";
	cin>>input;
	int n1=count(input.begin(),input.end(),'&');
	int n2=count(input.begin(),input.end(),'#');
	int siz=input.size();
	if ((siz%2==0)&&n1>0&&n2>0){
		cout<<"YES";
	}else{
		cout<<"NO";
	}
}
