package lv.rvt;

public class PaymentTerminal {
  private double money;  
  private int affordableMeals; 
  private int heartyMeals;  

  public PaymentTerminal() {
    double register = 1000;
  }
double change;
  public double eatAffordably(double payment) {
    double affordableMeal = 2.20;
    if (payment < affordableMeal){
        change = affordableMeal;
        return change;
    } else if (payment >= affordableMeal){
       return double change = payment - affordableMeal;
       return change;
    }else{
        return affordableMeal;}
  }

  public double eatHeartily(double payment) {
    double affordableMeal = 2.20;
    if (payment < affordableMeal){
        change = affordableMeal;
        return change;
    } else if (payment >= affordableMeal){
       return double change = payment - affordableMeal;
       return change;
    }else{
        return affordableMeal;}
    }

  public String toString() {
      return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
  }
}

