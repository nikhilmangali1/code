def cube_list(numbers):
    result_list=[]
    for number in numbers:
        cubed=number**3
        result_list.append(cubed)
    return result_list
numbers=list(range(1,11))
result=cube_list(numbers)
print(result)