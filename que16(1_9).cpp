#include<bits/stdc++.h>
using namespace std;
int main(){
	int m,n;
	float avg;
	cout<<"Enter the number of groups ";
	cin>>n;
	int max[n],min[n],total[n];
	float average[n];
	for (int i=0;i<n;i++){
		cout<<"Enter the size of the "<<i+1<<" group";
		cin>>m;
		int arr[m];
		for (int j=0;j<m;j++){
			cin>>arr[j];
		}
		max[i]=*max_element(arr,arr+m);
		min[i]=*min_element(arr,arr+m);
		total[i]=accumulate(arr,arr+m,0);
		avg=(float)total[i]/m;
		average[i]=avg;
	}
	for (int i=0;i<n;i++){
		cout<<max[i]<<" "<<min[i]<<" "<<total[i]<<" "<<fixed<<setprecision(1)<<average[i]<<endl;
	}
}
