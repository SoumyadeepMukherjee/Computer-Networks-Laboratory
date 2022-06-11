#WAP to find the remote IP address of your machine.

import socket as sc
hostRemote = "google.com";
ipRemote = sc.gethostbyname(hostRemote)
print("Remote IP address:",ipRemote)