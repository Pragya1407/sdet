def sum_func(n) :
    if n :
        return n + sum_func(n-1)
    else:
        return 0
res =  sum_func(10)    
print(res) 

