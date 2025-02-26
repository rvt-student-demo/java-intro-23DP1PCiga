package lv.rvt;

public class Money {
    private final int euros;
        private final int cents;
    
        public Money(int euros, int cents) {
            this.euros = euros;
            this.cents = cents;
        }
    
        public int euros() {
            return euros;
        }
    
        public int cents() {
            return cents;
        }
    
        public String toString() {
            String zero = "";
            if (cents <= 10) {
                zero = "0";
            }
    
            return euros + "." + zero + cents + "e";
     }
    
     // money plus
     public Money plus(Money addition) {
        Money newMoney = new Money(addition.euros + this.euros , addition.cents+this.cents); // create a new Money object that has the correct worth

        return newMoney;
    }

    public boolean lessThan(Money compared){
    if (this.euros > compared.euros){
        if(this.cents == 99){
            return false;
        }
       return false;
      }else{
        return true;
      }
         
    }
}