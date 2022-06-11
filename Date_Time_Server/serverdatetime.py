import socket
from datetime import datetime

s=socket.socket()
print("Socket is generated")
s.bind(("localhost",8080))
s.listen()
print('Waiting for connection')

while True:
    conn,addr = s.accept()
    
    conn.send(bytes(str(datetime.now()),'utf-8'))