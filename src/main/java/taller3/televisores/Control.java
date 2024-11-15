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
        if (tv.canal > 0 && tv.estado == true) {
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
        tv.canal = canal1;
    }

    public void setVolumen (int volumen1) {
        tv.volumen = volumen1;
    }


    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

}
