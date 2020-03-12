package oop.inheritance;

public class Resident extends ITaxable implements IResident  {
    public float getTaxDiscountRate(){
        return 0;
    }
    public float getIncomeTaxRate(){
        return 0;
    }
}
