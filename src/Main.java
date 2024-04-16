//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      String trenmaya = "trenmaya";
        System.out.println("trenmaya.length = "+trenmaya.length());
        System.out.println("trenmaya.toChartArray()="+trenmaya.toCharArray());
char [] array = trenmaya.toCharArray();
int largo = array.length;
        System.out.println("Largo = " +largo);
        for (int i = 0; i < largo; i++) {
            System.out.println("arreglo = "+ array[i]);
        }
        System.out.println("trenmaya = "+ trenmaya.split("a"));
        System.out.println("\n");

        String[] array02 = trenmaya.split("a");
        int largo02 = array02.length;
        for (int j = 0; j <largo02 ; j++) {
            System.out.println(array02[j]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\.");
        //String[] archivoArr = archivo.split("[a]");
        largo02 = archivoArr.length;
        System.out.println("largo02"+largo02);
        for (int j = 0; j <largo02 ; j++) {
            System.out.println(archivoArr[j]);
        }
        System.out.println("extension=" +archivoArr[largo02-1] );
    }
}