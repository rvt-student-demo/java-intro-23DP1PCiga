package lv.rvt;

public class Timer {
   private ClockHand hundrethsOfSeconds;
   private ClockHand seconds;

   public Timer(){
    this.seconds =  new ClockHand(60);
    this.hundrethsOfSeconds = new ClockHand(100);

   }

   public void advance(){
    this.hundrethsOfSeconds.advance();

    if (this.hundrethsOfSeconds.value()==0){
        this.seconds.advance();

    }
   }

   public String toString(){
    return this.seconds + "seconds, "+ this.hundrethsOfSeconds + "hundredths of a second.";
   }
}
