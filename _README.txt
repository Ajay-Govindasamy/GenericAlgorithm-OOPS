The code takes a given information of table content.

DUMO or DU_MO and I P under D and M.

the initial table is set to 

D U _ M O
_ _ _ _ _
_ _ _ _ _
_ _ _ _ _
V W X Y Z

Then the positon of B and G is set to one of their possible position; 

D U _ M O
_ _ _ _ _
B _ _ G _
_ _ _ _ _
V W X Y Z

The position of P and I is set to one of the possible position

D U _ M O
_ _ _ _ _
B _ _ G _
I _ _ P _
V W X Y Z

From the frequency test, the most frequency letter of the cipher text is A. so assume E->A;(This part of code is not on the file, it was written in different operating System)


The Code then fill the remaining space with random letters.
When run the decode() many times with different table, it shows that when EA are on second row or third row, it will more likely to get better answer. so i decided to put on second row; 
This position of EA on second row was based on the result of code, it was on the second and third position from the result. but i dont have the screenshot.
(There is a method that checks if "plainText" contains real plainText"BYMIDM" )

D U _ M O
_ E A _ _
B _ _ G _
I _ _ P _
V W X Y Z

Then run the code with more information and it shows that DUNMO appears more often with a better results; 

And then get R before EA

D U N M O
R E A _ _
B _ _ G _
I _ _ P _
V W X Y Z

With this much information, it's enough for the code to generate the real key table

D U N M O 
R E A S T 
B C F G H 
I K L P Q 
V W X Y Z 