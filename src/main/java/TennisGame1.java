
public class TennisGame1 implements TennisGame {
    
    private int puntaje_jugador1 = 0;
    private int puntaje_jugador2 = 0;
    private String nombreJugador1;
    private String nombreJugador2;
    String puntaje = "";
    int PuntajeTemporal=0;

    public TennisGame1(String nombreJugador1, String nombreJugador2) {
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
    }

    public void ganoPunto(String nombreJugador) {
        if (nombreJugador == "jugador1")
            puntaje_jugador1 += 1;
        else
            puntaje_jugador2 += 1;
    }

    public String getPuntaje() {
       
        if (puntaje_jugador1 == puntaje_jugador2)
        {
            CompararPuntaje(); 
        }
        else if (puntaje_jugador1 >=4 || puntaje_jugador2 >=4)
        {
            DiferenciaEntreJugadores(); 
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) PuntajeTemporal = puntaje_jugador1;
                else { puntaje+="-"; PuntajeTemporal = puntaje_jugador2;}
                CompararPuntajeTemporal(); 
            }
        }
        return puntaje;
    }
    
    public String DiferenciaEntreJugadores() {
    	int DiferenciaEnResultados = puntaje_jugador1 - puntaje_jugador2;
        if (DiferenciaEnResultados==1) puntaje ="Ventaja jugador1";
        else if (DiferenciaEnResultados ==-1) puntaje ="Ventaja jugador2";
        else if (DiferenciaEnResultados>=2) puntaje = "Gana jugador1";
        else puntaje ="Gana jugador2";
    	return puntaje; 
    }
    
    public String CompararPuntaje() {
    	  switch (puntaje_jugador1) {
                case 0:
                    puntaje = "Amor-Todos";
                    break;
                case 1:
                    puntaje = "Quince-Todos";
                    break;
                case 2:
                    puntaje = "Treinta-Todos";
                    break;
                default:
                    puntaje = "Deuce";
                    break;

            }
        return puntaje; 
    }
    
    public String CompararPuntajeTemporal(){
    	  switch(PuntajeTemporal)
          {
              case 0:
                  puntaje+="Amor";
                  break;
              case 1:
                  puntaje+="Quince";
                  break;
              case 2:
                  puntaje+="Treinta";
                  break;
              case 3:
                  puntaje+="Cuarenta";
                  break;
          }
    	  return puntaje; 
    }
}
