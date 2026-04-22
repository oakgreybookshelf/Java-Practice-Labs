interface InvoiceGenrator {
    void tax();
}

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

class InvoiceService () {
    private InvoiceGenrator invoice;
    public InvoiceService (InvoiceGenrator invoice) {
        this.invoice = invoice;
    }
}


class Car() {
    private String brand;
    private String model;
    private String engine
    private Boolean sunroof;
    private Boolean airConditioner;
    
    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.sunroof = builder.sunroof;
    }
    
    public static class CarBuilder {
        private String brand;
        private String model;
        private String engine
        private Boolean sunroof;
        private Boolean airConditioner; 
        
        public CarBuilder setBrand (String brand) {
            this.brand = brand;
            return this;
        }
        
        public CarBuilder setSunroof (Boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }
        
        public Car build() {
            return new Car(this);
        }
    }
}

