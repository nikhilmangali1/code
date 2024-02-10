#include<stdio.h>
#include<stdlib.h>
struct array
{
    int *ap;
    int size;
    int length;
};
void display(struct array );
int main()
{
    struct array a;
    int i,n;
    printf("\nENter the size of the array:");
    scanf("%d",&a.size);
    a.ap=(int*)malloc(a.size*sizeof(int));
    a.length=0;
    printf("\nEnter no.of elements of array you want to enter:");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("\nEnter %d th element:",i+1);
        scanf("%d",&a.ap[i]);
    }
    a.length=n;
    display(a);
    return 0;
}
void display(struct array ab)
{
    printf("\nPrinting....\n");
    for(int i=0;i<ab.length;i++)
    {
        printf("%d\t",ab.ap[i]);
    }
}