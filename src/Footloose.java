import java.util.ArrayList;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Footloose {

    static ArrayList<String> nombresVaron   = new ArrayList<>();
    static ArrayList<String> coloresVaron   = new ArrayList<>();
    static ArrayList<Integer> tallasVaron   = new ArrayList<>();
    static ArrayList<Double>  preciosVaron  = new ArrayList<>();
    static ArrayList<Double>  descVaron     = new ArrayList<>();

    static ArrayList<String> nombresMujer   = new ArrayList<>();
    static ArrayList<String> coloresMujer   = new ArrayList<>();
    static ArrayList<Integer> tallasMujer   = new ArrayList<>();
    static ArrayList<Double>  preciosMujer  = new ArrayList<>();
    static ArrayList<Double>  descMujer     = new ArrayList<>();

    static ArrayList<String> correosRegistrados    = new ArrayList<>();
    static ArrayList<String> contraseñasRegistradas = new ArrayList<>();

    static String usuarioActivo  = "invitado";
    static boolean sesionIniciada = false;
    static boolean esAdmin        = false;
    
    static Scanner escaner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarDatos();
        menuAcceso();
    }

    public static void inicializarDatos() {
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "R18 Hombres R18-Xw00245", "Gris", 41, 167.90, 30.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Puma Caven III", "Blanco total", 42, 229.00, 0.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Puma Transport", "Negro/suela blanca", 41, 189.00, 0.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Puma Jada Classic Sd", "Beige", 40, 199.00, 0.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Puma Blaze Lite Nbk", "Negro", 42, 199.00, 0.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Skechers Bobs Squad 4", "Blanco", 41, 279.00, 0.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Skechers Uno Savvy", "Blanco", 42, 249.00, 0.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Puma Court Lally Metallic", "Blanco", 40, 179.00, 0.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Puma Carina 3", "Negro", 42, 229.00, 0.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Skechers Bobs Arch", "Negro", 41, 239.00, 0.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Renzo Renzini Rrz-Wo0001", "Marron oscuro", 41, 135.90, 20.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Renzo Renzini Rrz-Cf00006", "Azul oscuro", 42, 249.90, 0.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Renzo Renzini Rrz-Cf00002", "Azul", 41, 249.90, 0.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Renzo Renzini Rrz-Cf00004", "Marron", 43, 249.90, 0.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Renzo Renzini Rrz-Fv00003", "Chocolate", 42, 249.90, 0.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Renzo Renzini Rrz-Jl00002", "Negro", 41, 249.90, 0.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Renzo Renzini Rrz-Lk00001", "Camel", 42, 249.90, 0.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Renzo Renzini Rrz-Cc00004", "Marron oscuro", 43, 229.90, 0.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Renzo Renzini Rfv-002", "Marron claro", 42, 239.90, 0.0);
        agregarProducto(nombresVaron, coloresVaron, tallasVaron, preciosVaron, descVaron, "Renzo Renzini Rrz-Jq00004", "Azul oscuro", 41, 199.90, 0.0);

        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "R18 Mujeres R18-Xw00245", "Gris", 37, 167.90, 30.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Puma Caven III Wns", "Blanco total", 38, 229.00, 0.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Puma Transport", "Negro/suela blanca", 37, 189.00, 0.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Puma Jada Classic Sd", "Beige", 36, 199.00, 0.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Puma Blaze Lite Nbk Wns", "Negro", 38, 199.00, 0.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Skechers Bobs Squad 4", "Blanco", 37, 279.00, 0.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Skechers Uno Savvy", "Blanco", 38, 249.00, 0.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Puma Court Lally Metallic", "Blanco", 36, 179.00, 0.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Puma Carina 3", "Negro", 38, 229.00, 0.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Skechers Bobs Arch", "Negro", 37, 239.00, 0.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Top Model Tmo-N0013", "Negro", 36, 109.90, 50.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Vizzano 6428.101.7286", "Nude", 37, 139.90, 0.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Footloose Ftl-Yz00077", "Negro", 38, 99.90, 0.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Footloose Ftl-Yq00007", "Negro gamuza", 36, 79.90, 0.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Footloose Ftl-I0025", "Dorado", 37, 69.90, 0.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Footloose Ftl-Yz00078", "Negro track", 38, 149.90, 0.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Footloose Ftl-Yq00008", "Animal print", 36, 69.90, 0.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Footloose Ftl-Rs00015", "Negro textura", 37, 129.90, 0.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Footloose Ftl-I0041", "Nude oscuro", 38, 99.00, 0.0);
        agregarProducto(nombresMujer, coloresMujer, tallasMujer, preciosMujer, descMujer, "Footloose Ftl-I0026", "Crema", 36, 79.90, 0.0);
    }

    static void agregarProducto(ArrayList<String> nombres, ArrayList<String> colores, ArrayList<Integer> tallas, ArrayList<Double> precios, ArrayList<Double> descs, String nombre, String color, int talla, double precio, double desc) {
        nombres.add(nombre);
        colores.add(color);
        tallas.add(talla);
        precios.add(precio);
        descs.add(desc);
    }

    public static void menuAcceso() {
        boolean corriendo = true;
        while (corriendo) {
            System.out.println("==========================================");
            System.out.println("          BIENVENIDO A FOOTLOOSE!         ");
            System.out.println("==========================================");
            System.out.println(" Status: [" + usuarioActivo + "] [Admin: " + esAdmin + "]");
            System.out.println("0.- Salir");
            System.out.println("1.- Iniciar Sesion");
            System.out.println("2.- Registrarse");
            System.out.println("3.- Entrar como Invitado");
            if (esAdmin) {
                System.out.println("4.- PANEL DE ADMINISTRADOR");
            }
            System.out.println("Seleccione una opcion:");
            int op = escaner.nextInt();
            escaner.nextLine();
            switch (op) {
                case 0:
                    System.out.println("Gracias por visitar Footloose. Hasta luego!");
                    corriendo = false;
                    break;
                case 1:
                    iniciarSesion();
                    break;
                case 2:
                    registrarse();
                    break;
                case 3:
                    usuarioActivo = "invitado";
                    sesionIniciada = false;
                    esAdmin = false;
                    menuCatalogo();
                    break;
                case 4:
                    if (esAdmin) menuAdminCRUD();
                    else System.out.println("Opcion no valida.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }
        escaner.close();
    }

    public static void iniciarSesion() {
        System.out.println("------ INICIAR SESION ------");
        boolean ok = false;
        do {
            System.out.println("Correo (debe contener '@' y terminar en '.com') o '0' para cancelar:");
            String correo = escaner.nextLine();
            if (correo.equals("0")) return;

            System.out.println("Contraseña :");
            String pass = escaner.nextLine();

            if (correo.equals("admin@footloose.com") && pass.equals("admin123")) {
                esAdmin = true;
                sesionIniciada = true;
                usuarioActivo = "admin";
                System.out.println("Bienvenido, ADMINISTRADOR!");
                ok = true;
                menuCatalogo();
                return;
            }

            boolean correoFmt = correo.contains("@") && correo.endsWith(".com");
            boolean passFmt = pass.length() == 8;

            if (!correoFmt || !passFmt) {
                System.out.println("[ERROR] Formato invalido.");
                if (!correoFmt) System.out.println(" - El correo debe contener '@' y terminar en '.com'");
                if (!passFmt) System.out.println(" - La contrasena debe tener exactamente 8 caracteres");
            } else {
                int idx = correosRegistrados.indexOf(correo);
                if (idx >= 0 && contraseñasRegistradas.get(idx).equals(pass)) {
                    sesionIniciada = true;
                    usuarioActivo = correo;
                    System.out.println("Ingreso exitoso! Bienvenido " + correo);
                    ok = true;
                    menuCatalogo();
                    return;
                } else {
                    System.out.println("Credenciales no validas.");
                }
            }

            if (!ok) {
                System.out.println("Desea cancelar el inicio de sesion? (S/N):");
                if (escaner.nextLine().equalsIgnoreCase("S")) return;
            }
        } while (!ok);
    }

    public static void registrarse() {
        System.out.println("------ REGISTRARSE ------");
        String correo = "";
        boolean correoOk = false;
        while (!correoOk) {
            System.out.println("Cree su correo (debe contener '@' y terminar en '.com'):");
            correo = escaner.nextLine();
            if (correo.contains("@") && correo.endsWith(".com")) {
                if (correosRegistrados.contains(correo)) {
                    System.out.println("[ERROR] Ese correo ya esta registrado.");
                } else {
                    correoOk = true;
                }
            } else {
                System.out.println("[ERROR] Formato de correo invalido.");
            }
        }

        String pass = "";
        boolean passOk = false;
        while (!passOk) {
            System.out.println("Cree su contrasena (exactamente 8 caracteres):");
            pass = escaner.nextLine();
            if (pass.length() == 8) {
                passOk = true;
            } else {
                System.out.println("[ERROR] La contrasena debe tener exactamente 8 caracteres.");
            }
        }

        correosRegistrados.add(correo);
        contraseñasRegistradas.add(pass);
        System.out.println("Registro exitoso! Ya puede iniciar sesion con su correo.");
    }

    public static void menuCatalogo() {
        boolean volver = false;
        while (!volver) {
            System.out.println("==========================================");
            System.out.println("            CATALOGO FOOTLOOSE            ");
            System.out.println("==========================================");
            System.out.println("1.- Seccion Varon");
            System.out.println("2.- Seccion Mujer");
            System.out.println("3.- Regresar (Cerrar Sesion)");
            System.out.println("Seleccione una opcion:");
            int op = escaner.nextInt();
            escaner.nextLine();

            if (op == 3) {
                volver = true;
                usuarioActivo = "invitado";
                sesionIniciada = false;
                esAdmin = false;
            } else if (op == 1 || op == 2) {
                ArrayList<String> nombres = (op == 1) ? nombresVaron : nombresMujer;
                ArrayList<String> colores = (op == 1) ? coloresVaron : coloresMujer;
                ArrayList<Integer> tallas = (op == 1) ? tallasVaron : tallasMujer;
                ArrayList<Double> precios = (op == 1) ? preciosVaron : preciosMujer;
                ArrayList<Double> descs = (op == 1) ? descVaron : descMujer;
                String seccion = (op == 1) ? "VARON" : "MUJER";

                System.out.println("------ PRODUCTOS " + seccion + " ------");
                imprimirCatalogo(nombres, colores, tallas, precios, descs);

                System.out.println("Elija el numero de producto (1-" + nombres.size() + "):");
                int prod = escaner.nextInt();
                escaner.nextLine();
                if (prod >= 1 && prod <= nombres.size()) {
                    int idx = prod - 1;
                    System.out.println("Ingrese la cantidad de pares que desea llevar:");
                    int cantidad = escaner.nextInt();
                    escaner.nextLine();
                    if (cantidad > 0) {
                        double precio = precios.get(idx);
                        double desc = descs.get(idx);
                        double total;
                        if (desc > 0 && cantidad >= 2) {
                            double factor = 1.0 - (desc / 100.0);
                            total = (precio * 2 * factor) + (precio * (cantidad - 2));
                            System.out.println("[PROMO] Se aplico " + (int)desc + "% descuento en los 2 primeros pares.");
                        } else {
                            total = precio * cantidad;
                        }
                        System.out.printf("Total a pagar: S/. %.2f%n", total);
                        System.out.println("------ REGISTRO DE CLIENTE ------");
                        System.out.println("Nombre:");
                        String nombre = escaner.nextLine();
                        System.out.println("Apellido:");
                        String apellido = escaner.nextLine();
                        String dni = pedirCampoLongitud("DNI (8 digitos)", 8);
                        if (!dni.equals("CANCELADO")) {
                            String telefono = pedirCampoLongitud("Telefono/Celular (9 digitos)", 9);
                            if (!telefono.equals("CANCELADO")) {
                                String tienda = seleccionarTienda();
                                String[] correoArr = {"No requerido (Pago en Efectivo)"};
                                String metodoPago = procesarFlujoPago(total, correoArr);
                                if (!metodoPago.isEmpty()) {
                                    generarBoleta(correoArr[0], nombre, apellido, dni, telefono, nombres.get(idx), colores.get(idx), tallas.get(idx), cantidad, total, metodoPago, tienda);
                                    volver = true;
                                }
                            }
                        }
                    } else {
                        System.out.println("Cantidad invalida.");
                    }
                } else {
                    System.out.println("Producto no existente.");
                }
            } else {
                System.out.println("Opcion invalida.");
            }
        }
    }

    static void imprimirProducto(int i, ArrayList<String> nombres, ArrayList<String> colores, ArrayList<Integer> tallas, ArrayList<Double> precios, ArrayList<Double> descs) {
        String promo = descs.get(i) > 0 ? " [Lleva 2 y obtén " + (int)descs.get(i).doubleValue() + "% desc.]" : "";
        System.out.printf("%2d. %-35s | %-18s | T%d | S/. %.2f%s%n", i + 1, nombres.get(i), colores.get(i), tallas.get(i), precios.get(i), promo);
    }

    static void imprimirCatalogo(ArrayList<String> nombres, ArrayList<String> colores, ArrayList<Integer> tallas, ArrayList<Double> precios, ArrayList<Double> descs) {
        for (int i = 0; i < nombres.size(); i++) {
            imprimirProducto(i, nombres, colores, tallas, precios, descs);
        }
    }

    static String pedirCampoLongitud(String etiqueta, int longitud) {
        while (true) {
            System.out.println(etiqueta + " o '0' para cancelar:");
            String val = escaner.nextLine();
            if (val.equals("0")) {
                System.out.println("Operacion cancelada.");
                return "CANCELADO";
            }
            if (val.length() == longitud) return val;
            System.out.println("[ERROR] Debe tener exactamente " + longitud + " caracteres.");
        }
    }

    public static String seleccionarTienda() {
        System.out.println("--- SELECCIONE TIENDA DE RECOJO ---");
        System.out.println("1. Real Plaza Juliaca (Av. Nueva Zelanda)");
        System.out.println("2. Jiron Huancane (Centro de Juliaca)");
        System.out.println("3. Real Plaza Arequipa (Av. Ejercito)");
        System.out.println("4. Mall Plaza Bellavista (Callao - Lima)");
        System.out.println("5. Plaza Norte (Independencia - Lima)");
        System.out.println("Seleccione (1-5):");
        int op = escaner.nextInt();
        escaner.nextLine();
        switch (op) {
            case 1: return "Real Plaza Juliaca (Puno)";
            case 2: return "Jiron Huancane (Juliaca - Puno)";
            case 3: return "Real Plaza Arequipa (Arequipa)";
            case 4: return "Mall Plaza Bellavista (Callao)";
            case 5: return "Plaza Norte (Independencia - Lima)";
            default: return "Tienda Central Footloose (Lima)";
        }
    }

    public static String procesarFlujoPago(double total, String[] correoArr) {
        System.out.println("--- METODO DE PAGO ---");
        System.out.println("1. Tarjeta de Credito");
        System.out.println("2. Efectivo");
        System.out.println("Seleccione:");
        int met = escaner.nextInt();
        escaner.nextLine();
        if (met == 1) {
            validarTarjeta(total, correoArr);
            return "Tarjeta de Credito";
        } else if (met == 2) {
            if (pagarEfectivo(total)) return "Efectivo";
        } else {
            System.out.println("Metodo invalido. Operacion cancelada.");
        }
        return "";
    }

    public static void validarTarjeta(double total, String[] correoArr) {
        System.out.printf("Monto a pagar: S/. %.2f%n", total);
        boolean correoOk = false;
        do {
            System.out.println("Ingrese correo para boleta (con '@' y '.com'):");
            String c = escaner.nextLine();
            if (c.contains("@") && c.endsWith(".com")) {
                correoArr[0] = c;
                correoOk = true;
            } else {
                System.out.println("[ERROR] Formato de correo invalido.");
            }
        } while (!correoOk);
        boolean aprobado = false;
        do {
            System.out.println("Numero de tarjeta (16 digitos):");
            String nro = escaner.nextLine();
            System.out.println("Fecha caducidad (MM/AA):");
            String fecha = escaner.nextLine();
            System.out.println("CVV (3 digitos):");
            String cvv = escaner.nextLine();
            boolean nroOk = nro.length() == 16;
            boolean cvvOk = cvv.length() == 3;
            boolean fechaFmt = fecha.length() == 5 && fecha.contains("/");
            boolean fechaVig = false;
            if (fechaFmt) {
                try {
                    YearMonth ym = YearMonth.parse(fecha, DateTimeFormatter.ofPattern("MM/yy"));
                    fechaVig = !ym.isBefore(YearMonth.now());
                } catch (DateTimeParseException e) { fechaFmt = false; }
            }
            if (nroOk && cvvOk && fechaFmt && fechaVig) {
                System.out.println("Autorizando fondos... transaccion exitosa.");
                aprobado = true;
            } else {
                System.out.println("Operacion denegada:");
                if (!nroOk) System.out.println(" - Numero de tarjeta debe tener 16 digitos");
                if (!fechaFmt) System.out.println(" - Formato de fecha incorrecto");
                if (fechaFmt && !fechaVig) System.out.println(" - Tarjeta caducada");
                if (!cvvOk) System.out.println(" - CVV debe tener 3 digitos");
                System.out.println("Intente nuevamente.");
            }
        } while (!aprobado);
    }

    public static boolean pagarEfectivo(double total) {
        System.out.printf("Monto requerido: S/. %.2f%n", total);
        System.out.println("Ingrese monto con el que paga: S/. ");
        double pago = escaner.nextDouble();
        escaner.nextLine();
        if (pago < total) {
            System.out.println("[ERROR] Monto insuficiente. Operacion cancelada.");
            return false;
        }
        System.out.printf("Pago aceptado. Vuelto: S/. %.2f%n", pago - total);
        return true;
    }

    public static void generarBoleta(String correo, String nombre, String apellido, String dni, String telefono, String producto, String color, int talla, int cantidad, double total, String metodoPago, String tienda) {
        double subtotal = total / 1.18;
        double igv = total - subtotal;
        System.out.println("==================================================");
        System.out.println("          BOLETA DE VENTA DIGITAL                 ");
        System.out.println("      COMERCIAL FOOTLOOSE PERU S.A.C.             ");
        System.out.println("         RUC: 20511378491                         ");
        System.out.println("==================================================");
        System.out.println("CLIENTE  : " + nombre + " " + apellido);
        System.out.println("DNI      : " + dni + "     TELEFONO: " + telefono);
        System.out.println("CORREO   : " + correo);
        System.out.println("--------------------------------------------------");
        System.out.println("TIENDA   : " + tienda);
        System.out.println("--------------------------------------------------");
        System.out.println("DETALLE DE COMPRA:");
        System.out.println("Producto : " + producto);
        System.out.println("Color    : " + color + " | Talla: " + talla);
        System.out.println("Cantidad : " + cantidad + " pares");
        System.out.println("--------------------------------------------------");
        System.out.printf("Subtotal : S/. %.2f%n", subtotal);
        System.out.printf("IGV (18%%): S/. %.2f%n", igv);
        System.out.printf("TOTAL    : S/. %.2f%n", total);
        System.out.println("PAGO     : " + metodoPago);
        System.out.println("==================================================");
        System.out.println("     Gracias por tu compra en Footloose!          ");
        System.out.println("==================================================");
    }

    public static void menuAdminCRUD() {
        int op = 0;
        while (op != 5) {
            System.out.println("===== PANEL DE ADMINISTRADOR =====");
            System.out.println("1.- REGISTRAR producto");
            System.out.println("2.- MODIFICAR producto");
            System.out.println("3.- ELIMINAR producto");
            System.out.println("4.- BUSCAR producto");
            System.out.println("5.- VOLVER");
            System.out.println("Seleccione:");
            op = escaner.nextInt();
            escaner.nextLine();
            switch (op) {
                case 1: crudCrear(); break;
                case 2: crudModificar(); break;
                case 3: crudEliminar(); break;
                case 4: crudBuscar(); break;
                case 5: break;
                default: System.out.println("Opcion no valida."); break;
            }
        }
    }

    static int elegirSeccion() {
        System.out.println("1.- Seccion Varon     2.- Seccion Mujer");
        int s = escaner.nextInt();
        escaner.nextLine();
        return s;
    }

    public static void crudCrear() {
        System.out.println("--- REGISTRAR NUEVO PRODUCTO ---");
        int sec = elegirSeccion();
        ArrayList<String> nombres = (sec == 1) ? nombresVaron : nombresMujer;
        ArrayList<String> colores = (sec == 1) ? coloresVaron : coloresMujer;
        ArrayList<Integer> tallas = (sec == 1) ? tallasVaron : tallasMujer;
        ArrayList<Double> precios = (sec == 1) ? preciosVaron : preciosMujer;
        ArrayList<Double> descs = (sec == 1) ? descVaron : descMujer;
        System.out.println("Nombre del producto:");
        nombres.add(escaner.nextLine());
        System.out.println("Color:");
        colores.add(escaner.nextLine());
        System.out.println("Talla:");
        tallas.add(escaner.nextInt()); escaner.nextLine();
        System.out.println("Precio:");
        precios.add(escaner.nextDouble()); escaner.nextLine();
        System.out.println("Descuento % para promo 'lleva 2' (0 = sin promo):");
        descs.add(escaner.nextDouble()); escaner.nextLine();
        System.out.println("Producto registrado correctamente.");
    }

    public static void crudModificar() {
        System.out.println("--- MODIFICAR PRODUCTO ---");
        int sec = elegirSeccion();
        ArrayList<String> nombres = (sec == 1) ? nombresVaron : nombresMujer;
        ArrayList<String> colores = (sec == 1) ? coloresVaron : coloresMujer;
        ArrayList<Integer> tallas = (sec == 1) ? tallasVaron : tallasMujer;
        ArrayList<Double> precios = (sec == 1) ? preciosVaron : preciosMujer;
        ArrayList<Double> descs = (sec == 1) ? descVaron : descMujer;
        imprimirCatalogo(nombres, colores, tallas, precios, descs);
        System.out.println("Ingrese posicion a modificar (0-" + (nombres.size()-1) + "):");
        int pos = escaner.nextInt(); escaner.nextLine();
        if (pos < 0 || pos >= nombres.size()) { System.out.println("Posicion invalida."); return; }
        System.out.println("Nuevo nombre:");
        nombres.set(pos, escaner.nextLine());
        System.out.println("Nuevo color:");
        colores.set(pos, escaner.nextLine());
        System.out.println("Nueva talla:");
        tallas.set(pos, escaner.nextInt()); escaner.nextLine();
        System.out.println("Nuevo precio:");
        precios.set(pos, escaner.nextDouble()); escaner.nextLine();
        System.out.println("Nuevo descuento % (0 = sin promo):");
        descs.set(pos, escaner.nextDouble()); escaner.nextLine();
        System.out.println("Producto actualizado correctamente.");
    }

    public static void crudEliminar() {
        System.out.println("--- ELIMINAR PRODUCTO ---");
        int sec = elegirSeccion();
        ArrayList<String> nombres = (sec == 1) ? nombresVaron : nombresMujer;
        ArrayList<String> colores = (sec == 1) ? coloresVaron : coloresMujer;
        ArrayList<Integer> tallas = (sec == 1) ? tallasVaron : tallasMujer;
        ArrayList<Double> precios = (sec == 1) ? preciosVaron : preciosMujer;
        ArrayList<Double> descs = (sec == 1) ? descVaron : descMujer;
        imprimirCatalogo(nombres, colores, tallas, precios, descs);
        System.out.println("Ingrese posicion a eliminar (0-" + (nombres.size()-1) + "):");
        int pos = escaner.nextInt(); escaner.nextLine();
        if (pos < 0 || pos >= nombres.size()) { System.out.println("Posicion invalida."); return; }
        System.out.println("Eliminado: " + nombres.get(pos));
        nombres.remove(pos);
        colores.remove(pos);
        tallas.remove(pos);
        precios.remove(pos);
        descs.remove(pos);
        System.out.println("Producto eliminado correctamente.");
    }
    
    public static void crudBuscar() {
        System.out.println("--- BUSCAR PRODUCTO ---");
        System.out.println("Ingrese nombre a buscar:");
        String buscar = escaner.nextLine().toLowerCase();
        boolean encontrado = false;
        
        for (int i = 0; i < nombresVaron.size(); i++) {
            if (nombresVaron.get(i).toLowerCase().contains(buscar)) {
                encontrado = true;
                System.out.println("Encontrado en VARON (pos " + i + "):");
                System.out.printf("  %s | %s | T%d | S/. %.2f | Desc: %.0f%%%n",
                        nombresVaron.get(i), coloresVaron.get(i), tallasVaron.get(i), preciosVaron.get(i), descVaron.get(i));
            }
        }

        for (int i = 0; i < nombresMujer.size(); i++) {
            if (nombresMujer.get(i).toLowerCase().contains(buscar)) {
                encontrado = true;
                System.out.println("Encontrado en MUJER (pos " + i + "):");
                System.out.printf("  %s | %s | T%d | S/. %.2f | Desc: %.0f%%%n",
                        nombresMujer.get(i), coloresMujer.get(i), tallasMujer.get(i), preciosMujer.get(i), descMujer.get(i));
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado en el catalogo.");
        }
    }
}
