package taller3.televisores;

public class Control {
    private TV tv;

    public void enlazar (TV tv) {
        this.tv = tv;
        tv.setControl(this);
    }

    public void turnOff() {
        tv.estado = false;
    }

    public void turnOn() {
        tv.estado = true;
    }

    public void canalUp() {
        if (tv.canal < 120 && tv.estado == true) {
            tv.canal++;
        }
        else{
            return;
        }
    }

    public void canalDown() {
        if (tv.canal > 1 && tv.estado == true) {
            tv.canal--;
        }
        else{
            return;
        }
    }

    public void volumenDown () {
        if (tv.volumen > 0 && tv.estado == true) {
            tv.volumen--;
        }
        else{
            return;
        }
    }

    public void volumenUp() {
        if (tv.volumen < 7 && tv.estado == true) {
            tv.volumen++;
        }
        else {
            return;
        }
    }

    public void setCanal (int canal1) {
        if (canal1 <= 120 && tv.estado == true && canal1 >= 1) {
            tv.canal = canal1;
        }
    }

    public void setVolumen (int volumen1) {
        if (volumen1 <= 7 && tv.estado == true && volumen1 >=0 ) {
            tv.volumen = volumen1;
        }
    }


    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

}
