#############################################################################
#   Author  =   Fowzy Alsaud                                                #
#   Class   =   CMPS 4143 - Dr. Das                                         #
#   Topic   =   Attends 10/25/21                                            #
#   Date    = Monday, Oct 25th, 2021                                        #
#   Descibe =                                                               #
#############################################################################

# How to loop though a string [:]
# text = "good morning"
# print(text[:2])

l1 = [1,3,3,4]
l2 = [9,8,5]
l3 = []
# l3 = [0 for _ in range(len(1))]
for x in range(len(l2)):
    newVal = l1[x] + l2[x]
    l3.append(newVal)

print(l3)