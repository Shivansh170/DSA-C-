#include <bits/stdc++.h>
using namespace std;
int main(){
	int n,size;
	string type;
	cout<<"Enter the number of groups";
	cin>>n;
	int result[n];
	for (int i=0;i<n;i++){
		cout<<"Enter the size and type of the group";
		cin>>size>>type;
		if (type=="STRING"){
			string arr[size];
			for (int j=0;j<size;j++){
				cin>>arr[j];
			}
			int size_string[size];
			for (int j=0;j<size;j++){
				size_string[j]=arr[j].size();
			}
			result[i]=*max_element(size_string,size_string+size);
		}else if (type=="INT"){
			int arr[size];
			for (int j=0;j<size;j++){
				cin>>arr[j];
			}
			result[i]=accumulate(arr,arr+size,0);
		}
	}
	cout<<"The result is as follows "<<endl;
	for (int i=0;i<n;i++){
		cout<<result[i]<<endl;
	}
}
