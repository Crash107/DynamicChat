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