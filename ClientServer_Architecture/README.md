### Flow of Client Server Architecture :

* Run the server first.
* The socket is imported and generated in the server.
* Bind the socket to the localhost and listen to the port 8080 waiting for the connection.
* Run the client next.
* The socket is connected to the localhost.
* Take the necessary inputs and send it to the socket.
* The sent inputs are received,decoded and the required operation is performed and finally sent via the connection in the form of bytes.
* The client waits for the acknowledgement from the server and finally prints the received data.
