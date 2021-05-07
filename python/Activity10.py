tuple1 = tuple(input("Enter the tuple elements : ").split(","))
print(tuple1)
for i in tuple1 :
    if int(i) % 5 == 0 :
        print(i) 
