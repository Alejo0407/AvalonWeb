package util;

/**
 *
 * @author AMD
 */
public class CUtil {

    
    public static double monto(String flag, double numero){
        if (flag.equals("H")) {
            numero=numero*-1;
        }
        return numero;
        
    }
    
    public static String formatosec(int s) {
        String sec= String.valueOf(s);
        int i = 0;
        i = sec.length();
        while (i < 5) {
            sec = "0" + sec;
            i++;
        }
        return sec;
    }

    public static String periodoañomes(String periodo) {
        periodo = periodo.substring(periodo.length() - 4, periodo.length()) + periodo.substring(periodo.length() - 6, periodo.length() - 4);
        return periodo;
    }

    public static String convierteperiodo(String periodo) {
        periodo = periodo.substring(5, 7) + periodo.substring(0, 4);
        return periodo;
    }

    public static String traelocacion(String suc) {
        String loc;
        loc = suc.substring(suc.length() - 2, suc.length());
        return loc;
    }

    public static String formatoNumero(int i) {
        String num = "";
        if (i < 10) {
            num = "0" + i;
        } else {
            num = "" + i;
        }
        return num;
    }

    public static String formatNum3dig(int i) {
        String num = "";
        if (i < 10) {
            num = "00" + i;
        } else if (i < 100) {
            num = "0" + i;
        } else {
            num = "" + i;
        }
        return num;
    }

    /*
     *  private DecimalFormat dosDig = new DecimalFormat("00");
     *   cca = dosDig.format(Integer.valueOf(cca) + 1);
     */
    public static String formatoMes(String periodo) {
        String mesLetras = "";
        String mesb = "";
        mesb = periodo.substring(0, 2);
        int mes = Integer.valueOf(mesb);
        switch (mes) {
            case 1:
                mesLetras = "ENERO";
                break;
            case 2:
                mesLetras = "FEBRERO";
                break;
            case 3:
                mesLetras = "MARZO";
                break;
            case 4:
                mesLetras = "ABRIL";
                break;
            case 5:
                mesLetras = "MAYO";
                break;
            case 6:
                mesLetras = "JUNIO";
                break;
            case 7:
                mesLetras = "JULIO";
                break;
            case 8:
                mesLetras = "AGOSTO";
                break;
            case 9:
                mesLetras = "SETIEMBRE";
                break;
            case 10:
                mesLetras = "OCTUBRE";
                break;
            case 11:
                mesLetras = "NOVIEMBRE";
                break;
            case 12:
                mesLetras = "DICIEMBRE";
                break;
        }
        return mesLetras;
    }

    public static String getAnio(String periodo) {
        String aniob = "";

        aniob = periodo.substring(2, 6);

        return aniob;
    }

    public static int getNroMes(String periodo) {
        String mesb = "";

        mesb = periodo.substring(0, 2);
        int mes = Integer.valueOf(mesb);

        return mes;
    }

    public static String getFechaDMA(String fechas) {
        String dma = "";
        char[] arreglodma;

        arreglodma = fechas.toCharArray();

        for (int i = 0; i < fechas.length(); i++) {
            if (arreglodma[i] != '/') {
                dma += arreglodma[i];
            }
        }

        return dma;
    }
}
