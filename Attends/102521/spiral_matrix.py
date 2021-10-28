def spiralOrder(matrix):
    result=[]
    rows= len(matrix)
    columns=len(matrix[0])
    up = 0
    left = 0
    right = columns -1
    down = rows -1
    while len(result) < rows * columns:
        
        # Traverse from left to right
        for i in range(left, right+1):
            result.append(matrix[up][i]);
        up+=1
        # Traverse down
        for i in range(up, down+1):
            result.append(matrix[i][right])
        right-=1
        # Make sure we are now on a different row
        if (up != down):
            # Traverse from right to left
            for i in range(right, left-1,-1):
                result.append(matrix[down][i])
        down-=1
        # Make sure we are now on a different column
        if (left != right):
            # Traverse upwards.
            for i in range(down,up-1,-1):
                result.append(matrix[i][left])
        left+=1
    return result


arr = [
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ]
    ]
# result has to be [1, 2, 3, 6, 9, 8, 7, 4, 5]
print(spiralOrder(arr))