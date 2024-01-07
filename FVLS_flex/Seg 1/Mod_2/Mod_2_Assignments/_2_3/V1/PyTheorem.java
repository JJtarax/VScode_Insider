package FVLS_flex.Mod_2.Mod_2_Assignments._2_3.V1;

public class PyTheorem {
    public static void main(String[] args) {
        double x_1 = 20;
        double side_1_1 = Math.pow(x_1, 2);
        double y_1 = 13;
        double side_2_1 = Math.pow(y_1, 2);
        double p_1 = side_1_1 + side_2_1;
        double h_1 = Math.sqrt(p_1);
        System.out.println("Triangle 1 \tSide 1 : "+ x_1 +" \tSide 2 :" + y_1 + "\tHypotenuse : " + h_1);

        double x_2 = 9;
        double side_1_2 = Math.pow(x_2, 2);
        double y_2 = 15;
        double side_2_2 = Math.pow(y_2, 2);
        double p_2 = side_1_2 + side_2_2;
        double h_2 = Math.sqrt(p_2);
        System.out.println("Triangle 2 \tSide 1 : "+ x_2 +" \tSide 2 :" + y_2 + "\tHypotenuse : " + h_2);
    }
}
