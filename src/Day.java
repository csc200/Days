/**
 * Created by tkanchanawanchai6403 on 4/26/2017.
 */
public class Day {
    private String [] days = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
    private int day;

    /**
     *
     */
    public Day() {
        day=0;
    }

    /**
     *
     * @param day
     */
    public Day(int day) {
        this.day=day;
    }

    /**
     * To get the current day
     * @return returns current day
     */
    public String getDay(){
        return days[day];
    }

    public void setDay(int day){
        this.day=day;
    }

    public String nextDay(){
        return days[(day+1)%7];
    }

    public String toString() {
        return days[day];
    }
}
