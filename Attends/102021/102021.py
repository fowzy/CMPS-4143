# Author      :   Fowzy Alsaud
# Date        :   Oct 20th, 2021
# Class       :   CMPS-4143 - Dr. Das
# Assignment  :   Attends for Wednesday class OCT 20th, 2021
# Description :   

def pay(_hours, _rate):
    if _hours >= 40:
        return (40*_rate)+(_hours-40)*(_rate*1.5)
    else:
        return _hours*_rate


# making a function that will do a recurision
hours = int(input('Please the amount of hours: '))
rate = int(input('Please  enter the rate: '))
print(f'the amount of pay is: {pay(hours,rate)}')
