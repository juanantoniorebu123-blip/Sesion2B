package Sesion2B;

public class Empleado {

	public enum TipoEmpleado{Vendedor,Encargado};
	
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

		return sBase;
	}
	

	public static float CalculoNominaNeta(float NominaBruta) {
		float retencion=0;
		if(NominaBruta<2100)
			retencion=0;
		else if(NominaBruta<=2500 && NominaBruta>=2100)
			retencion=15;
			
		else if(NominaBruta>2500 )
			retencion=18;
			
		float total=NominaBruta*(1-retencion/100);
		
		return total;
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
