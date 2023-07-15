# Taking input from the user
line1 = input("Enter the line sung by the first player: ") 
line2 = input("Enter the line sung by the second player: ")

# Extracting the last word from the first player's line 
words1 = line1.lower().split()
last_word1 = words1[-1]

# Extracting the first word from the second player's line 
words2 = line2.lower().split()
first_word2 = words2[0]

# Checking if the second player followed the rules of the game
if last_word1 == first_word2: print("Pass")
else:
    print("Stop")
