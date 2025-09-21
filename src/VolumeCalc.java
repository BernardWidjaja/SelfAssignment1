public class VolumeCalc {
    public static void main(String[] args) {
        // Diameters in miles
        double earthDiameter = 7600.0;
        double sunDiameter = 865000.0;

        // Radii in miles
        double earthRadius = earthDiameter / 2.0;
        double sunRadius = sunDiameter / 2.0;

        // Volume formula: (4/3) * π * r³
        double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);

        // Ratio of Sun's volume to Earth's volume
        double volumeRatio = sunVolume / earthVolume;

        // Output results
        System.out.println("The volume of the Earth is " + earthVolume + " cubic miles.");
        System.out.println("The volume of the Sun is " + sunVolume + " cubic miles.");
        System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " + volumeRatio);
    }
}