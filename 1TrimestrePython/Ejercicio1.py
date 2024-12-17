dia_nacimiento=0
mes_nacimiento=0
anno_nacimiento=0

dia_actual=0
mes_actual=0
anno_actual=0

dia_nacimiento=int (input("Introduzca su día de nacimiento"))
mes_nacimiento=int (input("Introduzca su mes de nacimiento"))
año_nacimiento=int (input("Introduzca su año de nacimiento"))

dia_actual=int (input("Introduzca el día actual"))
mes_actual=int (input("Introduzca el mes actual"))
año_actual=int (input("Introduzca el año actual"))

if anno_actual-anno_nacimiento>65:
    print("Usted puede jubilarse")

else:
    if anno_actual-anno_nacimiento==65:
        if mes_actual>mes_nacimiento:
            print("Usted se puede jubilar")
        else:
            if mes_actual>=mes_nacimiento:
                if dia_actual>=dia_nacimiento:
                    print("Usted se puede jubilar")


if anno_actual-anno_nacimiento<65:
    print("Usted no se puede jubilar")
else:
    if anno_actual-anno_nacimiento==65:
        if mes_actual<mes_nacimiento:
            print("Usted no puede jubilarse")
        else:
            if mes_actual==mes_nacimiento:
                if dia_actual<dia_nacimiento:
                    print("Usted no puede jubilarse")
   
