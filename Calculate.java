public class Calculate{
    public static void main (String[] arg ) {
        System.out.println("Calculate ...///");

            //Сумма
            int first = Integer.valueOf(arg[0]);
            int second = Integer.valueOf(arg[1]);
            int summ = first + second;
            System.out.println("SUM.." + summ);

            //Разность
            float num1 = Float.valueOf(arg[0]);
            float num2 = Float.valueOf(arg[1]);
            float residual = num1 + num2;
            System.out.println("residual = " + residual);



    }
}

