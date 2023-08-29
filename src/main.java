
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel de Jesus Martinez Hernandez
 * Alura Latam
 */
public class main {

    public static void main(String[] Args) {
        String valorCadena = "";
        double valor = 0.0, resultado = 0.0;
        int caso = 0, contInicial = 0, x = 1;
        String vm = "";

        //Monedas
        moneda dollar = new moneda();
        dollar.setNombre("Dollars");
        dollar.setProcedencia("Estadounidence");
        dollar.setValor(17.053829);
        moneda euro = new moneda();
        euro.setNombre("Euros");
        euro.setProcedencia("Europeo");
        euro.setValor(18.557313);
        moneda libras = new moneda();
        libras.setNombre("Libras");
        libras.setProcedencia("Esterlinas");
        libras.setValor(21.715499);
        moneda yen = new moneda();
        yen.setNombre("Yenes");
        yen.setProcedencia("Japones");
        yen.setValor(0.11728729);
        moneda won = new moneda();
        won.setNombre("Wones");
        won.setProcedencia("Sul-Koreano");
        won.setValor(0.0127260);
        //Temperaturas
        temperatura celsius = new temperatura();
        celsius.setNombre("Grados Celsius");
        celsius.setPuntoCeroAbsoluto(-273.15);
        celsius.setPuntoEbullicion(100);

        temperatura fahrenheit = new temperatura();
        fahrenheit.setNombre("Grados Fahrenheit");
        fahrenheit.setPuntoCeroAbsoluto(-459.67);
        fahrenheit.setPuntoEbullicion(212);

        temperatura kelvin = new temperatura();
        kelvin.setNombre("Grados Kelvin");
        kelvin.setPuntoCeroAbsoluto(0);
        kelvin.setPuntoEbullicion(373.15);
        ///procedimientos
        do {//repetir el ciclo si el usuaario queire hacer otra consulta
            Object[] conversor = {"Conversor de Moneda", "Temperatura"};
            Object opcionMenu = JOptionPane.showInputDialog(null, "Elige la opcion", "Menu Principal", JOptionPane.QUESTION_MESSAGE, null, conversor, conversor[0]);
            if (opcionMenu == conversor[0]) {
                caso = 1;
            } else if (opcionMenu == conversor[1]) {
                caso = 2;
            } else if (opcionMenu == null) {
                JOptionPane.showConfirmDialog(null, "Programa finalizado", "Mensaje", JOptionPane.DEFAULT_OPTION);

                System.exit(0);
            }
            switch (caso) {
                case 0:
                    JOptionPane.showInputDialog("Error algo salio mal");
                    break;
                case 1:
                    do {
                        try {
                            valorCadena = JOptionPane.showInputDialog(null, "Introduce el valor a convertir", "Convercion de Monedas", JOptionPane.QUESTION_MESSAGE);
                            valor = Double.parseDouble(valorCadena);
                            x = 0;
                        } catch (Exception e) {
                            if (e instanceof NumberFormatException) {
                                JOptionPane.showMessageDialog(null, "Se ingreso un dato no permitido por favor intentelo de nuevo", "Error ingreso de dato incorrecto", JOptionPane.ERROR_MESSAGE);
                            } else if (e instanceof NullPointerException) {
                                x = 3;
                                break;
                            }
                            System.out.println(e);

                        }
                    } while (x == 1);
                    while (x == 0) {
                        Object[] monedas = {"Dolares a Pesos Mexicanos", "Euros a Pesos Mexicanos", "Libras a Pesos Mexicanos", "Yenes a Pesos Mexicanos", "Wones a Pesos Mexicanos", "Pesos Mexicanos a Dolares", "Pesos Mexicanos a Euros", "Pesos Mexicanos a Libras", "Pesos Mexicanos a Yenes", "Pesos Mexicanos a Wones"};
                        Object opcionMoneda = JOptionPane.showInputDialog(null, "Elige la moneda a la que quieras convertir", "Convercion de Monedas", JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[0]);
                        for (Object moneda : monedas) {
                            if (opcionMoneda == moneda) {
                                vm = (String) opcionMoneda;
                                switch (vm.toLowerCase()) {
                                    default:
                                        System.out.println(vm);
                                        break;
                                    case "dolares a pesos mexicanos":
                                        resultado = dollar.getValor() * valor;
                                        mostrarResultado(resultado, "$", "Pesos Mexicanos");
                                        contInicial = terminarPrograma();
                                        x = validarDato(contInicial);
                                        break;
                                    case "euros a pesos mexicanos":
                                        resultado = euro.getValor() * valor;
                                        mostrarResultado(resultado, "$", "Pesos Mexicanos");
                                        contInicial = terminarPrograma();
                                        x = validarDato(contInicial);
                                        break;
                                    case "libras a pesos mexicanos":
                                        resultado = libras.getValor() * valor;
                                        mostrarResultado(resultado, "$", "Pesos Mexicanos");
                                        contInicial = terminarPrograma();
                                        x = validarDato(contInicial);
                                        break;
                                    case "yenes a pesos mexicanos":
                                        resultado = yen.getValor() * valor;
                                        mostrarResultado(resultado, "$", "Pesos Mexicanos");
                                        contInicial = terminarPrograma();
                                        x = validarDato(contInicial);
                                        break;
                                    case "wones a pesos mexicanos":
                                        resultado = won.getValor() * valor;
                                        mostrarResultado(resultado, "$", "Pesos Mexicanos");
                                        contInicial = terminarPrograma();
                                        x = validarDato(contInicial);
                                        break;
                                    case "pesos mexicanos a dolares":
                                        resultado = valor / dollar.getValor();
                                        mostrarResultado(resultado, "$", dollar.getNombre());
                                        contInicial = terminarPrograma();
                                        x = validarDato(contInicial);
                                        break;
                                    case "pesos mexicanos a euros":
                                        resultado = valor / euro.getValor();
                                        mostrarResultado(resultado, "€", euro.getNombre());
                                        contInicial = terminarPrograma();
                                        x = validarDato(contInicial);
                                        break;
                                    case "pesos mexicanos a libras":
                                        resultado = valor / libras.getValor();
                                        mostrarResultado(resultado, "£", libras.getNombre());
                                        contInicial = terminarPrograma();
                                        x = validarDato(contInicial);
                                        break;
                                    case "pesos mexicanos a yenes":
                                        resultado = valor / yen.getValor();
                                        mostrarResultado(resultado, "¥", yen.getNombre());
                                        contInicial = terminarPrograma();
                                        x = validarDato(contInicial);
                                        break;
                                    case "pesos mexicanos a wones":
                                        resultado = valor / won.getValor();
                                        mostrarResultado(resultado, "₩", won.getNombre());
                                        contInicial = terminarPrograma();
                                        x = validarDato(contInicial);
                                        break;
                                }
                                break;
                            } else {
                                x = 1;
                            }
                        }
                    }

                    break;
                case 2:

                    do {
                        try {
                            valorCadena = JOptionPane.showInputDialog(null, "Introduce la temperatura a convertir", "Convercion de temperatura", JOptionPane.QUESTION_MESSAGE);
                            valor = Double.parseDouble(valorCadena);
                            x = 0;
                        } catch (Exception e) {
                            if (e instanceof NumberFormatException) {
                                JOptionPane.showMessageDialog(null, "Se ingreso un dato no permitido por favor intentelo de nuevo", "Error ingreso de dato incorrecto", JOptionPane.ERROR_MESSAGE);
                            } else if (e instanceof NullPointerException) {
                                x = 3;
                                break;
                            }
                            System.out.println(e);

                        }
                    } while (x == 1);
                    while (x == 0) {
                        Object[] temperaturas = {"Kelvin a Celsius", "Fahrenheit a Celsius", "Celsius a kelvin", "Celsius a Fahrenheit", "Farhenheit a Kelvin", "Kelvin a Fahrenheit"};
                        Object opcionTemp = JOptionPane.showInputDialog(null, "Elige la temperatura a la que quieras convertir", "Convercion de Temperaturas", JOptionPane.QUESTION_MESSAGE, null, temperaturas, temperaturas[0]);
                        for (Object temp : temperaturas) {
                            if (opcionTemp == temp) {
                                vm = (String) opcionTemp;
                                switch (vm.toLowerCase()) {
                                    case "kelvin a celsius":
                                        resultado = valor - 273.1;
                                        mostrarResultadoTemp(resultado, "°", celsius.getNombre());
                                        contInicial = terminarPrograma();
                                        x = validarDato(contInicial);
                                        ;
                                        break;
                                    case "fahrenheit a celsius":
                                        resultado = (valor - 32) * 5 / 9;
                                        mostrarResultadoTemp(resultado, "°", fahrenheit.getNombre());
                                        contInicial = terminarPrograma();
                                        x = validarDato(contInicial);
                                        break;
                                    case "celsius a kelvin":
                                        resultado = valor + 273.15;
                                        mostrarResultadoTemp(resultado, "°", celsius.getNombre());
                                        contInicial = terminarPrograma();
                                        x = validarDato(contInicial);
                                        break;
                                    case "celsius a fahrenheit":
                                        resultado = (valor * 1.8) + 32;
                                        mostrarResultadoTemp(resultado, "°", celsius.getNombre());
                                        contInicial = terminarPrograma();
                                        x = validarDato(contInicial);
                                        break;
                                    case "farhenheit a kelvin":
                                        resultado = (valor - 32) * 5 / 9 + 273.15;
                                        mostrarResultadoTemp(resultado, "°", celsius.getNombre());
                                        contInicial = terminarPrograma();
                                        x = validarDato(contInicial);
                                        break;
                                    case "kelvin a fahrenheit":
                                        resultado = ((valor - 273.15) * (1.8)) + 32;
                                        mostrarResultadoTemp(resultado, "°", celsius.getNombre());
                                        contInicial = terminarPrograma();
                                        x = validarDato(contInicial);
                                        break;
                                }
                                break;
                            } else {
                                x = 1;
                            }
                        }

                    }
                    break;
            }
        } while (contInicial == 0);
    }

    public static void mostrarResultado(double res, String simbol, String mon) {
        JOptionPane.showMessageDialog(null, "Tienes : " + simbol + " " + res + " " + mon, "Resultado de la convercion", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mostrarResultadoTemp(double res, String simbol, String mon) {
        JOptionPane.showMessageDialog(null, "Tienes : " + res + " " + simbol + " " + mon, "Resultado de la convercion", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int terminarPrograma() {
        int cont = 0;
        int opc = JOptionPane.showConfirmDialog(null, "¿Quieres continnuar?", "Selecciona una opcion", JOptionPane.YES_NO_CANCEL_OPTION);
        switch (opc) {
            case 0:
                cont = 0;
                break;
            case 1:
                JOptionPane.showConfirmDialog(null, "Programa finalizado", "Mensaje", JOptionPane.DEFAULT_OPTION);
                cont = 1;
                break;
            case 2:
                cont = 2;
                //System.exit(0);
                break;
        }
        return cont;
    }

    public static int validarDato(int dato) {
        int validate = 1;

        if (dato == 0) {
            validate = 1;
        } else if (dato == 1) {
            validate = 1;
        } else if (dato == 2) {
            validate = 0;
        }
        return validate;
    }
}
