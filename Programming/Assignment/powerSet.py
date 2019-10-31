list1 = [0,1,2,4];
def powerSet(list1):
  powerSet=[[]]
  for item in list1:
    for subSet in powerSet:
      powerSet = powerSet + [ list(subSet) + [item]]
  print(powerSet)

powerSet(list1)