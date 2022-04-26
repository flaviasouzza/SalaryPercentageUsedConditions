package Logicadeprogramacao;

public class SalaryPercentageOfConditions {

    public static void main (String []args) {

        float salary = 4700.50F;
        float percentage1 = 30;
        float percentage2 =15;
        float resultePercentage1 = salary * percentage1 / 100;
        float resultePercentage2 = salary * percentage2 / 100;

        if (salary > 4500.0F) {
            System.out.println("The salary is higher than 4500, so 30 percent of salary is " + resultePercentage1);
        } else  {
            System.out.println("The salary is less than 4500, so 15 percent of salary is " + resultePercentage2);

        }



    }
}
