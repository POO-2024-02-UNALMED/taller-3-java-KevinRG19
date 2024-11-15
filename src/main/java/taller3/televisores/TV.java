package taller3.televisores;

public class TV {
    private Marca marca;
    int canal = 1;
    private int precio = 500;
    boolean estado;
    int volumen = 1;
    private Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado) {  //me falta determinar si esta encendido o no
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca (Marca marca) {
        this.marca = marca;
    }

    public int getCanal () {
        return canal;
    }

    public void setCanal (int canal1) {
        if (canal1 <= 120 && estado == true && canal1 >= 1) {
            canal = canal1;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio (int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen1) {
        if (volumen1 >= 7 && estado == true && volumen1 >=0 ) {
            volumen = volumen1;
        }
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public void turnOn() {
        estado = true;
    }

    public void turnOff() {
        estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void canalUp() {
        if (canal < 120 && estado == true) {
            canal++;
        }
        else {
            return;
        }
    }

    public void canalDown() {
        if (canal > 1 && estado == true) {
            canal--;
        }
        else {
            return;
        }
    }

    public void volumenUp() {
        if (volumen < 7 && estado == true) {
            volumen++;
        }
        else {
            return;
        }
    }

    public void volumenDown() {
        if (volumen > 0 && estado == true) {
            volumen--;
        }
        else{
            return;
        }
    }
}

