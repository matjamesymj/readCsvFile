package uk.co.allwebwork;

public abstract class Vehicle {
    private String Reg;
    private String Make;

    public Vehicle() {
    }

    public Vehicle(String reg, String make) {
        Reg = reg;
        Make = make;
    }



    public String getReg() {
        return Reg;
    }

    public void setReg(String reg) {
        Reg = reg;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String exampleSuperMethod(){
        return "Super vehicle";
    }
}
