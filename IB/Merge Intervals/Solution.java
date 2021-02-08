/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        
        ArrayList<Interval> output = new ArrayList<Interval>();
         
         int len = intervals.size();
         int i=0;
         while (i < len && newInterval.start > intervals.get(i).end) {
             output.add(intervals.get(i));
             i++;
         }
         
         // For the overlapping ranges, compute the minimum start point and maximum end point of the range
         while (i < len && newInterval.end >= intervals.get(i).start) {
             newInterval.start = newInterval.start<intervals.get(i).start?newInterval.start:intervals.get(i).start;
             newInterval.end = newInterval.end>intervals.get(i).end?newInterval.end:intervals.get(i).end;
             i++;
         }
         output.add(newInterval);
         
         // Add the points after we encounter the interval
         while (i < len) {
             output.add(intervals.get(i));
             i++;
         }
         return output;
        
    }
}
