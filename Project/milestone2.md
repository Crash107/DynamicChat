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