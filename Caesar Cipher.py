#Author: Andy Molina

#initializing alphabet in a list & initializing cipered alphabet list
alphabet = ["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"]
cipher = []

#Reading in input to see how far to shift alphabet
shift = input("Pick a shift between 1-26: ")
shift = int(shift) - 1  #adjusting shift to list parameters

#From the shift 'x' to the end of the alphabet, add to the ciphered alphabet list
x = range(shift, 26) #from shift index to end of the alphabet
for i in x:
    cipher.append(alphabet[i])
    
#Wrap around and addon remaining letters at the end    
x = range(0,(shift+1))
for i in x:
    cipher.append(alphabet[i])

#print the ciphered alphabet
print(cipher) 

#Ask for phrase input
phrase = input("Enter a phrase to encrypt: ")
phrase = phrase.upper() #convert to uppercase

#Convert string to list
phrase_list = []
for i in phrase:
    phrase_list.append(i)
    
#print(phrase_list)

#Compare phrase with alphabet, replace each letter with the corresponding number in the alphabet
for i in range(0,len(phrase_list)):
    for n in range(0,len(alphabet)):
        if phrase_list[i] == alphabet[n]:
            phrase_list[i] = n+1

#print(phrase_list) 
#Replace the numbers with the corresponding letters in the ciphered alphabet
for i in range(0,len(phrase_list)):
    phrase_list[i] = cipher[phrase_list[i]]
    
#print(phrase_list)
#Convert the phrase list into a string
ciphered = ''.join(map(str, phrase_list))

#Print the final ciphered phrase
print(ciphered)


    
    