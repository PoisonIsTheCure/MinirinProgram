
public class PrincipalProgram {
    public static void main(String[] args){
        System.out.println("Program First code !!");
        TestModule.datetime();
    }
}

class TestModule {
    static void datetime(){
        System.out.println("#### Testing DateTime Module : ");
        // Creating two differents dates
        DateTime first = new DateTime();
        DateTime second = new DateTime();

        // first datetime into
        String date1 = first.getDateTime();
        second.strToDateTime("22-06-29-17-00");
        long minutes = DateTime.SubstractDT(first,second);
        String diff = DateTime.SubTostr(first,second);
        String date2 = second.getDateTime();
        System.out.println(date1);
        System.out.println(date2);
        System.out.println("Difference in Minutes : "+minutes);
        System.out.println("Difference in HH:mm : "+diff);

    }
}