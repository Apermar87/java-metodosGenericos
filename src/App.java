public class App {
    public static void main(String[] args) throws Exception {
        System.out.printf("Máximo entre %d y %d es %d\n", 10, 20, MaximoMinimo.maximo(10, 20));

        System.out.printf("Máximo entre %.2f y %.2f es %.2f\n",12.56, 28.71,MaximoMinimo.maximo( 12.56, 28.71 ));

        System.out.printf("Máximo entre %s y %s es %s\n\n", "Tableta", "Computador", MaximoMinimo.maximo("Tableta", "Computador"));

        System.out.printf("Mínimo entre %d y %d es %d\n", 10, 20, MaximoMinimo.minimo( 10, 20 ));

        System.out.printf("Mínimo entre %.2f y %.2f es %.2f\n", 12.56, 28.71, MaximoMinimo.minimo( 12.56, 28.71 ));

        System.out.printf("Mínimo entre %s y %s es %s\n", "Tableta", "Computador", MaximoMinimo.minimo("Tableta", "Computador"));
    }
}
