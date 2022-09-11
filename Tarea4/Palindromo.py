nombres = ['00:00', '01:10', '02:20', '03:30', '04:40', '05:50', '10:01', '11:11', '12:21', '13:31', '14:41', '15:51', '20:02', '21:12', '22:22', '23:32']

for palabra in nombres:

    es_palindromo = True

    for i in range(len(palabra)):

        if palabra[i] != palabra[-(i+1)]:

            es_palindromo = False

            break

    if es_palindromo:
        print("La hora ", palabra, " es un palíndromo")
    else:
        print("La hora ", palabra, " no es un palíndromo")

print("numero de palídromos: ")

print(len(nombres))
