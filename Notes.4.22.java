/* EXAMPLE OF DEPENDENCY INVERSION PRINCIPLE */

// INTERFACE
interface InvoiceGenrator {
    void tax();
}

// DETAILS DEPEND ON ABSTRACTION = CLASSES IMPLEMENT INTERFACES/ABSTRACT CLASSES
class taxUS implements InvoiceGenrator() {
    public void tax() {
        total *= 1.08;
    }
}

class taxUK implements InvoiceGenrator() {
    public void tax() {
        total *= royalTax;
    }
}

class taxIndia implements InvoiceGenrator() {
    public void tax() {
        total *= tax;
    }
}

// USES THE INTERFACE
class InvoiceService () {
    private InvoiceGenrator invoice;
    public InvoiceService (InvoiceGenrator invoice) {
        this.invoice = invoice;
    }
}

/* EXAMPLE OF BUILDER DESIGN PATTERN*/

// CAR IS THE PRODUCT
class Car() {
    private String brand;
    private String model;
    private String engine
    private Boolean sunroof;
    private Boolean airConditioner;

    // PRIVATE CONSTRUCTOR
    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.sunroof = builder.sunroof;
    }

    // CARBUILDER IS THE BUILDER 
    public static class CarBuilder {
        private String brand;
        private String model;
        private String engine
        private Boolean sunroof;
        private Boolean airConditioner; 

        // SETTER METHODS
        public CarBuilder setBrand (String brand) {
            this.brand = brand;
            return this;
        }
        
        public CarBuilder setSunroof (Boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        // BUILD IS THE BUILD METHOD
        public Car build() {
            return new Car(this);
        }
    }
}

