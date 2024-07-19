<table><tr><td> <em>Assignment: </em> It114 Milestone1</td></tr>
<tr><td> <em>Student: </em> Brian Maina(bmm49)</td></tr>
<tr><td> <em>Generated: </em> 6/26/2022 7:50:15 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-milestone1/grade/bmm49" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch called Milestone1</li><li>At the root of your repository create a folder called Project</li><li>Create a milestone1.md file inside the project folder</li><li>Git add/commit/push it to Github</li><li>Create a pull request from Milestone1 to main (don't complete/merge it yet)</li><li>Copy in the latest Socket sample code from the most recent Socket Part example</li><ol><li>Recommended Part 5, but Part 4 should be sufficient</li></ol><li>Git add/commit the baseline</li><li>Ensure the sample is working and fill in the below deliverables</li><li>Get the markdown content or the file and paste it into the milestone1.md file or replace the file with the downloaded version</li><li>Git add/commit/push all changes</li><li>Complete the pull request merge from step 5</li><li>Locally checkout main</li><li>git pull origin main</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Startup </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot showing your server being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/175829053-3bad52a9-7535-48fc-afcc-4d90bec10599.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>The Server(right) is listening to it port. <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot showing your client being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/175829053-3bad52a9-7535-48fc-afcc-4d90bec10599.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Client1(left) is listening to the port and has successfully connected to the server<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the connection process</td></tr>
<tr><td> <em>Response:</em> <p><span id="docs-internal-guid-8b8ab974-7fff-562f-7a13-1894f8cc801b"><p dir="ltr" style="line-height:1.38;margin-top:0pt;margin-bottom:0pt;"><span style="font-size: 14pt; font-family: Arial; background-color: transparent; font-variant-numeric: normal; font-variant-east-asian:<br>normal; vertical-align: baseline; white-space: pre-wrap;">Servers and Clients communicate using Sockets. A Socket represents<br>the Client and a ServerSocket represents the Server. The Socket connects to the<br>IP address and a port. The Sever Socket listens to the port and<br>uses the blocking accept method to accept an incoming request. The Socket attempts<br>to request a connection to the open Server Socket. Once the ServerSocket accepts<br>the request, the connection between the Server and Client has been made</span></p><div><span style="font-size:<br>14pt; font-family: Arial; background-color: transparent; font-variant-numeric: normal; font-variant-east-asian: normal; vertical-align: baseline; white-space: pre-wrap;"><br></span></div></span><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Sending/Receiving </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist on the right</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/175829053-3bad52a9-7535-48fc-afcc-4d90bec10599.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Client1(left), Client2(middle), Servrer(right)<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the messages are sent, broadcasted, and received</td></tr>
<tr><td> <em>Response:</em> <div><span><span style="font-size: 12pt; font-family: &quot;Times New Roman&quot;; color: rgb(36, 41, 47); font-variant-numeric: normal;<br>font-variant-east-asian: normal; vertical-align: baseline; white-space: pre-wrap;">Once the Server</span></span></div><span id="docs-internal-guid-1980c5ec-7fff-df5b-a4aa-0b619b88e638"><span style="font-size: 12pt; font-family: &quot;Times<br>New Roman&quot;; color: rgb(36, 41, 47); font-variant-numeric: normal; font-variant-east-asian: normal; vertical-align: baseline; white-space:<br>pre-wrap;"><div><span><span style="font-size: 12pt; font-family: &quot;Times New Roman&quot;; color: rgb(36, 41, 47); font-variant-numeric: normal;<br>font-variant-east-asian: normal; vertical-align: baseline; white-space: pre-wrap;"><br></span></span></div>The Client uses the writeObject method from the<br>ObjectOutputStream to send a message from the client to the server The Server<br>uses the broadcast method to send the message to all Clients connected to<br>the server.  Once the Client is connected to the Sever, a SeverThread<br>is created for the Client. The Client will send messages to its Sever<br>thread. </span></span><font color="#24292f" face="Times New Roman"><span style="font-size: 12pt; white-space: pre-wrap;">The </span><span style="font-size: 16px;<br>white-space: pre-wrap;">sever thread</span><span style="font-size: 12pt; white-space: pre-wrap;"> allows multiple clients to send messages<br>to the server. The room allows for the creation of multiple channels. For<br>example, three clients are all connected to the same server. The SendMessage method<br>allows the two clients that joined a room to message each other. If<br>there are no clients in the room(everyone client is in the lobby), the<br>server will broadcast all messages to all clients like before. </span></font><div><br></div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Disconnecting / Terminating </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist on the right</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/175829959-6de0123a-2544-42f9-996f-9c88bc3bf1da.png)"/></td></tr>
<tr><td> <em>Caption:</em> <p>Before Client is disconnected<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/175829986-271a95b3-ad75-485b-8aa0-cde6bfb55fb2.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>After Client is disconnected<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/175830092-ea054561-9d2d-4483-99fe-ebf6467e7981.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Before Server is disconnected<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/175830152-e5475dcf-c627-4dc3-8e16-d60c9430c0ec.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>After Sever is disconnected<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the various disconnects/terminations are handled</td></tr>
<tr><td> <em>Response:</em> <p>The Server uses the IO Exception to prevent the entire program from crashing<br>after the server is disconnected. The Client uses a generic Exception to prevent<br>the program from crashing after the client is disconnected. The Client gets disconnected<br>when the user types quit. The isRunning boolean goes from true to false,<br>disconnecting the Client.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add the pull request for this branch</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/Crash105/IT114-50/pull/3">https://github.com/Crash105/IT114-50/pull/3</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-milestone1/grade/bmm49" target="_blank">Grading</a></td></tr></table>