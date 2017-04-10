# Basic in place insertion sort

def in_place_insertionSort(lst):
    i = 0
    while i < len(lst):
        runner = 0
        while runner < len(lst) - 1 and lst[runner] > lst[runner + 1]:
            num = lst[runner + 1]
            lst[runner + 1] = lst[runner]
            lst[runner] = num
            runner += 1
        if runner == len(lst) - 2:
            if lst[runner] > lst[runner + 1]:
                num = lst[runner + 1]
                lst[runner + 1] = lst[runner]
                lst[runner] = num
        i += 1
    return lst
