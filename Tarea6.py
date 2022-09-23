import random

def seleccion (lista):
    for n in range(len(lista) - 1, 0, -1):
        pio = 0

        for l in range (1, n + 1):
            if lista[l] > lista[pio]:
                pio = l

        temp = lista[n]
        lista[n]=lista[pio]
        lista[pio]= temp

data = [70, 12, 11, 75, 40, 33, 4, 31, 57, 10, 41, 22, 89, 97, 13]


seleccion(data)
print(data)


def cubetasort(array):
    largo = max(array)
    longitud = len(array)
    tamanio = largo/longitud

    cubetas = [[] for i in range(longitud)]

    for i in range(longitud):
        index = int(array[i]/tamanio)
        if index != longitud:
            cubetas[index].append(array[i])
        else:
            cubetas[longitud - 1].append(array[i])
    print(cubetas)

    for i in range(len(array)):
        cubetas[i] = seleccion(cubetas[i])

    resultado = []
    for i in range(longitud):
        resultado = resultado + cubetas[i]

    return result


arr = [70, 12, 11, 75, 40, 33, 4, 31, 57, 10, 41, 22, 89, 97, 13]

salida = cubetasort(arr)
print(salida)

print (max(array))
