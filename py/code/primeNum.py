# Write a program to check an input number prime or not
num = int(input("Enter the value: "))
flag = int()
flag = 0
for i in range (2,num-1):
    if(num%i == 0):
        flag = 1
        break
if(flag == 1):
    print(num, 'is not a prime number')
else:
    print(num, 'is a prime number')