# range()
# reversed()
# list
# break and continue statement
"""
   /$$$$$$  /$$$$$$  /$$$$$$$   /$$$$$$   /$$$$$$ 
  /$$__  $$|____  $$| $$__  $$ /$$__  $$ /$$__  $$
 | $$  \__/ /$$$$$$$| $$  \ $$| $$  \ $$| $$$$$$$$
 | $$      /$$__  $$| $$  | $$| $$  | $$| $$_____/
 | $$     |  $$$$$$$| $$  | $$|  $$$$$$$|  $$$$$$$
 |__/      \_______/|__/  |__/ \____  $$ \_______/
                               /$$  \ $$          
                              |  $$$$$$/          
                               \______/            
"""
x=int(input('Enter a value to start a counter loop: '))
for i in range(x+1):
    print(i)
y=int(input('Enter a value to start our reversed loop: '))
"""
   /$$$$$$   /$$$$$$  /$$    /$$ /$$$$$$   /$$$$$$   /$$$$$$$  /$$$$$$ 
  /$$__  $$ /$$__  $$|  $$  /$$//$$__  $$ /$$__  $$ /$$_____/ /$$__  $$
 | $$  \__/| $$$$$$$$ \  $$/$$/| $$$$$$$$| $$  \__/|  $$$$$$ | $$$$$$$$
 | $$      | $$_____/  \  $$$/ | $$_____/| $$       \____  $$| $$_____/
 | $$      |  $$$$$$$   \  $/  |  $$$$$$$| $$       /$$$$$$$/|  $$$$$$$
 |__/       \_______/    \_/    \_______/|__/      |_______/  \_______/
"""
# reverse ordering using reversed()
list1 = [1,2,3,4,5]
for i in reversed(list1):
    print(i)
"""
   /$$ /$$             /$$    
 | $$|__/            | $$    
 | $$ /$$  /$$$$$$$ /$$$$$$  
 | $$| $$ /$$_____/|_  $$_/  
 | $$| $$|  $$$$$$   | $$    
 | $$| $$ \____  $$  | $$ /$$
 | $$| $$ /$$$$$$$/  |  $$$$/
 |__/|__/|_______/    \___/  
"""
"""
  /$$                                     /$$      
 | $$                                    | $$      
 | $$$$$$$   /$$$$$$   /$$$$$$   /$$$$$$ | $$   /$$
 | $$__  $$ /$$__  $$ /$$__  $$ |____  $$| $$  /$$/
 | $$  \ $$| $$  \__/| $$$$$$$$  /$$$$$$$| $$$$$$/ 
 | $$  | $$| $$      | $$_____/ /$$__  $$| $$_  $$ 
 | $$$$$$$/| $$      |  $$$$$$$|  $$$$$$$| $$ \  $$
 |_______/ |__/       \_______/ \_______/|__/  \__/
"""
"""
                                  /$$     /$$                              
                                 | $$    |__/                              
   /$$$$$$$  /$$$$$$  /$$$$$$$  /$$$$$$   /$$ /$$$$$$$  /$$   /$$  /$$$$$$ 
  /$$_____/ /$$__  $$| $$__  $$|_  $$_/  | $$| $$__  $$| $$  | $$ /$$__  $$
 | $$      | $$  \ $$| $$  \ $$  | $$    | $$| $$  \ $$| $$  | $$| $$$$$$$$
 | $$      | $$  | $$| $$  | $$  | $$ /$$| $$| $$  | $$| $$  | $$| $$_____/
 |  $$$$$$$|  $$$$$$/| $$  | $$  |  $$$$/| $$| $$  | $$|  $$$$$$/|  $$$$$$$
  \_______/ \______/ |__/  |__/   \___/  |__/|__/  |__/ \______/  \_______/
"""
lis2 = [33,89,'nananan',4,'animal',8,100,87,'stop',21,55,101]
# for index in range(len(list))
for i in range(len(lis2)):
    if lis2[i] == 4:
        print('found 4')
        continue
    if lis2[i] == 'stop':
        print('found stop element then I have to stop')
        break
    print(lis2[i]) # prove our break is not working anymore after we break
# for value in list:
#   print(value)
# for loop to found the largest value
numList = [3,45,1,100,33,9,184,-22] # list of numbers
largest = int()
smallest = int()
sum =0
for i in range(len(numList)):
    if numList[i] > largest: # find the largest
        largest = numList[i]
    if numList[i] < smallest: # find the smallest
        smallest = numList[i]
    sum+=numList[i]
# find the largest in that list or we can use built in function max()
print(largest)
# find the smallest in that list we or can use built in function min()
print(smallest)
# find the sum of that list or we can ose the built in function sum()
print(sum)
# find the average of that list
print(sum/len(numList))