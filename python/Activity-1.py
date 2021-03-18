"""
Write a program that asks the user to enter their name and their age.
Print out a message addressed to them that tells them the year that they will turn 100 years old.
"""
username = input("Enter username:")
print("Username is:" + username)
#age = input("Enter age:")     # age is string
age = int(input("Enter age:")) # age is integer
print("User age is:" + str(age))    
year = 2021 + 100 - age        #year is integer so age should also be integer as contacenation is done in String
print( username +  " will turn 100 in the year " + str(year)) # string can be concatenate to string