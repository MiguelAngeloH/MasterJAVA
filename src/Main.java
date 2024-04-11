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
            System.out.println("arreglo ="+ array[i]);
        }

    }
}