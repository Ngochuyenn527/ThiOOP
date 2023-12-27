#include <iostream>
#include<fstream>

using namespace std;

void nhap(int *&a, int &n){
	a=new int [n];
	fstream f;
	f.open("ca1.txt",ios::in);
	f>>n;
	for(int i=0; i<n; i++){
		f>>a[i];
		cout<<a[i]<<" ";
	}
	cout<<endl;
	f.close();
}
void sapxep(int *a, int n){
	for(int i=0; i<n; i++){
		for(int j=i+1; j<n; j++){
			if(a[i]>a[j]){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0; i<n; i++){
		cout<<a[i]<<" ";
	}
	cout<<endl;
}

void ktra(int *a, int n){
	int dem=0;
	for(int i=0; i<n; i++){
		if(a[i]%2==0 && a[i]<100) dem++;
	}
	if(dem==n){
		cout<<"hop le"<<endl;
	}
	else cout<<"0 hop le"<<endl;

	ofstream f4;
	f4.open("ca1.txt",ios::app);
	if(dem==n){
		f4<<"true"<<endl;
	}
	else f4<<"false"<<endl;
	f4.close();
	
}
void soluong(int *a, int n){
	int dem=0,sum;
	for(int i=0; i<n; i++){
		while(a[i] != 0){
			sum=a[i]%10;
			dem++;
		    a[i]/=10; // chia den khi nao all a[i]==0 thi stop
	    }
	}
	cout<<"Tong sl cac chu so trong mang bd la: "<<dem<<endl;
}

void show(int *&a, int n){
	int dem=0;
	for(int i=0; i<n; i++){
		while(a[i] !=0 ){
			if(a[i]%10==2){
				dem++;
			}
			a[i]/=10; // chia den khi nao all a[i]==0 thi stop
		}
	}
	cout<<"\nSo chu so 2 xh trong mang la: "<<dem<<endl;
}
void chen(int *a, int &n){
	int *b=new int [n+1];
	b[0]=2022;
	for(int i=1; i<n+1; i++){
		b[i]=a[i-1];
	}
	for(int i=0; i<n+1; i++){
		cout<<b[i]<<" ";
	}
	cout<<endl;
	ofstream f2;
	f2.open("ca1.txt",ios::app);
	for(int i=0; i<n+1; i++){
		f2<<b[i]<<" ";
	}
	f2<<endl;
	f2.close();
	
	int dem=0,sum;
	for(int i=0; i<n+1; i++){
		while(b[i] != 0){
			sum=b[i]%10;
			dem++;
		    b[i]/=10;
	    }
	}
	ofstream f3("ca1.txt", ios::app);
	f3<<"Tong sl cac chu so trong mang luc sau la: "<<dem<<endl;
	f3.close();
}
int main(){
	int *a, n;
	nhap(a,n);
	
	int *c=new int[n];
	for(int i=0; i<n; i++){
		c[i]=a[i];
	}
	
	int *d=new int[n];
	for(int i=0; i<n; i++){
		d[i]=a[i];
	} 
	
	
	sapxep(a,n);
	
	soluong(c,n); // sau khi thuc hien all a[i]=0 nen can gan *c=*a bd
	//ham soluong se chi lam thay doi *c
	
    chen(a,n);
    ktra(a,n);
    show(d,n);
	
	delete[]a;
	delete[]c;
	return 0;
	
}


