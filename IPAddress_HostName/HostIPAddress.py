#WAP to find the hostname and IP address of your machine.

import socket as sc
hostName = sc.gethostname()
ip = sc.gethostbyname(hostName)
print("Host name:",hostName)
print("Ip address:",ip)