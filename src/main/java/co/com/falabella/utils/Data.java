package co.com.falabella.utils;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class Data {
    private  static ArrayList<Map<String, String>> data= new ArrayList<>();

    public static ArrayList<Map<String, String>> extractTo(){
        try {
            data= Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx","SearchProduct");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}
