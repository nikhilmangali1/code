def odd_characters(myString):
    for index in range(len(myString)):
        if index % 2 != 0:
            print(myString[index])
myString =input("Enter a string: ")
odd_characters(myString)