package org.example;

public class Trading {
    private int id;
    private String name;
    private double amount;
    private double returnAmount;
    private boolean isPaid;

    public Trading(){
    }

    public Trading(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.returnAmount = returnAmount;
        this.isPaid = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(double returnAmount) {
        this.returnAmount = returnAmount;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double interestAmount (){
      return returnAmount = (amount + amount * 0.3);
    }

    public String isPaid(){
        if (isPaid){
            return "Not Paid";
        }
        return "Paid";
    }

    public String toString(){
       return  "\n" +
               "Investor: " + name + "\n" +
               "Investment: $" + amount + "\n" +
               "Investment returns: $" + interestAmount() +
               "Status: " + (isPaid ? "Paid" : "Not Paid");
    }
}
