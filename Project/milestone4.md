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