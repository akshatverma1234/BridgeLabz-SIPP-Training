package Day1_ProgrammingElements;

import java.util.*;

public class EarthVolume {
    public static void main(String[] args) {
        double rkm = 6378;
        double vkm = (4.0 / 3) * Math.PI * Math.pow(rkm, 3);
        double rMiles = rkm / 1.6;
        double volMiles = (4.0 / 3) * Math.PI * Math.pow(rMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + vkm + " and cubic miles is " + volMiles);
    }
}
