class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ttlgas=0;
        int ttlcost=0;

for(int i=0;i<gas.length;i++){
ttlgas+=gas[i];
ttlcost+=cost[i];
}

if(ttlgas<ttlcost) return -1;

int currtank=0;
int strtstation=0;

for(int i=0;i<gas.length;i++){
currtank+=gas[i]-cost[i];
if(currtank<0){
    strtstation=i+1;
    currtank=0;
}
}
return strtstation;
    }
}