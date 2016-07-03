package _03_staticMembers._06_planckConstant;

/**
 * Created by User on 28.06.2016.
 */
public class Calculation {
    private static final Double DEFFAULT_PLANCK_CONSTANT = 6.62606896e-34;
    private static final Double DEFFAULT_PI = 3.14159;

    private static double planckConstant;
    private static double pi;

    static {
        planckConstant = DEFFAULT_PLANCK_CONSTANT;
        pi = DEFFAULT_PI;
    }

    public static double reducedPlanckConstant(){
        double rpc = planckConstant / (2 * pi);
        return  rpc;
    }
}
