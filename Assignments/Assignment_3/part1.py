# Author        =   Fowzy Alsaud
# Date          =   Oct, 20th, 2021
# Class         =   CMPS 4143 - Dr. Das
# Assignment    =   Assignment #3 - Part 1
# Description   =   Write a python program to draw a three stage rocket.
# Details       =   I used ASCII Art to draw my rocket and it has three different stages:
#   - stage one is on the ground
#   - stage two is start flying
#   - stage threee is flying to the mooooon
# Each stages has their own ASCII Art and whenever you run the program it calls each function for each stage.

def stageOne():
    print("""\
                /\\
                ||
              /____\\
              |    |
              |    |
             /      \\
            /        \\
           /          \\
          /            \\
         /              \\
         ----------------
         |--------------|
         |     _____    |
         |    |_____    |
         |    |         |
         |    |         |
         |      ____    |
         |     /    \   |
         |     \____/   |
         |              |
         |   \   /\   / |
         |    \_/  \_/  |
         |              |
         |     _____    |
         |        /     |
         |       /      |
         |      /_____  |
         |              |
         |   \     /    |
         |    \   /     |
         |     \ /      |
         |      |       |
         |      |       |
         |      |       |
         |              |
         |      __      |
        /|      ||      |\\
       / |      ||      | \\
      /  |      ||      |  \\
     /   |      ||      |   \\
-----    |      ||      |    -----
|   |    |      ||      |    |   |
|   |    |      ||      |    |   |
|   |    |      ||      |    |   |
|   |    |______||______|    |   |
--------/               \--------
        """)
def stageSecond():
    print("""\
                /\\
                ||
              /____\\
              |    |
              |    |
             /      \\
            /        \\
           /          \\
          /            \\
         /              \\
         ----------------
         |--------------|
         |     _____    |
         |    |_____    |
         |    |         |
         |    |         |
         |      ____    |
         |     /    \   |
         |     \____/   |
         |              |
         |   \   /\   / |
         |    \_/  \_/  |
         |              |
         |     _____    |
         |        /     |
         |       /      |
         |      /_____  |
         |              |
         |   \     /    |
         |    \   /     |
         |     \ /      |
         |      |       |
         |      |       |
         |      |       |
         |              |
         |      __      |
        /|      ||      |\\
       / |      ||      | \\
      /  |      ||      |  \\
     /   |      ||      |   \\
-----    |      ||      |    -----
|   |    |      ||      |    |   |
|   |    |      ||      |    |   |
|   |    |      ||      |    |   |
|   |    |______||______|    |   |
--------/               \--------
  ( | )                   ( | )    
  ( | )                   ( | )    
 ((   ))                 ((   ))
((  :  ))               ((  :  ))
((  :  ))               ((  :  ))
 ((   ))                 ((   ))
  (( ))                   (( ))
   ( )                     ( )
        """)


def stageThree():
    print("""\
                /\\
                ||
              /____\\
              |    |
              |    |
             /      \\
            /        \\
           /          \\
          /            \\
         /              \\
         ----------------
         |--------------|
         |     _____    |
         |    |_____    |
         |    |         |
         |    |         |
         |      ____    |
         |     /    \   |
         |     \____/   |
         |              |
         |   \   /\   / |
         |    \_/  \_/  |
         |              |
         |     _____    |
         |        /     |
         |       /      |
         |      /_____  |
         |              |
         |   \     /    |
         |    \   /     |
         |     \ /      |
         |      |       |
         |      |       |
         |      |       |
         |              |
         |      __      |
        /|      ||      |\\
       / |      ||      | \\
      /  |      ||      |  \\
     /   |      ||      |   \\
-----    |      ||      |    -----
|   |    |      ||      |    |   |
|   |    |      ||      |    |   |
|   |    |      ||      |    |   |
|   |    |______||______|    |   |
--------/               \--------
  ( | )                   ( | )    
  ( | )                   ( | )    
 ((   ))                 ((   ))
((  :  ))               ((  :  ))
((  :  ))               ((  :  ))
 ((   ))                 ((   ))
  (( ))                   (( ))
   ( )                     ( )

   ( )                     ( )
  ( | )                   ( | )    
 ((   ))                 ((   ))
((  :  ))               ((  :  ))
 ((   ))                 ((   ))
((  :  ))               ((  :  ))
((  :  ))               ((  :  ))
 ((   ))                 ((   ))
  (( ))                   (( ))
   ( )                     ( )

   ( )                     ( )
  ( | )                   ( | )    
 ((   ))                 ((   ))
((  :  ))               ((  :  ))
        """)

stageThree() # rocket fly to the moon
stageSecond() # rocket started flying 
stageOne() # rocket on the ground
