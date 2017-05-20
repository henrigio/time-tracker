package pro.jtaylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;
    /*method add
    *@paremtre 
    *
    */
    public void add(TimeEntry entry) {
        entries.add(entry);
    }
   /*method add
    *@paremtre 
    *
    */
    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }
   /*method add
    *@paremtre 
    *
    */
    public int size() {
        return entries.size();
    }
   /*method add
    *@paremtre 
    *
    */
    public TimeEntry get(int index) {
        return entries.get(index);
    }
}

