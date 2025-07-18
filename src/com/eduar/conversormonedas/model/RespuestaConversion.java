package com.eduar.conversormonedas.model;

public class RespuestaConversion {
    private String result;
    private String base_code;
    private String target_code;
    private double conversion_rate;
    private double conversion_result;

    public String getResult() {
        return result;
    }

    public String getBase_code() {
        return base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }

    public double getConversion_result() {
        return conversion_result;
    }

    @Override
    public String toString() {
        return String.format(
                "==================== RESULTADO DE LA CONVERSIÓN ====================\n" +
                        "Moneda base:         %s\n" +
                        "Moneda destino:      %s\n" +
                        "Tasa de conversión:  %.4f\n" +
                        "Monto convertido:    %.2f\n" +
                        "====================================================================",
                base_code, target_code, conversion_rate, conversion_result
        );
    }


}

