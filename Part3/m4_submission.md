<table><tr><td> <em>Assignment: </em> IT114 - Sockets Part 1 - 3</td></tr>
<tr><td> <em>Student: </em> Brian Maina(bmm49)</td></tr>
<tr><td> <em>Generated: </em> 6/21/2022 10:49:58 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-sockets-part-1-3/grade/bmm49" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch for this assignment</li><li>Go through the socket lessons and get each part implemented (parts 1-3)</li><li>Create a new folder called Part3HW</li><li>Create an empty m4_submission.md file in Part3HW</li><li>Add/commit/push the branch</li><li>Create a pull request to main and keep it open</li><li>Copy the the Part3 code into this new folder</li><li>Git add/commit all of the sample code and the Part3HW code</li><li>Implement two of the following server-side activities for all connected clients (majority of the logic should be processed server-side and broadcasted to all clients if/when applicable)</li><ol><li>Simple number guesser where all clients can attempt to guess</li><ol><li>Hint: may want separate commands to start, stop, and guess (or starting lasts for x rounds then stops)</li><li>No need to implement complexities like strikes</li></ol><li>Coin toss command (random heads or tails)</li><li>Dice roller given a command and text format of "roll #d#" (i.e., roll 2d6)</li><li>Math game (server outputs a basic equation, first person to guess it right gets congradulated and a new equatiion is given)</li><ol><li>Hint: may want a separate start, stop, answer commands (or starting lasts for x rounds then stops)</li></ol><li>Private message (a client can send a message targetting another client where only the two can see the messages)</li><li>Message shuffler (randomizes the order of the characters of the given message)</li></ol><li>Fill in the below deliverables</li><li>Save and generated the markdown or markdown file</li><li>Update the m4_submission.md file in the Part3HW folder</li><li>Add/commit/push your changes</li><li>Merge the pull request</li><li>From the M4-Sockets branch, navigate to your m4_submission.md file on github and copy the link</li><li>Submit the direct link to Canvas</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Baseline </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add as many screenshots as necessary to show basic communication among 3 clients and 1 server</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/174930386-eeb3c4e5-7419-499b-b279-a29e1182c42b.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>The server and the 3 clients are shown. All 3 clients can see<br>the same message<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Feature Implementation 1 </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> What feature did you pick? Briefly explain how you implemented it</td></tr>
<tr><td> <em>Response:</em> <p>I picked Problem 2, the coin toss problem. Each time the user enters<br>the phrase &quot;rolldice&quot; (I understand I should have put cointoss as the phrase<br>instead), the code randomly generates a number that is either zero or one.<br>Zero is heads and 1 is Tails<br></p><br></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot(s) showing the implemented feature working</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/174927923-1db816f6-4096-4079-86a5-86e0fb9d3127.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>My Code for Coin Toss(Problem 2)<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/174930903-8ccdba68-109a-4e66-ac4d-9836448c64d1.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>My Output for Coin Toss<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Feature Implementation 2 </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> What feature did you pick? Briefly explain how you implemented it</td></tr>
<tr><td> <em>Response:</em> <p>I picked Problem 3, the dice roller problem. The user for example types<br>&quot;roll 2d6&quot;. My code deletes the &quot;roll&quot; phrase and then separates 2 and<br>6 into two numbers. My code then randomly generates a number between 2(the<br>lowest number you can get with two dice is two) and 12 (the<br>highest number you get with two dice). I added a feature in my<br>code where it not only works for a six-sided die, but any size<br>the user wants. For example, the user can have a 20(2d20)side die or<br>a 2-side die(2d2)<br></p><br></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot(s) showing the implemented feature working</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/174927897-aed26d57-314c-437e-90ea-7d4d5e0526e9.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>My code for dice roller<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/105742689/174932018-f7314ed4-6e8d-4a1c-8282-a56b803e73d5.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>My output for dice roller<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Did you have an issues and how did you resolve them? If no issues, what did you learn during this assignment that you found interesting?</td></tr>
<tr><td> <em>Response:</em> <p>I struggled with how to get my code to work with all clients.<br>I was able to figure it out.&nbsp;<br></p><br></td></tr>
<tr><td> <em>Sub-Task 2: </em> Pull request link</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://user-images.githubusercontent.com/105742689/174932018-f7314ed4-6e8d-4a1c-8282-a56b803e73d5.png">https://user-images.githubusercontent.com/105742689/174932018-f7314ed4-6e8d-4a1c-8282-a56b803e73d5.png</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-sockets-part-1-3/grade/bmm49" target="_blank">Grading</a></td></tr></table>