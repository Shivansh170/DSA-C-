#include<bits/stdc++.h>
using namespace std;
int main(){
	int n,res1=0,res2=0;
	cout<<"Enter the number of students";
	cin>>n;
	int marks[n];
	string status[n];
	cout<<"Start entering the marks and status of the students one by one";
	for(int i=0;i<n;i++){
		cin>>status[i]>>marks[i];
	}
	for (int i=0;i<n;i++){
		if (status[i]=="pass"&&marks[i]>75){
			res1+=1;
		}else if (status[i]=="fail"&&marks[i]<50){
			res2+=1;
		}
	}
	cout<<res1<<" "<<res2;
}
