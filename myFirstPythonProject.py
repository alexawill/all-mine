#This program allows a user to guess a number in a given range!
import random

randomNum = random.randint(1,10)
userInput = int(input("Enter a number from 1 to 10: "))


while(userInput < 0 or userInput > 10):
    userInput = int(input("That number is not from 1 to 10, try again!: "))
    

while(userInput != randomNum):
    if(userInput > randomNum):
        print("Your number is too high! Guess again: ")
    else:
        print ("Your number is too low! Guess again: ")
    userInput = int(input("Enter a number from 1 to 10: "))
print("You got it!! Are you psychic??")
