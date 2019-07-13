package com.algorithm;

public class Divide {
    public int divide(int dividend, int divisor) {
        if (dividend <= Integer.MIN_VALUE && divisor <= -1) {
            return Integer.MAX_VALUE;
        }
        long dd = dividend;
        long dr = divisor;
        dd = Math.abs(dd);
        dr = Math.abs(dr);
        int i =0,divcount=1;
        while (dd>=dr){
            dd -= dr;
            i += divcount;
            if (dd<Math.abs(divisor))
                break;
            if (dd - dr<dr){
                dr =Math.abs(divisor);
                divcount =1;
                continue;
            }
            dr+=dr;
            divcount+=divcount;
        }
        if ((dividend <= 0 && divisor <= 0) || (dividend >= 0 && divisor >= 0)) {
            return i;
        } else {
            return -i;
        }
    }

    public static void main(String[] args) {
        Divide d = new Divide();
        System.out.println(d.divide(-2147483648, 1));
    }
}
