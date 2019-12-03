/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hillclimbing;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Barış Şenyerli
 */
public class Driver {
    private ArrayList<City> initialCities = new ArrayList<City>(Arrays.asList(
            new City("Boston", 42.3601, -71.0589),
            new City("Houston", 29.7604, -95.3698),
            new City("Austin", 30.2672, -97.7431),
            new City("San Francisco", 37.7749, -122.4194),
            new City("Denver", 39.7392, -104.9903),
            new City("Los Angeles", 35.0522, -118.2437),
            new City("Chicago", 41.8781, -87.6298),
            new City("New York", 40.7128, -74.0059),
            new City("Dallas", 32.7767, -96.7970),
            new City("Seattle", 47.6062, -122.3321)
            
            
    ));
    public static void main(String[] args) {
        Driver driver = new Driver();
        Route route = new Route(driver.initialCities);
        printHeading(route);
        ArrayList<Route> routes = new RRHillClimbing().findShortestRoutes(route);
        routes.stream().forEach(x -> System.out.println(Arrays.toString(x.getCities().toArray())+ " |      "+x.getTotalStringDistance()));
        System.out.println("\nShortest Route: "+ Arrays.toString(routes.get(0).getCities().toArray()));
        System.out.println("w/ Distance: "+ routes.get(0).getTotalStringDistance());
    }
    public static void printHeading(Route route) {
        String headingColumn1 = "Route";
        String reaminingHeadingColumns = "Distance (in miles) ";
        int cityNamesLength = 0;
        for(int x = 0; x < partialLength; x++) System.out.print(" ");
        System.out.print(headingColumn1);
        for(int x = 0; x < partialLength; x++) System.out.print(" ");
        if((arrayLength % 2) == 0)System.out.print(" ");
        System.out.println(" | "+remainingHeadingColumns);
        cityNamesLength += remainingHeadingColumns.length() + 3;
        for(int x = 0; x < cityNameLength+route.getCities().size() * 2; x++)System.out.print("-");
        System.out.println("");
     }
}
