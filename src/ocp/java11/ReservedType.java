package OCP.java11;

public class ReservedType {

    public static void main(String[] args) {
        //keywords can't be used for variable names
        int else =10;

        //var isn`t keyword
        int var = 10;

        //variable must be initialized
        var x = 30;
        var itemDescription = "Shirt";

        //For loop
        for (var i = 0; i < 10; i++) {

        }

        //Enhanced For loop
        for (var arg : args) {

        }

        //Can not do
        var price;//declaration
        var price = null;//initialize with null
        var price = 9.95,tax = 0.08; //compound declaration
        var prices = {9.95, 5, 3.50};//initialize array

    }
}
