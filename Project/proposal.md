<header>Brian Maina, IT114-50, Project:Chatroom </header>
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

<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone 2</td></tr>
<tr><td> <em>Student: </em> Brian Maina(bmm49)</td></tr>
<tr><td> <em>Generated: </em> 7/17/2022 12:13:57 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-chatroom-milestone-2/grade/bmm49" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone2 from the proposal document:&nbsp; <a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Server will have the functionality to switch users between “Rooms” </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Screenshots of lobby</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/179381616-ced65f7c-e9af-4b3a-8e16-ef63ee4aa14f.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Right(Server) shows that two clients are in the server<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Screenshots of different room</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/179381907-fce1a9b0-b6c3-41b2-9ad8-c5e84478e9dc.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Server(Right) shows that Client 2(Middle) has joined a room called Test1. Client 2<br>sends message three messages that Client1(Left) does not receive. These include &quot;hi&quot;, &quot;hello&quot;,<br>and &quot;Good Morning&quot;<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Payload </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Payload Screenshots</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/179381957-5ba52bcc-da9a-41e6-b19b-125444584108.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>First part of Payload.java code<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/179381961-ee4b18e6-c44d-4442-a49d-6169c7aa9f0d.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Second part of Payload.java code<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/179381965-f7bff917-24c4-45e6-a322-fe0625f6d2e0.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Third part of Payload.java code<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/179381907-fce1a9b0-b6c3-41b2-9ad8-c5e84478e9dc.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Client1(Left) shows the content of the payload<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Server-side commands </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the mentioned commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/179382076-fbe9e780-51b8-44f2-9713-0bf822a26dc3.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows the code for /roll<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/179382044-a0976e1f-b12d-43d2-abf6-8ecff7929665.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows the code for /flip<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Explain the logic/implementation of each commands</td></tr>
<tr><td> <em>Response:</em> <p>For the&nbsp; /roll code, I use a Random object to generate a number<br>between 0 and 20. Once the user types /roll, a number generates and<br>it sent to all users in the room<div>For the /flip code, I also<br>use a Random object to generate a number between 0 and 1, 0<br>being Heads, and 1 being Tails. Once the user types /flip, a number<br>generates, and the number is used to determine if the coin is a<br>Heads or Tails. This message of whether the coin is Heads or Tails<br>is sent to all users in the room</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Text Display </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the various style handling</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/179405315-bc8c5ccc-9660-4aa1-bf8c-435c932c991a.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows how bold and all of its combinations are processed<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/179405362-3d79eb28-5472-4902-b34b-b7e357552df5.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Show how italics and all of its combinations are processed<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/179405432-7e35118d-a454-4de7-92b5-c7886b41a8d6.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows how bold and all of its combinations are processed<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/179405453-13b47064-af7d-4ec3-a62b-d95105d4f180.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows how underline and all of its combinations are processed<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show source message and the result output in the terminal (note, you won't actually see the styles until Milestone3)</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/179409538-a486095c-024b-41e4-b0c4-e79ce5aae718.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Client1(Left) shows how bold, italics, color, and underline are processed<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/179410750-46c33c5a-17f8-432a-bbd1-d87317ba9b0a.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Client1(Left) shows combinations of bold and italics, italics and color, and bold and<br>underline<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Explain how you got each style applied</td></tr>
<tr><td> <em>Response:</em> <p>I used an if statement where if the first two characters and last<br>two characters of the user input had&nbsp;<div>&quot;*&quot; the server would print the word<br>with the bold HTML tags<br></div><div>I used an if statement where if the first<br>two characters and last two characters of the user input had&nbsp;<div>&quot;%&quot; the server<br>would print the word with the italics HTML tags</div></div><div>I used an if statement<br>where if the first two characters and last two characters of the user<br>input had&nbsp;<div>&quot;&amp;&quot; the server would print the word with the color HTML tags</div></div><div>I<br>used an if statement where if the first two characters and last two<br>characters of the user input had&nbsp;<div>&quot;@&quot; the server would print the word with<br>the underline HTML tags</div></div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 5: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Include the pull request for Milestone2 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/Crash105/IT114-50/pull/4">https://github.com/Crash105/IT114-50/pull/4</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-chatroom-milestone-2/grade/bmm49" target="_blank">Grading</a></td></tr></table>

<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone3</td></tr>
<tr><td> <em>Student: </em> Brian Maina(bmm49)</td></tr>
<tr><td> <em>Generated: </em> 8/3/2022 10:23:09 AM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-chatroom-milestone3/grade/bmm49" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Connection Screens </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the screens with the following data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/182621262-4136fac4-0c9d-4af2-93a7-f2ab3a1b340b.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows the Host and Username Panel<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/182621975-be7ed465-8004-420b-8051-315d1ab90b69.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows the Username(UserInputPanel)<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the code for each step of the process</td></tr>
<tr><td> <em>Response:</em> <p>The Host and Port Panel(Connectional Panel), are created by extending the JPanel class.<br>The Host and Port numbers were added to the JPanel through the use<br>of &quot;contain&quot; object. The contain object allows you to configure your JPanel to<br>the way that best suits your needs.<div><br></div><div><br></div><div>The UserInputPanel uses an editable text field<br>that allows the user type a username into the chat. The username will<br>then respond with a Username must be provided if the user sent nothing.<br>If their are no errors, the username is created</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Chatroom view </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/182622372-ad607df6-08f7-411c-831e-7efa3f5f656b.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows a list of users <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/182624875-44980ddf-ac61-4cea-b3b9-6322620fc64a.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows chat history<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/182622773-3c525507-a0ba-4ee8-b12b-62bd7ec1665d.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows snippet of code that lets the enter key send the message<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Chat Activities </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show screenshots of the result of the following commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/182623362-1d6da2b5-7f13-4109-adf5-50096c9b6f10.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows the /flip and /roll work and the output has different text format.<br><br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the code snippets for each command</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/182625302-d00e0c12-1efe-4d87-b624-52bf9637ab90.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows server side code of /flip and /roll<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code flow of each command</td></tr>
<tr><td> <em>Response:</em> <p>Both /flip and /roll commands meaning when the user sends /flip or /roll,<br>they will only see the message the server returned.&nbsp;<div>For the /roll code, I<br>use a Random object to generate a number between 0 and 20. Once<br>the user types /roll, a random number along with text is sent to<br>all users in the room</div><div>For the /flip code, I use a Random object<br>between 0 and 1, 0 being Heads and 1 being Tails, Once the<br>user types /flip, a text is sent to all users telling them the<br>side of the coin they landed on<div><br style="box-sizing: border-box; color: rgb(36, 41, 47);<br>font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI<br>Emoji&quot;; font-size: 16px; background-color: rgb(246, 248, 250);"></div></div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Custom Text </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Screenshots of examples</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/182625614-2113345f-fb96-4361-93b1-74a35bb10dc6.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows bold, italic, color, underline, and combination of bold and underline working<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how you got the UI side to render the text accordingly</td></tr>
<tr><td> <em>Response:</em> <div>The user first types a word surrounded by two symbols on each side.<br>Bold = **word**, Italics = %%word%%, Underline = !!word!!, and color red =<br>&amp;&amp;hello&amp;&amp;. Symbols can work together. For example, **&amp;&amp;word&amp;&amp;** will get you a bolded<br>underline word.&nbsp;</div><div>Comment: When you combine two symbols, the chatroom will produce two words.<br>The second word is the correct one</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 5: </em> Whisper </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing a demo of whisper commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/182627974-e17c65bc-a737-4ac3-b198-dd714247c3d7.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows User2(Middle) sending an a whisper command &quot;@&quot; to User1(Left)<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the server-side code snippets of how this feature works</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/182628257-3a598aa0-5788-4aa9-b197-67d8a40b2fad.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows service side code of whisper<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <div>When user1(left) types "@"(the whisper command) user2(middle), user 1 and user 2 both<br>get a message only they can see. The way it works is that<br>before client loop starts, I first send a message to the sender of<br>the whisper. The code then checks if client2(client loop) equals @Username and if<br>client2 is not muted with the sender of the whisper command. If both<br>these arguments are true, the message to user1 is sent. If user 1<br>mutes user 2, however, the message to the user1 is not sent.&nbsp;</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 6: </em> Mute/Unmute </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots demoing this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/182628496-67e07623-c5eb-497c-aca0-3cafdb51e797.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows user1(left) muting User(2) after @Brian. User1 doesn&#39;t see User2 messages until they<br>see &quot;d&quot;<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshots of the code snippets that achieve this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/182628933-6df19b21-bfec-42d8-8e8a-4b083bac715e.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>isMuted relies on client loop and the sender. IsMuted goes through each client<br>and see if their list contains the same client name as sender. If<br>so, the message doesn&#39;t send and if not the message sends<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/182629452-603e9d6c-3d01-476f-9a87-6c6aff597259.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows how Sender adds /username to its list using mute and removes /username<br>from list using unmute. getList returns senders list. isMuted checks if sender is<br>on the clients list<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/182629622-26aaa35a-2cef-470c-a278-04edee8ad406.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Sender adds /username to its list using mute and removes /username from list<br>using unmute<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <p>When the client(sender) presses for example /mute User2, User2 gets added to the<br>sender&#39;s array located inside the Server Thread file. The Room.sendMessage method will check<br>if User2 is inside the sender&#39;s array and if so, User2 will not<br>send any messages to the sender<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-chatroom-milestone3/grade/bmm49" target="_blank">Grading</a></td></tr></table>

<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone4</td></tr>
<tr><td> <em>Student: </em> Brian Maina(bmm49)</td></tr>
<tr><td> <em>Generated: </em> 8/11/2022 7:08:52 AM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-chatroom-milestone4/grade/bmm49" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Client can export chat history of their current session (client-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot of related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/184113458-fa4d60e9-d85e-44b0-b550-a5f2554099ba.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>User1(Left) sent three messages to the chatroom<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/184113717-f442263e-b531-4e8f-9a9f-e1f13fd3b026.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows the code for the Export Button(button1)<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/184113863-ad580e27-19ae-4c8a-b341-7021a7736915.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows the writeLog4 method that overwrites the code each time a user exports<br>data from their chatArea<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot of exported data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/184114294-a6ed1f36-f871-4242-a0dd-3b9627e3cf04.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows the first part of the Exported data from User1<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/184114589-d404ee13-3e05-4249-bb2e-f617066608a5.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows the second part of the Exported data from User1<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>I created a new button inside the ChatPanel called &quot;Export&quot;. Whenever I user<br>presses Export all of their messages are fed through a StringBuilder before being<br>put inside the writeLog4 method. The writeLog4 method allows the file to be<br>overwritten whenever the client sends new data.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Client's mute list will persist across sessions (server-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot of how the mute list is stored</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/184115146-d20ef159-ec36-4693-b78f-0afd24502b1c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This program takes in the senders clietname<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/184114955-8265875b-0532-4fbb-86f8-54736f8430a7.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This program takes the senders clientname and converts it into a file. The<br>senders arraylist overwrites the file to reflect how the Arraylist<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/184120041-098ce461-2183-4c9c-9643-7e34fdeb87ec.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Show that John(Left) and Tim(Right) were muted by Greg. On the top of<br>the screen shows Greg.txt file that holds both Johns and Tim&#39;s name<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the code saving/loading mute list</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/184119793-fada9e13-6b96-427c-96b3-2469a1b607e4.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows that Greg(Middle) was disconnected from the server after muting John(Left) and Tim(Right).<br>When Greg disconnected John and Tim could still not send messages to Greg<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>Whenever the client mutes a user. The user that was muted gets added<br>to the client&#39;s file. This file allows me to save who the client<br>muted even if the session ended. If the client disconnects and reconnects with<br>the same name, I have a code that uses the client&#39;s file to<br>load in their mute list. I specifically did it in the add client<br>as it loads the client mute list before the client has even sent<br>a message.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Client's will receive a message when they get muted/unmuted by another user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot showing the related chat messages</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/184120041-098ce461-2183-4c9c-9643-7e34fdeb87ec.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows that John(Left) and Tim(Right) each got a message that Greg muted them.<br>The top of the picture confirms that Tim and John were added to<br>Greg mutelist file<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the related code snippets</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/184114955-8265875b-0532-4fbb-86f8-54736f8430a7.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows how the clients file gets overwrited as their arraylist changes<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/184115146-d20ef159-ec36-4693-b78f-0afd24502b1c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows how the clients filelist gets updated when the user mutes or unmutes<br>a user<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>When a user presses /mutes User2, the User2 name is checked against all<br>the client names. If the names match, I sent a message only to<br>User2 letting them know that client has muted Them. This principle also applies<br>for the /unmute<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> User list should update per the status of each user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/ff0000/000000?text=Incomplete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot for Muted users by the client should appear grayed out</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot for Last person to send a message gets highlighted</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>(missing)</p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-chatroom-milestone4/grade/bmm49" target="_blank">Grading</a></td></tr></table>