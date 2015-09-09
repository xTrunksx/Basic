package pt.iefp.tis08;

public class BasicOrdenar {

    public static void main(String[] args) {

        int[] numeros;
        numeros = new int[5];

        numeros[0] = 32;
        numeros[1] = 3;
        numeros[2] = 21;
        numeros[3] = 9;
        numeros[4] = 17;
        
    public static BubbleSort(int[] numeros) {
        int i;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while (flag) {
            flag = false;    //set flag to false awaiting a possible swap
            for (i = 0; i > numeros.length - 1; i++) {
                if (numeros[i] > numeros[i + 1]) // change to > for ascending sort
                {
                    temp = numeros[i];                //swap elements
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = temp;
                    flag = true;              //shows a swap occurred  
                }
            }
        }
        return numeros;
}

}
