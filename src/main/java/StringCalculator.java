//import org.omg.CORBA.SystemException;



import java.util.ArrayList;
import java.util.Arrays;

public class StringCalculator {
    public int add(String values) throws Exception { //"1,1"
        if(values.length() > 0) {
            int temp;
            String delimiter = null;
            ArrayList<String> delimeters = new ArrayList<>();
            try {
                temp = Integer.parseInt("" + values.charAt(0));
            } catch(Exception e) {

                if(("" + values.charAt(0)).equals("-")) {
                    delimiter = null;
                }else if (("" + values.charAt(0)).equals("[")){
                    values = values.replace("[","").replace("]","/");
                    ArrayList<String> lista = new ArrayList<>(Arrays.asList(values.split("/")));
                    if(lista.size() > 2){
                        for(String elem: lista){
                            if(!(isNumeric(""+elem.charAt(0)))){
                                delimeters.add(elem);
                            }
                        }
                    }else{
                        delimiter = lista.get(0);
                    }

                }
                else {
                    delimiter = "" + values.charAt(0);
                }
            }

            String[] splittedList = null;
            //ArrayList<String> splittedVarious = new ArrayList<>();
            if(delimiter != null) {
                if(delimiter.length()>1){
                    splittedList = values.substring(delimiter.length()+1).split(delimiter);
                }else{
                    splittedList = values.substring(1, values.length()).split(delimiter);
                }

            } else if (delimeters.size()!=0) {
                String valor = Arrays.asList(values.split("/")).get(delimeters.size());
                for (String lim: delimeters){
                    valor = valor.replace(lim,"/");
                }
                splittedList = valor.split("/");
            } else {
                splittedList = values.split("[,|\n]");
            }

            ArrayList<Integer> numberList = new ArrayList<Integer>();
            int accumulator = 0;
            for(String element: splittedList) {
                if (!(element.equals(""))){
                    int tempValue = Integer.parseInt(element);
                    if(tempValue < 0) {
                        throw new Exception("NegativeNumberException");
                    }
                    if(tempValue > 1000) {
                        continue;
                    }
                    numberList.add(tempValue);
                }



            }
            for(Integer number: numberList) {
                accumulator += number;
            }
            return accumulator;
        }
        return 0;
    }

    public static boolean isNumeric(String string) {
        int intValue;

        if(string == null || string.equals("")) {
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }
}