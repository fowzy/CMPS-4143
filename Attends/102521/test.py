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
        # for (int col = left; col <= right; col++):
        for i in range(left, right,+1):
            result.append(matrix[up][i]);
        # Traverse down
        # for (int row = up + 1; row <= down; row++):
        for i in range(down):
            result.append(matrix[i][right])
        # Make sure we are now on a different row
        if (up != down):
            # Traverse from right to left
            # for (int col = right - 1; col >= left; col--):
            for i in range(right, left, -1):
                result.append(matrix[down][i])
        # Make sure we are now on a different column
        if (left != right):
            # Traverse upwards.
            for i in range(down,up,-1):
            # for (int row = down - 1; row > up; row--) {
                result.append(matrix[i][left]);
        left+=1
        right-=1
        up+=1
        down-=1
    return result


arr = [
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ]
    ]
# result has to be [1, 2, 3, 6, 9, 8, 7, 4, 5]
# result now wrong [1, 2, 3, 6, 4, 2, 1, 2, 3, 6]
print(spiralOrder(arr))