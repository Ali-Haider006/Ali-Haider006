public class Account{
  double balance;
  int openingYear;
  String cnic;
Account(){}
Account(double bal){
if (bal > 0){
balance = bal;
}
  
Public void display(){
System.out.println("Balance :"+balance);
 System.out.println("Year of Opening :"+openingYear);
 System.out.println("cnic :"+cnic); 
} 
}
