//WAP to read name age and roll no from threee different lines and print it  into a single line with single space
#include <bits/stdc++.h>
using namespace std;
int main(){
	string name;
	int age;
	string rollno;
	cout<<"Enter your name";
	getline(cin,name);
	cout<<"Enter your age";
	cin>>age;
	cout<<"Enter your roll no";
	cin>>rollno;
	cout<<"The details are as follows:"<<endl;
	cout<<"Name: "<<name<<endl<<"Age: "<<age<<endl<<"Roll no: "<<rollno;
}
