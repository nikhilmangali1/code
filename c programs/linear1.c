#include<stdio.h>
//Function to perform linear search
int linearSearch(int arr[],int n,int target)
{
for(int i=0;i<n;i++)
{
//compare the current element with the target
if(arr[i]==target)
{
return i;    //Return the index where target is found 
}
}
return -1;    //Return -1 if the target is not found in the array
}

int main()
{
int arr[]={1,19,902,11,5,0};    //declaration  and initialization of the array
int n=sizeof(arr)/sizeof(arr[0]);
int target=11;

//call linearSearch function
int result=linearSearch(arr,n,target);

if(result!=-1)
{
printf("Element %d found at index %d.\n",target,result);
}
else
{
printf("Element %d not found in the array.\n",target);
}
return 0;
}