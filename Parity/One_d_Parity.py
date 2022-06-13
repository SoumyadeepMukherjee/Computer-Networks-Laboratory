def one_d_parity(s):
    binary_str=bin(ord(s))[2:]
    binary_str="0"*(8-len(binary_str))+binary_str+str(binary_str.count('1')%2)
    return binary_str
    

s=input("Enter a String:")
print(one_d_parity(s))