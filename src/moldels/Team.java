package moldels;

import java.util.Arrays;

public class Team {
  private String name;
  private Player[] Jugadores;

  public Team() {

  }

  

  public Team(String name, Player[] jugadores) {
    this.name = name;
    Jugadores = jugadores;
  }



  public String getName() {
    return name;
  }



  public void setName(String name) {
    this.name = name;
  }



  public Player[] getJugadores() {
    return Jugadores;
  }



  public void setJugadores(Player[] jugadores) {
    Jugadores = jugadores;
  }



  @Override
  public String toString() {
    return "Team [name=" + name + ", Jugadores=" + Arrays.toString(Jugadores) + "]";
  }

  

}
