#include<stdio.h>
void main()
{
    int rows,columns;

    printf("Enter the size of the row :");
    scanf("%d",&rows);

    printf("Enter the size of the column :");
    scanf("%d",&columns);

    int matrix[1000][1000];
    int transpose[1000][1000];

    //input matrix elements
    printf("\nEnter the elements :\n");
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<columns;j++)
        {
            scanf("%d",&matrix[i][j]);
        }
    }

    //transpose the matrix
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<columns;j++)
        {
            transpose[i][j]=matrix[j][i];
        }
    }

    //print the original matrix
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<columns;j++)
        {
            printf("%d  ",matrix[i][j]);
        }
        printf("\n");
    }

    //print the transposed matrix
    printf("\nAfter transpose :\n");
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<columns;j++)
        {
            printf("%d  ",transpose[i][j]);
        }
        printf("\n");
    }
}