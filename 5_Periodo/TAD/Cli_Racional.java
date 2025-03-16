public class Cli_Racional {
    public static void main(String[] args) {
        N_Racional q1 = new N_Racional();
        q1.N_Rac_cria(1, 3);

        N_Racional q2 = new N_Racional();
        q2.N_Rac_cria(7, 21);

        System.out.println("---");
        System.out.println("q1 = " + q1 + " ; q2 = " + q2);
        System.out.println("---");

        System.out.println(q1 + " + " + q2 + " = " + q1.N_Rac_soma(q2));
        System.out.println(q1 + " - " + q2 + " = " + q1.N_Rac_subtrai(q2));
        System.out.println(q1 + " * " + q2 + " = " + q1.N_Rac_multiplica(q2));
        System.out.println(q1 + " / " + q2 + " = " + q1.N_Rac_divide(q2));
    }
}
