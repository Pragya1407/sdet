#Activity3 - Rock-Paper-Scissors
'''
    Rock beats scissors
    Scissors beats paper
    Paper beats rock
'''
a = input("What a want to choose from Rock/Paper/Scissors: ")
if a not in ["Rock", "Paper", "Scissors"]:
    print("Game Over1")
    raise SystemExit
b = input("What b want to choose from Rock/Paper/Scissors: ")
if b not in ["Rock", "Paper", "Scissors"]:
    print("Game Over2")
    raise SystemExit
if a == b:
    print("Game Over3")
    raise SystemExit
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