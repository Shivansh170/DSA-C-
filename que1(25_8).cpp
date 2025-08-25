//WAP to read your name and concatenate with 'a student'
#include <bits/stdc++.h>
using namespace std;
int main(){
	string myname;
	cout<<"Enter your name:"<<endl;
	getline(cin,myname);
	string result=myname+" "+"a student.";
	cout<<"The result is "<<result<<endl;
}
