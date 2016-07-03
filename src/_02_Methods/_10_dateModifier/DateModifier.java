package _02_Methods._10_dateModifier;

import java.util.Calendar;
import java.util.Date;


public class DateModifier {
    private long difference;

    public DateModifier() {
        this.difference = 0;
    }

    public long getDifference() {
        return this.difference;
    }

    void calculateDifference(String startDate, String endDate){
        String[] s = startDate.split("\\s+");
        int sYear = Integer.parseInt(s[0]);
        int sMonth = Integer.parseInt(s[1]);
        int sDay = Integer.parseInt(s[2]);
        String[] e = endDate.split("\\s+");
        int eYear = Integer.parseInt(e[0]);
        int eMonth = Integer.parseInt(e[1]);
        int eDay = Integer.parseInt(e[2]);
        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        start.set(sYear, sMonth, sDay);
        end.set(eYear, eMonth, eDay);
        Date startDay = start.getTime();
        Date endDay = end.getTime();
        long sTime = startDay.getTime();
        long eTime = endDay.getTime();
        long diffTime = eTime - sTime;
        this.difference = diffTime / (1000 * 60 * 60 * 24);
    }
}
