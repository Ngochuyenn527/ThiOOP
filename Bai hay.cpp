#include<iostream>

using namespace std;

void nhap( int *&a,int &n){
	cout<<"Nhap n= "; cin>>n;
	a=new int [n];
	for(int i=0; i<n; i++){
		cout<<"a["<<i<<"]= ";
		cin>>a[i];
	}
}

void lay(int *a, int n){
	int tong=0;
	for(int i=0; i<n; i++){
		tong+=a[i];
	}
	float K=(float)tong/n;
	
	//sapxep tang dan
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
	
	
	//Lay nhieu ptu nhat <=> lay nhieu ptu be nhat <=> de tong cua chung <2*K
	int sum=0, dem=0;
	for(int i=0; i<n; i++){
		dem++;
		sum+=a[i];
		if( sum<2*K && sum + a[i+1] >2*K ){
			break;
		}
	}
	
	cout<<"\nLay duoc nhieu nhat "<<dem<<" ptu tu mang A de tong cua chung la: "<<sum<<" <2*K= "<<2*K;	
	
	
	//Lay it ptu nhat <=> lay it ptu lon <=> de tong cua chung >2*K
	
	int sum2=0, dem2=0;
	for(int i=n-1; i>=0; i++){
		dem2++;
		sum2+=a[i];
		if(sum2 > 2*K && sum2 - a[i] < 2*K ) break;
	}
	cout<<"\nLay duoc it nhat "<<dem2<<" ptu tu mang A de tong cua chung la: "<<sum2<<" <2*K= "<<2*K;
}

void tim(int *a, int n){
	int min=a[0];
	for(int i=0; i<n; i++){
		if(a[i]<min) min=a[i];
	}
	cout<<"\nSo nho nhat trong day la: "<<min<<endl;
	
	int dem=0;
	for(int i=0; i<n; i++){
		if(a[i]==min) dem++;
	}
	cout<<"Co "<<dem<<" so nho nhat trong day"<<"\n";
}


//sx so le len dau, chan cuoi, sx tang dan cho so le, giam dan cho so chan
void show(int *a, int n){
	int *b=new int[n];

//le dau
	int y=0, z=n-1;
	for(int i=0; i<n; i++){
		if(a[i]%2 !=0){
			b[y]=a[i];
			y++;
		}
	}

//chan cuoi	
	for(int i=0; i<n; i++){
		if(a[i]%2 ==0){
			b[z]=a[i];
			z--;
		}
	}
	
//sx le tang dan
	for(int i=0; i<y; i++){
		for(int j=i+1; j<y; j++){
			if(b[i]>b[j]){
				int temp = b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
	}
	
	for(int i=z; i>=y; i--){
		for(int j=i-1; j>=y; j--){
			if(b[i]>b[j]){
				int tamp = b[i];
				b[i]=b[j];
				b[j]=tamp;
			}
		}
	}
	
	for(int i=0; i<n; i++){
		cout<<b[i]<<" ";
	}
	
}

void nhapvaxoa(int *&a, int n){
	int y;
	cout<<"\nNhap y= "; cin>>y;
	for(int i=0; i<n; i++){
		while(a[i]==y){
			n--;
			for(int j=i; j<n; j++){
				a[j]=a[j+1];
			}
		}
	}
	cout<<"Mang bd sau khi xoa y la: ";
	for(int i=0; i<n; i++){
		cout<<a[i]<<" ";
	}
}

// Nhap 1 so ngau nhien, xep no sau so dau tien lon hon no
void nhapvachen(int *&a, int n){
	int x;
	cout<<"\nNhap x= "; cin>>x;
	
	int dem=0;
	for(int i=0;i<n;i++){
		if(a[i]>x){
			dem++;
		}
	}
	
	if(dem != 0){
		for(int i=0; i<n; i++){
		if(a[i]>x){
			for(int j=n-1; j>=i+1; j--){
				a[j+1]=a[j];
			}
			a[i+1]=x;
			n++; //tang len 1 o nho
			cout<<"Mang bd sau khi chen x la:";
	    for(int i=0; i<n; i++){
		    cout<<a[i]<<" ";
	}
	break;
    }
	}}
	else cout<<"thong bao!";
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
	
	lay(a,n);
	tim(a,n);
	show(a,n);
	nhapvaxoa(c,n);
	nhapvachen(d,n);
	delete[]a;
	delete[]c;
	delete[]d;
	return 0;
}
