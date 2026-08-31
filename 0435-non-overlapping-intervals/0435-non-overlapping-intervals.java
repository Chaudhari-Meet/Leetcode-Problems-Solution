class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        int n = intervals.length;

        Arrays.sort(intervals, Comparator.comparingInt(row -> row[1]));

        int c=1;

        int k=0;

        for(int i=1;i<intervals.length;i++){

            if(intervals[i][0] >= intervals[k][1]){

                c++;

                k=i;

            }
        }
        return n-c;
    }
}