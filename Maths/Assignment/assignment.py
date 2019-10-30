# discreet math assignment
# @author Eyob Alemu

def negation(p):
    if p == True:
        return False
    else:
        return True
  
def conjunction(p,q):    
    if p == True:
        if q == False:
            return False
        else:
            return True
    else:
        return False

def disjunction(p,q):
    if p == False:
        if q == True:
            return True
        else:
            return False
    else:
        return True

def exclusiveOR(p,q):
    if p == True:
        if q == False:
            return True
        else:
            return False
    else:
        if q == True:
            return True
        else:
            return False        

def implication(p,q):
    if p == True:
        if q == False:
            return False
        else:
            return True
    else:
        return True

def biconditional(p,q):
    if p == True:
        if q == True:
            return True
        else:
            return False
    else:
        if q == False:
            return True
        else:
            return False

def union(A,B):
    for element in B:
        if element not in A:
            A.append(element)
    return A                                                                                                                                                                                

def intersection(A,B):
    res = []
    for element in A:
        if element in B:
            res.append(element)
    return res

def difference(A,B):
    res = []
    for element in A:
        if element not in B:
            res.append(element)
    return res

def symmetricDifference(A,B):
    res = difference(A,B) + difference(B,A)
    return res        
    
def acceptBoolean():
    while True:
        A = input("Enter Truth value([1] for True/[0] for False): ")
        print()
        try:
            A = bool(int(A))
            return A               
        except:
            print("Invalid Input(1 or 0 only")
                    
    
def logicalOperations():
    while True:       
        print('''=====[Logical Operations]=====
        [1] Negation
        [2] Conjunction
        [3] Disjunction
        [4] Exclusive OR
        [5] Implication
        [6] Biconditional
        [7] Main-Menu''')
        print()
        
        choice = input("Choice: ")
        print()
        
        if choice == "1":            
            A = acceptBoolean()            
            print("Negation of {} is {}\n".format(A,negation(A)))
        elif choice == "2":
            A = acceptBoolean()
            B = acceptBoolean()
            print("Conjunction of {} and {} is {}\n".format(A,B,conjunction(A,B)))
        elif choice == "3":
            A = acceptBoolean()
            B = acceptBoolean()
            print("Disjunction of {} and {} is {}\n".format(A,B,disjunction(A,B)))
        elif choice == "4":
            A = acceptBoolean()
            B = acceptBoolean()
            print("Exculisive OR of {} and {} is {}\n".format(A,B,exclusiveOR(A,B)))
        elif choice == "5":
            A = acceptBoolean()
            B = acceptBoolean()
            print("Implication of {} and {} is {}\n".format(A,B,implication(A,B)))
        elif choice == "6":
            A = acceptBoolean()
            B = acceptBoolean()
            print("Biconditional of {} and {} is {}\n".format(A,B,biconditional(A,B)))
        elif choice == "7":          
            break
        else:
            print("Invalid Input!\n")

def setOperations():
    print("set")
                
def main():
    while True:
        print('''   =====[Main-Menu]=====
        [1] Logical operations
        [2] Set operations
        [3] Quit!''')
        print()
        
        choice = input("Choice: ")
        print()
            
        if choice == "1":            
            logicalOperations()       
        elif choice == "2":         
            setOperations()
        elif choice == "3":            
            print("Bye, Thank You for using the program!")
            break            
        else:           
            print("Invalid Input!\n")
                

main()

