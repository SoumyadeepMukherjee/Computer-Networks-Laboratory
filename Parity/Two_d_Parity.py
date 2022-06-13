def one_d_parity(s):
    binary_str=bin(ord(s))[2:]
    binary_str="0"*(8-len(binary_str))+binary_str+str(binary_str.count('1')%2)
    return binary_str


s=input("Enter a String:")
arr = []
for i in s:
    arr.append(one_d_parity(i))
    
print(arr)

last_parity=''

for i in range(9):
    temp=''
    for val in arr:
        temp+=val[i]
    last_parity+=str(temp.count('1')%2)
arr.append(last_parity)

print("Coded data:")
for i in arr:
    print(i)

