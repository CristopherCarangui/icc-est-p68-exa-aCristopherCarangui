package controllers;

import models.League;

public class LeagueController {

    /**
     * FILA B - Implementar este metodo con Insertion Sort descendente.
     * Ordena el arreglo de ligas de mayor a menor segun getTotalActiveGoals().
     *
     * Nombre exacto requerido: sortInsertionDesc
     *
     * @param leagues Arreglo de ligas a ordenar
     */
    public void sortInsertionDesc(League[] leagues) {
        for (int i = 1; i < leagues.length; i++) {
            League valorLeague = leagues[i];
            int j = i - 1;
            while (j >= 0 && leagues[j].getTotalActiveGoals() < valorLeague.getTotalActiveGoals()) {
                leagues[j - 1] = leagues[j];
                j--;
            }
            leagues[j - 1] = leagues[j];
        }
    }

    /**
     * TODOS - Implementar busqueda binaria por goles activos totales.
     *
     * El arreglo recibido ya fue ordenado con el metodo de su fila.
     * Implemente la busqueda conforme al orden que aplico:
     * - Fila A: arreglo ascendente, use logica de busqueda ascendente.
     * - Fila B: arreglo descendente, use logica de busqueda descendente.
     *
     * Nombre exacto requerido: binarySearchByTotalActiveGoals
     *
     * @param leagues          Arreglo de ligas ya ordenado
     * @param totalActiveGoals Total de goles activos a buscar
     * @return La liga encontrada, o null si no existe
     */
    public League binarySearchByTotalActiveGoals(League[] leagues, int totalActiveGoals) {
        int inicio = 0;
        int fin = leagues.length - 1;
        int medio = 0;
        //while (inicio <= fin) {
         //   medio = inicio + (fin - inicio) / 2;
          //  if (leagues[medio].getTotalActiveGoals() == totalActiveGoals) {
           //     return leagues[medio];
            //} else if (leagues[medio].getTotalActiveGoals() > totalActiveGoals) {
              //  return leagues[medio] + 1;
           // } else {
               // return leagues[medio] - 1;
            //}

        }
        return null;
    }

    /**
     * Imprime el arreglo de ligas en consola.
     *
     * @param leagues Arreglo de ligas a imprimir
     */
    public void printLeagues(League[] leagues) {
        for (League equipos : leagues) {
            System.out.println(equipos);
        }
    }
}
