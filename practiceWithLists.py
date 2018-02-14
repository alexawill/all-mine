#This program practices lists
#The program will ask the user to input a number of values
#we will produce the max, min, avg

val = int(input("How many numbers would you like to enter? "))
values = []

for i in range(0, val):
    x = int(input("Enter an integer: "))
    values.append(x)

print ("\nThe max is:", max(values))
print ("The min is:", min(values))
print ("The avg is:", (float(sum(values))/float(len(values))))
