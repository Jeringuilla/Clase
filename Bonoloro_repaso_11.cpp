#include <iostream>
#include "stdio.h"
#include "stdlib.h"
#include "string.h"
#include "math.h"
#include "windows.h"
#include "cstdlib"
#include "vector"
#include "algorithm"
#include "time.h"

using namespace std;

int main(){
	
	int vector[6];
	int aleatorio;
	
	srand(time(NULL));
	
	for(int i=0;i<6;i++)
	{
		vector[i]=rand()%50+1;
	}
	
	for(int i=0;i<6;i++)
	{
		cout << "Vector inicial: " << vector[i] << endl;
	}
	
	cout << "Escribe el numero que quieres elegir para la bonoloto" << endl;
	cin >> aleatorio;
	
	for(int i=0;i<6;i++)
	{
		if(vector[i]==aleatorio)
		{
			cout << "Enhorabuena has ganado" << endl;
		}
	}
	
	return 0;
}
