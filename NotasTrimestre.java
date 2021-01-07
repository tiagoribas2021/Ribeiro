package entidade;

public class NotasTrimestre {

	public Double primeiroTrimestre;
	public Double segundoTrimestre;
	public Double TerceiroTrimestre;
	
	public double notaTotalAluno() {
		return primeiroTrimestre + segundoTrimestre + TerceiroTrimestre;
	}
	
	public double aprovadoReprovado() {	
	  double difNota = 0;
		   if (notaTotalAluno() < 60) {
			 difNota = 60 - notaTotalAluno();	    	
	    	}	
    	return difNota;
	}
	
	
}
