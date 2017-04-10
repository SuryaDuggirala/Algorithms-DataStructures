def mergeSort(lst):
    if len(lst) == 0:
        return []
    elif len(lst) == 1:
        return lst
    elif len(lst) == 2:
        if lst[1] < lst[0]:
            lst = [lst[1], lst[0]]
            return lst
        else:
            return lst
    else:
        left = lst[:len(lst) // 2]
        right = lst[len(lst) // 2:]
        left = mergeSort(left)
        right = mergeSort(right)
        return compareList(left, right)

def compareList(left, right):
    new_lst = []
    i1 = 0
    i2 = 0
    while i1 < len(left) or i2 < len(right):
        if i1 == len(left):
            new_lst = new_lst + [right[i2]]
            i2 += 1
        elif i2 == len(right):
            new_lst = new_lst + [left[i1]]
            i1 += 1
        else:
            if right[i2] >= left[i1]:
                new_lst.append(left[i1])
                i1 += 1
            else:
                new_lst.append(right[i2])
                i2 += 1
    return new_lst

## Some tests to run locally and check visually. Not an extensive series of tests by any means.
lst0 = [1]
lst1 = [4,6,2,9,4,1,1,6,3,7,2,2,8,9,4,3,6,4,2,3,4,5,1]
lst2 = [1,2,3,4,5,6,7,8,9,0]
lst3 = [0,9,8,7,6,5,4,3,2,1]
lst4 = []
lst5 = [1,2,1,1,1,1,1,11,1,1,1,1,1,1,1,1,1,1,1,1,1,1]

lst = [lst0, lst1, lst2, lst3, lst4, lst5]
for _ in lst:
    print(mergeSort(_))
