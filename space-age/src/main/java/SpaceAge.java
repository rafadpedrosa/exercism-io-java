import java.math.BigDecimal;

class SpaceAge {
    final double yearInSecondsEarth = 31557600;
    private double yearsInEarth;


    SpaceAge(double seconds) {
        this.yearsInEarth = (seconds / yearInSecondsEarth);
    }

    double onEarth() {
        return yearsInEarth;
    }

    double onMercury() {
        return yearsInEarth / 0.2408467;
    }

    double onVenus() {
        return yearsInEarth / 0.61519726;
    }

    double onMars() {
        return yearsInEarth / 1.8808158;
    }

    double onJupiter() {
        return yearsInEarth / 11.862615;
    }

    double onSaturn() {
        return yearsInEarth / 29.447498;
    }

    double onUranus() {
        return yearsInEarth / 84.016846;
    }

    double onNeptune() {
        return yearsInEarth / 164.79132;
    }

}
