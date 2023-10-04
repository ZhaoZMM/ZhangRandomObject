public class Object {
    private String color;
    private int numObj;
    private double costEach;
    public Object(String color, int numObj, double cost){
        this.color = color;
        this.numObj = numObj;
        this.costEach = cost;
    }
    public Object(){
        color = "red";
        numObj = 2;
        costEach = 4.72;
    }
    public String getColorObj(){
        return color;
    }
    public int getNumObj(){
        return numObj;
    }
    public double getCost(){
        return costEach;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setNumObj(int numObj){
        this.numObj = numObj;
    }
    public void setCost(double cost){
        this.costEach = cost;
    }
    public void introduceCost(){
        System.out.println("1 "+color+" bandana will cost you $"+numObj);
    }
    public void purchaseBandanas(int numBuy){
        if (numBuy>numObj){
            System.out.println("Sorry, we don't have "+numBuy+" bandanas, we only have "+numObj+" bandanas in stock currently.");
        } else {
            System.out.println(numBuy+" "+color+" bandanas will cost you $"+numBuy*costEach);
        }
    }
    public void useDiscount(double discountDecimals){
        this.costEach = costEach*(1-discountDecimals);
        System.out.println("The discount has been applied.");
    }
}
