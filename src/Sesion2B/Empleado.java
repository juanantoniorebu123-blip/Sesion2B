package Sesion2B;

public class Empleado {

	public enum TipoEmpleado{Vendedor,Encaragado};
	
	public static float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		float sBase=0;
		if(tipo==TipoEmpleado.Vendedor) {
			
			sBase= 2000;
		}else {
			
			sBase= 2500;
		}
		
		if(ventasMes>1500)
		{
			sBase+=200;
		}else if(ventasMes>=1000) {
			sBase+=100;
		}
		
		sBase+=horasExtra*30;
		
		System.out.println(sBase);
		
		return sBase;
	}
	//Si la nomina bruta es menor de 2100 euros, no se aplicará ninguna retención. Para nominas superiores a 2100 pero menores de 2500 euros se les aplicará un 15%. Para salarios a partir de 2500 euros se les aplicará un 18%. El método devuelve nominaBruta * (1-retencion).


	public static float calculoNominaMeta(float NominaBruta) {
		float retencion=0;
		if(NominaBruta<2100)
			retencion=0;
		else if(NominaBruta<2500 && NominaBruta>2100)
			retencion=15;
			
		else if(NominaBruta>2500 )
			retencion=18;
			
		return NominaBruta*(1-retencion/100);
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
