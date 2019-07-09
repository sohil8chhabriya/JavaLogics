package com.logics;

public class LogicMain{
    public int solution(int[] A) {
        int solutionNo = 1;
        int check = 1;
        for(int i=0; i<A.length; i++) {
            int tempCheck = 0-A[i];
            if(check>tempCheck && tempCheck<(solutionNo-0)) {
                tempCheck = check;
                solutionNo = solutionNo + 1;
            }
        }
        return solutionNo;
    }
}
