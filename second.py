n = int(input())
flag =1
sum =0
while(1):
    if(n==1):
        print(True)
        break
    else:
        temp = n%10
        quo = int(n//10)
        n = temp**2 + quo**2

