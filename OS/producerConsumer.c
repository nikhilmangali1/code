#include<stdio.h>
#include<stdlib.h>
void produce();
void consume();
int wait(int);
int signal(int);
int mutex=1,full=0,empty=5,x=0;
int main()
{
    int choice;
    while(1)
    {
        printf("\n\n1.Produce\n2.Consume\n3.Exit");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
            {
                if((mutex==1)&&(empty!=0))
                {
                    produce();
                }
                else
                {
                    printf("Buffer is full");
                }
                break;
            }
            case 2:
            {
                if((mutex==1)&&full!=0)
                {
                    consume();
                }
                else
                {
                    printf("Buffer is empty!!");
                }
                break;
            }
            case 3:
            {
                exit(0);
                break;
            }
            default:
            {
                printf("Enter correct choice!!");
                break;
            }
        }
    }
    return 0;
}
void produce()
{
    mutex=wait(mutex);
    full=signal(full);
    empty=wait(empty);
    x++;
    printf("\nProducer Produces %d",x);
    mutex=signal(mutex);
}
void consume()
{
    mutex=wait(mutex);
    full=wait(full);
    empty=signal(empty);
    printf("\nConsumer Consumed %d",x);
    x--;
    mutex=signal(mutex);
}
int wait(int s)
{
    return (--s);
}
int signal(int s)
{
    return (++s);
}