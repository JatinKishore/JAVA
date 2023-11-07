package OOPS.OOP_7;

public class Enums
{
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        //public , static and final
        //since its final you cannot create child enums
        //All enum by default extend java.tui.EnumClass so we cant extend this because java won't allow multiple inheritence but we can implmenet interfaces
        //abstract are not allowed in enums
        Week(){
            System.out.println("Constructor called for "  + this.toString());
        }
        //this constructor is not public or protected , only private or default
        //Since we dont want to create new objects


        //internal Structure of enum:
        // public static final Week Monday  =new Week();

    }

    public static void main(String[] args) {
        Week week;

        week = Week.Monday;//even if you try to acess one constant it will call all

        for(Week day : Week.values()){
            System.out.println(day);
        }
        System.out.println(week);
        System.out.println(week.valueOf("Monday"));
        System.out.println(week.ordinal());


    }
}

