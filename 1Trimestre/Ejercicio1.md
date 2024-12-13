public static void main(String[] args) {
		
		System.out.println("Introduzca su fecha de nacimiento en formato dd/mm/aa");
		
		int diaNacimiento,mesNacimiento,annoNacimiento,diaActual,mesActual,annoActual;
			
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
			diaNacimiento = scanner.nextInt();
			mesNacimiento = scanner.nextInt();
			annoNacimiento = scanner.nextInt();
			
		System.out.println("Introduzca la fecha actual en formato dd/mm/aa");	
			diaActual = scanner.nextInt();
			mesActual = scanner.nextInt();
			annoActual = scanner.nextInt();
			
		if (annoActual-annoNacimiento>65) {
			System.out.println("Usted puede jubilar");
		}else{
			if (annoActual-annoNacimiento==65) {
				if (mesActual>mesNacimiento) {	
					System.out.println("Usted puede jubilar");				
					
				}else {
					if (mesActual==mesNacimiento) {
						if(diaActual>=diaNacimiento) {
							System.out.println("Usted puede jubilarse");
						}
					}
				}	
			}
		}
		if(annoActual-annoNacimiento<65) {
			System.out.println("Usted no puede jubilarse");
		}else {
			if(annoActual-annoNacimiento==65) {
				if(mesActual<mesNacimiento) {
					System.out.println("Usted no puede jubilarse");
				}else {
					if(mesActual==mesNacimiento) {
						if(diaActual<diaNacimiento) {
							System.out.println("Usted no puede jubilarse");
						}
					}
				}
			}
		}
	}
