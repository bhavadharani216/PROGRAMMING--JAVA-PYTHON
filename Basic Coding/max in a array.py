arr = [12, 45, 7, 89, 34, 56]

largest = arr[0]

for num in arr[1:]:
    if num > largest:
        largest = num

print("Largest Element:", largest)
