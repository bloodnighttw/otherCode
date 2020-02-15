#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	
	char a [80];
	scanf("%s",&a);
	
	
	int size;
	
	int is;
	
	for(is=0;is<80;is++){
		
		if(a[is]=='\0'){
			break;
		}	else{
		size++;
		}
	}

	
	int i,flag;
	flag=1;
	
	for(i=0;i<=size/2;i++){
		
		
		if(a[i]!=a[size-i-1]){
			
			printf("NO\n");
			flag=0;
			break;
			
		}
	}
	
	if(flag==1)
		printf("YES\n")	;
	
	
	return 0;
}
