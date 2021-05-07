def cal_sum(num):
	sum = 0
	for n in num:
		sum += n
	return sum

addList = [10, 20, 30, 50, 80]

res = cal_sum(addList)

print("The sum of all the elements in the list is: " + str(res))