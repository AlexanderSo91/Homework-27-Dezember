package Transport;

public class Car {
    public static void main(String[] args) {

    }
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private String transmission;
    private final String body;
    private String registrationNumber;
    private final int seats ;
    private boolean tyres;
    private final String country;


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBody() {
        return body;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isTyres() {
        return tyres;
    }

    public void setTyres(boolean tyres) {
        this.tyres = tyres;
    }

    public String getCountry() {
        return country;
            }

    public Car(String brand, String model, double engineVolume,String color, int year, String country,String body, int seats, String transmission,  String registrationNumber, boolean tyres) {
        this.tyres = true;
        this.registrationNumber = "1234";
        this.transmission = "МКПП";
        if (body == null) {

        }
        this.body = "седан";
        this.seats = 5;
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }


    }

}


