# Introduction to Cryptography
# Universidad del Rosario - School of Engineering, Science and Technology
# Andrey Javier Lizarazo and Esteban Hernandez Ramirez
from dataencryptionstandard import *

# This is 0 main function. The interaction between user and tool si performed here.

def main():
    print("Data Encryption Standard (DES)\n")
    flag = True
    while flag:
        selection = input("Press '0' if you want to ENCRYPT a message | Press '1' if you want to DECRYPT a message: ")
        if selection != '0' and selection != '1':
            print("Please choose a valid option ...")
        else: 
            flag = False

    key = input("\nEnter the key (48-bits string):")
    bit_key = []
    for bit in key:
        num = int(bit)
        if (len(key) != 48) or (num != 0 and num != 1):
            print("¡You entered and invalid key!")
            return
        else:
            bit_key.append(int(bit))
    print(bit_key)

    target = input("\nEnter the target (64-bits string):")
    bit_target = []
    for bit in target:
        num = int(bit)
        if (len(target) != 64) or (num != 0 and num != 1):
            print("¡You entered and invalid message!")
            return
        else:
            bit_target.append(int(bit))
    print(bit_target)

    des = DES(bit_key)
    if selection == '0':
        cif = des.cipher(bit_target)
        print("\nmensaje cifrado: ", cif)
    elif selection == '1':
        dif = des.decipher(bit_target)
        print("\nmensaje recuperado: ", dif)

main()