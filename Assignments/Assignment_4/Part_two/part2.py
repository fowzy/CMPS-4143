###############################################################################################################################
#   Author      :   Fowzy Alsaud
#   Date        :   Nov, 10th, 2021
#   Class       :   CMPS 4143 - Dr. Das
#   Assignment  :   #4 Part #2
#   Description :   Part 2 is basically making a program that will group anagrams together. Without using a built in function so I have to make a sort function to sort the words and then print the list of group anagram
###############################################################################################################################
# Function will sort any word
def SortWord(word):
    # convert the word into a string
    string = list(word)
    sortedWord=str() # define a variable that will take the new sorted value
    # reading through the word char by char
    for i in range(0,len(string)):
        # now we comparing each char by every other char in the string
        # if the word is "eat" then we start comparing e with a then t and so on... so our for loop it will start i+1 till the end
        for l in range(0, len(string)):
            # if the charcater "e" is bigger then we supposed to swap chars
            if (string[l] > string[i]):
                temp = string[i]
                string[i] = string[l]
                string[l] = temp
    return(sortedWord.join(string))

strs = ["eat","tea","tan","ate","nat","bat"]
# strs=[""]
# strs=["a"]
groupAnagram={} # create a dict that will hold multiple lists
# read every word in the list
for i in strs:
    # if the sorted word in the dict groupAnagram
    if SortWord(i) in groupAnagram:
        # if the sorted word (key) exist in dict then add the value to the existing key
        groupAnagram[SortWord(i)].append(i)
    else:
        # add the sorted word as key word, including the value
        groupAnagram[SortWord(i)] = [i]
# print the list of group anagram
print(list(groupAnagram.values()))
