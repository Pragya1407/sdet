list1 = [12,13,24,35,67,8]

list2 = [4,3,35,78,64,5]
list3 = []
for num in list1 :
    if num % 2 != 0 :
        list3.append(num) 
for num in list2 :
    if num % 2 == 0 :
        list3.append(num) 
print(list3)        


