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
    res = [element for element in A]
    for element in B:
        if element not in A:
            res.append(element)
    return res                                                                                                                                                                                

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

def acceptSet():
    A = input("Enter elements separated by space: ").split()
    try:
        A = [int(element) for element in A]
    except:
        pass                                   
    return A 
    
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
            P = acceptBoolean()            
            print("Negation of {} is {}\n".format(P,negation(P)))
        elif choice == "2":
            P = acceptBoolean()
            Q = acceptBoolean()
            print("Conjunction of {} and {} is {}\n".format(P,Q,conjunction(P,Q)))
        elif choice == "3":
            P = acceptBoolean()
            Q = acceptBoolean()
            print("Disjunction of {} and {} is {}\n".format(P,Q,disjunction(P,Q)))
        elif choice == "4":
            P = acceptBoolean()
            Q = acceptBoolean()
            print("Exculisive OR of {} and {} is {}\n".format(P,Q,exclusiveOR(P,Q)))
        elif choice == "5":
            P = acceptBoolean()
            Q = acceptBoolean()
            print("Implication of {} and {} is {}\n".format(P,Q,implication(P,Q)))
        elif choice == "6":
            P = acceptBoolean()
            Q = acceptBoolean()
            print("Biconditional of {} and {} is {}\n".format(P,Q,biconditional(P,Q)))
        elif choice == "7":          
            break
        else:
            print("Invalid Input!\n")

def setOperations():
    while True:
        print('''=====[Set Operations]=====
        [1] Union
        [2] Intersection
        [3] Difference
        [4] Symmetric Difference
        [5] Power Set
        [6] Main-Menu''')
        print()
        
        choice = input("Choice: ")
        print()
        
        if choice == '1':
            A = acceptSet()            
            B = acceptSet()                                                         
            print("\nUnion of {} and {} is {}\n".format(A,B,union(A,B)))
        elif choice == '2':
            A = acceptSet()            
            B = acceptSet()            
            print("\nIntersection of {} and {} is {}\n".format(A,B,intersection(A,B)))
        elif choice == '3':
            A = acceptSet()            
            B = acceptSet()            
            print("\nDifference of {} and {} is {}\n".format(A,B,difference(A,B)))
        elif choice == '4':
            A = acceptSet()            
            B = acceptSet()            
            print("\nSymmetric difference of {} and {} is {}\n".format(A,B,symmetricDifference(A,B)))
        elif choice == '5':
            # A = acceptSet()                                  
            print("\nPower Set(Coming Soon!)\n")       
        elif choice == '6':
           break
        else:
           print("Invalid Input!\n")
                
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

