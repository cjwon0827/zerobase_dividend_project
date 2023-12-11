package zerobase.dividend.dto.constants;

public enum Month {
    JAN("Jan", 1),
    FEB("Feb", 2),
    MAR("Mar", 3),
    APR("Apr", 4),
    MAY("May", 5),
    JUN("Jun", 6),
    JUL("Jul", 7),
    AUG("Aug", 8),
    SEP("Sep", 9),
    OCT("Oct", 10),
    NOV("Nov", 11),
    DEC("Dec", 12);

    private String str;
    private int number;

    Month(String str, int number){
        this.str = str;
        this.number = number;
    }

    public static int strToNumber(String str){
        for(var m : Month.values()){
            if(m.str.equals(str)){
                return m.number;
            }
        }
        return -1;
    }
}
