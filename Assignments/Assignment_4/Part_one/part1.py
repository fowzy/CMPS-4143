###############################################################################################################################
#   Author      :   Fowzy Alsaud
#   Date        :   Nov, 10th, 2021
#   Class       :   CMPS 4143 - Dr. Das
#   Assignment  :   #4 Part #1
#   Description :   Write a program python read students.dat and calculate the average, max, min grade, and count
#                   the number of freshmen, sophomore, junior, senior and then output in file called “student_statistics.txt”
###############################################################################################################################

# Variables
nameOfHighestGrade=str()# Name of the highest grade in the class according to the documentation/instructions/output example
highestGrade=int()      # Highest grade in the class
lowestGrade=int()       # Lowest grade in the class
averageGrade=int()      # Average grade in the class
freshmenCounter=int()   # Number of freshmen students
sophomoreCounter=int()  # Number of sophomore students
juniorCounter=int()     # Number of junior students
seniorCounter=int()     # Number of senior students
students=[]             # Students list
# Open the file "students.dat" and make sure use open function (fileName, following with mode 'r' is for the reading mode)
inputFile = open("students.dat", "r")
# Using readlines to read line by line and store it as var. to use it later
lines = inputFile.readlines()
# Read line by line from 'lines' list
for line in lines:
    # split the items/lines. Each line and assign a list for each students using .split('\t') \t is TAB
    student_list=line.split('\t')
    # After we split the line into students list we have to define the name, classification, and grade
    # Declaring the name, classification, grade of the students list
    name = student_list[0]             # Name is the first part of the list
    classification = student_list[1]   # Classification is the second part of the list
    grade =int(student_list[2])        # Grade is the third part of the list
    # Building a list of dict (students)
    students.append({
        "name":name,
        "classification":classification,
        "grade":grade
    })

    # Count the number of freshmen, sophomore, junior, and senior
    if(classification=='freshman'):
        freshmenCounter+=1
    elif(classification=='sophomore'):
        sophomoreCounter+=1
    elif(classification=='junior'):
        juniorCounter+=1
    elif(classification=='senior'):
        seniorCounter+=1

    # Count the class of the average
    numberOfStudent = len(lines)
    averageGrade+=int(grade)/numberOfStudent
    # Count the maximum grade in the class and find out who has the highest grade
    if(grade>highestGrade):
        highestGrade=grade
        nameOfHighestGrade=name
    
# Count the minimum grade of the list
lowestGrade = students[0].get('grade')  # the lowest grade is equal to the first grade in the list which is 97
# loop through the list of students grade
for i in students:
    grade = i["grade"]
    if(grade<lowestGrade):  # if the grade is smaller than the lowestGrade value then go in
        lowestGrade=grade   # then the lowest grade value is equal to the value (grade)

with open("student_statistics.txt", "w") as f:
# Print the final result
    f.write(nameOfHighestGrade+'\n')
    f.write(f'Highest grade: {(highestGrade)}\n')
    f.write(f'Lowest grade {lowestGrade}\n')
    f.write(f'Class average: {averageGrade}\n')
    f.write(f'Freshmen: {freshmenCounter}\n')
    f.write(f'Sophomores: {sophomoreCounter}\n')
    f.write(f'Juniors: {juniorCounter}\n')
    f.write(f'Seniors: {seniorCounter}')
    print('Students statistics is ready! please check the following file \"student_statistics.txt\"')

# Close the file
inputFile.close()