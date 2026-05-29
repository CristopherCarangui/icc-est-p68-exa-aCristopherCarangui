package moldels;

import java.util.Arrays;

public class League {
  private String name;
  private Team[] Equipos;

  public League() {

  }

  

  public League(String name, Team[] equipos) {
    this.name = name;
    Equipos = equipos;
  }

  

  public int getTotalActiveGoals() {
    int suma = 0;
    for (Team equips : Equipos) {
      for (Player pl : equips.getJugadores()) {
        if (pl.isActive()) {
          suma += pl.getGoals();
        }
      }
    }
    return suma;
  }



  public String getName() {
    return name;
  }



  public void setName(String name) {
    this.name = name;
  }



  public Team[] getEquipos() {
    return Equipos;
  }



  public void setEquipos(Team[] equipos) {
    Equipos = equipos;
  }



  @Override
  public String toString() {
    return "League [name=" + name + ", Equipos=" + Arrays.toString(Equipos) + "]";
  }

  
}