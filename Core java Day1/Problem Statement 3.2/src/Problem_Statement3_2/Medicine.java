package Problem_Statement3_2;

public class Medicine{

public void displayLabel(){

System.out.println("Company : Globex Pharma");
System.out.println("Address : Bangalore");

}}

class Tablet extends Medicine{
@Override public void displayLabel(){
System.out.println("store in a cool dry place");}

}

class Syrup extends Medicine{
@Override public void displayLabel(){
System.out.println("Consumption as directed by thephysician");
}}

class Ointment extends Medicine{
@Override public void displayLabel(){
System.out.println("for external use only");}

}