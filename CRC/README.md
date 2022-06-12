# Algorithm:
## Client:
Step 1: A message is taken as input from the User in Binary Form. <br>
Step 2: For a n length parity checker (n-1) number of zeroes are appended in the end of the Input and sent in the checksum() function to find out the crc. <br>
Step 3: The crc is appended with the User input and sent to the Server. <br>
## Server:
Step 4: The received data is sent to the checksum() function to calculate the crc. <br>
Step 5: If the crc is zero then send “No Error” as acknowledgement to the client else send “Error”. <br>
## Algorithm for checksum()
Step 1: Store the data in an m sized integer array(a[]) where m=size of the string received by checksum() <br>
Step 2: for a parity of 1011 do the following steps for m-n times <br>
Step 3: a[i]=0 if a[i]==1 else a[i]=1 <br>
Step 4: a[i+1]=1 if a[i+1]==1 else a[i+1]=0 <br>
Step 5: a[i+2]=1 if a[i+2]==0 else a[i+2]=1 <br>
Step 6: a[i+3]=1 if a[i+3]==0 else a[i+3]=1 <br>
Step 7: Go back to Step 2 <br>
Step 8: Return last (n-1) value of the array in concatenated string form