//http://www.floatrates.com/daily/eur.json

public class Clase_TipoMoneda {

    String code, name;
    Double rate, inverseRate ;

    public Clase_TipoMoneda(String code, String name, Double rate, Double inverseRate ) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.rate = rate;
        this.inverseRate = inverseRate;
    }

    public String getCode() {
        return code;
    }
  
    public String getName() {
        return name;
    }

    public Double getRate() {
        return rate;
    }

    public Double getinverseRate() {
        return inverseRate;
    }
}
