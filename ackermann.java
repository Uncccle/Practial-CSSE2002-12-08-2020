package Practial;

public class ackermann {

    public long ackermann(short m, short n){

        if(m == 0){

            return n + 1;

        }else if(m > 0 && n ==0){
            return ackermann((short) (m - 1), (short) 1);
        }else if (m > 0 && n > 0){
            return ackermann((short)(m - 1),
                    (short)ackermann(m, (short)(n -1)));
        }else {
            return 0;
        }

    }



}
