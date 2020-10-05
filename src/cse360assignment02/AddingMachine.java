package cse360assignment02;

public class AddingMachine {
    private int total;
    private String print;

    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    public int getTotal () {
        return total;
    }

    public void add (int value) {
        if(print == null){
            print = total + " + " + value;
        }else{
            print += " + " + value;
        }
        total = total + value;
    }

    public void subtract (int value) {
        if(print == null){
            print = total + " - " + value;
        }else{
            print += " - " + value;
        }
        total = total - value;
    }

    public String toString () {
        if(print == null){
            return "0";
        }else {
            return print;
        }
    }

    public void clear() {
        print = null;
        total = 0;
    }
}