import socket
s=socket.socket()
s.connect(('localhost',8080))


print(s.recv().decode('utf-8'))