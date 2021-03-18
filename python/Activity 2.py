#Activity 2 Odd Even Numbers

number = int(input("Enter a number:"))
rem = number%2
if rem == 0:
    print("Even")
elif rem > 0:
    print("Odd")