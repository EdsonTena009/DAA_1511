
Numerodecaracteres = 300

def CAR(lol, tamanio):
    ca = [-1]*Numerodecaracteres
    for i in range(tamanio):
        ca[ord(lol[i])] = i;
    return ca

def buscar(codigoenbin, pat):
    m = len(pat)
    n = len(codigoenbin)

    ca = CAR(pat, m)

    s = 0
    while(s <= n-m):
        j = m-1

        while j>=0 and pat[j] == codigoenbin[s+j]:
            j -= 1

        if j<0:
            print("El patron aparece en el car = {}".format(s))
            s += (m-ca[ord(codigoenbin[s+m])] if s+m<n else 1)
        else:
            s += max(1, j-ca[ord(codigoenbin[s+j])])

def main():
    codigoenbin = "1110010001101110100011001111000110001110001110001110100011010001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001110001101000111110101010100111100011000"
    pat = "1010101"
    buscar(codigoenbin, pat)


if __name__ == '__main__':
    main()
