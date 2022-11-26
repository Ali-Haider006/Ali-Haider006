public class Account{
  double balance;
  int openingYear;
  String cnic;
Account(){}
Account(double bal){
if (bal > 0){
balance = bal;
}
}
