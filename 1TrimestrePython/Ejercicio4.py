#Este ejercicio, evalúa el día de la semana dependiendo del numero (ente 1 y 7) introducido por el usuario.
dia=int(input("Introduzca un numero del 1 al 7 para evaluar que día de la semana es"))

if dia==1:
    print("El día introducido es lunes")
elif dia==2:
    print("El día introducido es martes")
elif dia==3:
    print("El día introducido es miércoles")
elif dia==4:
    print("El día introducido es jueves")
elif dia==5:
    print("El día introducido es viernes")
elif dia==6:
    print("El día introducido es sábado")
elif dia==7:
    print("El día introducido es domingo")
else:
    print("El dato introducido no es válido")
