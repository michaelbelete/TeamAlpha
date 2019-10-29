#prepositon
print('''
  _____                       _    _       _           
 |_   _|__  __ _ _ __ ___    / \  | |_ __ | |__   __ _ 
   | |/ _ \/ _` | '_ ` _ \  / _ \ | | '_ \| '_ \ / _` |
   | |  __/ (_| | | | | | |/ ___ \| | |_) | | | | (_| |
   |_|\___|\__,_|_| |_| |_/_/   \_\_| .__/|_| |_|\__,_|
                                    |_|                
''')

Continue = 0
while(Continue != 1):#making the program run in a loop
    print("\nThis program will make prepositions by accepting booleans from the user.")
    print("\n")#just to make the program more readable
    Bool_1 = eval(input("Enter boolean 1: "))#accepts the first boolean value from the user
    Bool_2 = eval(input("Enter boolean 2: "))#accepts the second boolean value from the user
    print("\n")#just to make the program more readable
    Conjunction = Bool_1 and Bool_2#conjunction is created to have "and" value
    print("Conjunction: ", Conjunction)#displaying the conjunctin
    Disjunction = Bool_1 or Bool_2#disjunction is created to have "or" value
    print("Disjunction: ", Disjunction)#printing disjunction
    def Implication(Bool_1, Bool_2):#creating implication function
        if(Bool_1 == True and Bool_2 == False):#cheking wether the first boolean value implies the second or not
            return False#if not return false
        else:
            return True#if it implies it returns true
    print("Implication : ", Implication(Bool_1, Bool_2))#printing implication
    def Bicondition(Bool_1, Bool_2):#creating bicondition function\
        if((Bool_1 == True and Bool_2 == True) or (Bool_1 == False and Bool_2 == False)):#checking wether two booleans are the same
            return True#if they are same it returns true
        else:
            return False#if not it returns false
    print("Bicondition: ", Bicondition(Bool_1, Bool_2))#printing bicondition
    def Negation(Bool_1, Bool_2):#creating negation function
        print("Boolean 1: ", not Bool_1)#printing the negative value of boolean 1
        print('Boolean 2: ', not Bool_2)#printing the negative value of boolean 2
    print("Negation:")
    Negation(Bool_1, Bool_2)#calling the negative function to show negative values
        

    
    Continue = eval(input("Press 1 to exit or other numbers to continue: "))#asking the user wether to continue or not
