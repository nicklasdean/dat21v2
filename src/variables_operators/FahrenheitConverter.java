package variables_operators;

public class FahrenheitConverter {
    public static void main(String[] args){
        //Convert 100 Fahrenehit to the same amount in Celcius

        //Start with the temperature in Fahrenheit (e.g., 100 degrees).
        int startTemperatureInFahrenheit = 100;

        //Subtract 32 from this figure (e.g., 100 - 32 = 68).
        int middlePoint = startTemperatureInFahrenheit - 32;

        //Divide your answer by 1.8 (e.g., 68 / 1.8 = 37.78)
        double result = middlePoint / 1.8;

        System.out.println(result);

    }
}
