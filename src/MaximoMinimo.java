public class MaximoMinimo {

    public static <E extends Comparable <E>> E maximo (E x, E y){
        if (y.compareTo(x)>0){
            return y;
        } else {
            return x;
        }
    }

    public static <E extends Comparable <E>> E minimo (E x, E y){
        if (y.compareTo(x)<0){
            return y;
        } else {
            return x;
        }
    }
}
