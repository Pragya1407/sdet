#Activity4 - Rock-Paper-Scissors
'''
    Rock beats scissors
    Scissors beats paper
    Paper beats rock
    Code so that it asks the user if they want to play another round.
    If they say 'Yes', the game should begin again.
    If they say 'No', the game should exit.

'''
while True:
    a = input("What a want to choose from Rock/Paper/Scissors: ")
    b = input("What b want to choose from Rock/Paper/Scissors: ")
    X =["Rock", "Paper", "Scissors"]
    if a not in X or b not in X or a == b:
        print("Game Over")
    elif a == "Rock":
        if b == "Paper":
            print("b is winner")
        elif b == "Scissors":
            print("a is winner")
    elif a == "Paper":
        if b == "Rock":
            print("a is winner")
        elif b == "Scissors":
            print("b is winner")
    elif a == "Scissors":
        if b == "Rock":
            print("b is winner")
        elif b == "Paper":
            print("a is winner")
    repeat = str(input("Would you like to play again (Y / N):"))
    if repeat == "Y":
        Continue
    elif repeat == "N":
        raise SystemExit
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit