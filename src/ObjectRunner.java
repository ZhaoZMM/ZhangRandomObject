public class ObjectRunner {
    public static void main(String[] args){
        Object obj1 = new Object("blue",4,2.5);
        obj1.introduceCost();
        obj1.purchaseBandanas(5);
        obj1.useDiscount(0.2);
        obj1.purchaseBandanas(4);
        Object obj2 = new Object();
        System.out.println("The color of this bandana is "+obj2.getColorObj());
        System.out.println("There are "+obj2.getNumObj()+" bandanas.");
        System.out.println("The cost of this bandana is "+obj2.getCost());
    }
}
