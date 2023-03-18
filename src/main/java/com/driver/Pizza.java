package com.driver;

public class Pizza {

    public int totalPrice;
    public int basePrice;
    public int cheesePrice;
    public int toppingsPrice;
    public int bagPrice;

    public boolean isCheeseAdded;
    public boolean isToppingsAdded;
    public boolean isBagAdded;
    public boolean isBillGenerated;

    public String bill;

    public Pizza(Boolean isVeg){
        if(isVeg){
            basePrice=300;
            toppingsPrice=70;
        }
        else{
            basePrice=400;
            toppingsPrice=120;
        }
        bagPrice=20;
        cheesePrice=80;

        isBagAdded=false;
        isBillGenerated=false;
        isCheeseAdded=false;
        isToppingsAdded=false;

        totalPrice=basePrice;

        bill = "Base Price Of The Pizza: "+ basePrice + "\n";

    }

    public int getPrice(){

        return totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            totalPrice=totalPrice+cheesePrice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
       if(isToppingsAdded==false){
           totalPrice=totalPrice+toppingsPrice;
           isToppingsAdded=true;
       }
    }

    public void addTakeaway(){
        // your code goes here
        if (isBagAdded==false){
            totalPrice=totalPrice+bagPrice;
            isBagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here

        if(isBillGenerated==false){

            if(isCheeseAdded==true){
               bill=bill+"Extra Cheese Added: "+cheesePrice+"\n";
            }
            if(isToppingsAdded==true){
                bill=bill+"Extra Toppings Added: "+toppingsPrice+"\n";
            }
            if(isBagAdded==true){
                bill=bill + "Paperbag Added: "+bagPrice + "\n";
            }
            bill= bill + "Total Price: "+totalPrice+"\n";

            isBillGenerated=true;
        }
        return bill;
    }
}
