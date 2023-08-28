import static java.lang.Math.max;

public class StepTracker {
   private int stepTracker;
   private int steps;
   private int days;
   private int activeDays;

    public StepTracker(int s){
        stepTracker =s;
        steps=0;
        days=0;
        activeDays=0;
    }

    public int getDays(){
        return days;
    }
    public int getStepsForActiveDay(){
        return stepTracker;
    }
    public int getTotalSteps(){
        return steps;
    }
    public int getActiveDays(){
        return activeDays;
    }
    public void addDailySteps(int s){
        steps+=s;
        days++;
        if(s>=stepTracker){
            activeDays+=1;
        }
    }
    public double averageSteps(){
        return steps/max(days, 1);
    }
    public int activeDays(){
        return activeDays;
    }
}
