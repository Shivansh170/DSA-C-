#include<bits/stdc++.h>
using namespace std;
int main(){
	int n,ele;
	cin>>n;
	vector <int> vec;
	vector<int>first_part;
	vector<int>second_part;
	vector<int>third_part;
	for (int i=0;i<n;i++){
		cin>>ele;
		vec.push_back(ele);
	}
	int max=*max_element(vec.begin(),vec.end());
	int min=*min_element(vec.begin(),vec.end());
	int max_index=find(vec.begin(),vec.end(),max)-vec.begin();
	int min_index=find(vec.begin(),vec.end(),min)-vec.begin();
	if (min_index<max_index){
		for (int i=0;i<min_index;i++){
			first_part.push_back(vec[i]);
		}
		for (int i=min_index;i<max_index;i++){
			second_part.push_back(vec[i]);
		}
		for (int i=max_index;i<vec.size();i++){
			third_part.push_back(vec[i]);
		}
	}
//	else{
//        vector<int>first_part.assign(vec.begin(),max_index);
//		vector<int>second_part.assign(max_index,min_index);
//		vector<int>third_part.assign(min_index,vec.end());
//	}
	for (int i=0;i<second_part.size();i++){
		cout<<second_part[i]<<" ";
	}
	for(int i=0;i<first_part.size();i++){
		cout<<first_part[i]<<" ";
	}
	for(int i=0;i<third_part.size();i++){
		cout<<third_part[i]<<" ";
	}
}
