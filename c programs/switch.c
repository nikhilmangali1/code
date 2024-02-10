//to know given alphabet is whether vowel or not
#include<stdio.h>
#include<conio.h>
void main()
{
    char c;
    printf("Enter any alphabet:");
    scanf("%c",&c);
    switch (c)
    {
    case 'a':/* constant-expression */
        printf("%c is vowel",c);
        break;
    case 'e':
        printf("%c is vowel",c);
        break;
    case 'i':/* constant-expression */
        printf("%c is vowel",c);
        break;
    case 'o':
        printf("%c is vowel",c);
        break;
    case 'u':/* constant-expression */
        printf("%c is vowel",c);
        break;
    case 'A':
        printf("%c is vowel",c);
        break;
    case 'E':/* constant-expression */
        printf("%c is vowel",c);
        break;
    case 'I':
        printf("%c is vowel",c);
        break;
    case 'O':/* constant-expression */
        printf("%c is vowel",c);
        break;
    case 'U':
        printf("%c is vowel",c);
        break;
    default:
    printf("vowel ni enter chey ra !");
    }
}