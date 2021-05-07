dict_fruit = {
    "apple" : 50,
    "banana" : 10,
    "watermelon" : 40,
    "orange" : 25,
    "kiwi" : 30
}
check_fruit = input("What fruit you want?? ").lower()
if (check_fruit in dict_fruit) :
    print("yes.. " + check_fruit + " is available")
else :    
    print("no.. " + check_fruit + " is not available")