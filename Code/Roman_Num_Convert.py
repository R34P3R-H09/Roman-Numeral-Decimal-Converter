
##############################################
#    Changing a Roman Numeral to an Interger.
##############################################

#Copyright (C) R34P3R-H09 2024

# Roman Numeral     |       Interger

#      I            |           1
#      V            |           5
#      X            |           10
#      L            |           50
#      C            |           100
#      D            |           500
#      M            |           1000
#--------------------------------------


# The table above will be the standard numerals this program will adhere too.

import time

romanNumerals = {"I" : 1,
                 "V" : 5,
                 "X" : 10,
                 "L" : 50,
                 "C" : 100,
                 "D" : 500,
                 "M" : 1000
                 }

int_value = 0

# Welcoming the user to the program and explaining roman numerals.

print("\nThis is a Roman Numeral to Decimal Converter.")
time.sleep(3)

print("\nShortly, you will be asked to enter a numeral you wish to be converted.\nThere is no need to capitalise the letters.")
time.sleep(6)

print("\nHere is a breakdown of what each numeral represents ")
time.sleep(3)

print("\nI : 1\nV : 5\nX : 10\nL : 50\nC : 1000\nD : 500\nM : 1000")
time.sleep(3)


# Asking the user to input a roman numeral of their choice to convert.

userInput = input("\nPlease enter a roman numeral: ").upper()   # Ensuring the numeral is upper case.

for i in range (len(userInput)):
    if userInput [i] in romanNumerals:
        if i + 1 < len (userInput) and romanNumerals[userInput[i]] < romanNumerals[userInput[i + 1]]:
            int_value -= romanNumerals[userInput[i]]

        else:
            int_value += romanNumerals[userInput[i]]

    else:
        print("\nINPUT IS INVALID!")
        quit()

print("\nThe numeric value is: ", int_value)
time.sleep(2)











