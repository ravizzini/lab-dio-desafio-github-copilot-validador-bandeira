public class Validador {
    public static String validarCartao(String numero) {
        if (numero.matches("^4[0-9]{12}(?:[0-9]{3})?$")) {
            return "Visa";
        } else if (numero.matches("^5[1-5][0-9]{14}$")) {
            return "MasterCard";
        } else if (numero.matches("^3[47][0-9]{13}$")) {
            return "American Express";
        } else if (numero.matches("^6(?:011|5[0-9]{2})[0-9]{12}$")) {
            return "Discover";
        } else if (numero.matches("^3(?:0[0-5]|[68][0-9])[0-9]{11}$")) {
            return "Diners Club";
        } else if (numero.matches("^(?:2131|1800|35\\d{3})\\d{11}$")) {
            return "JCB";
        } else if (numero.matches("^(4011(78|79)|431274|438935|451416|457393|504175|5067[0-6][0-9]|50677[0-8]|5090[0-9]{2}|627780|636297|636368|6500(31|32|33|34|35|36|37|38|39)|6504(85|86|87|88|89)|6505(01|02|03|04|05|06|07|08|09)|6507(01|02|03|04|05|06|07|08|09)|6509(21|22|23|24|25|26|27|28|29)|6516(52|53|54|55|56|57|58|59)|6550(00|01|02|03|04|05|06|07|08|09))[0-9]{10,12}$")) {
            return "Elo";
        } else if (numero.matches("^2014[0-9]{11}$|^2149[0-9]{11}$")) {
            return "EnRoute";
        } else if (numero.matches("^8699[0-9]{12}$")) {
            return "Voyager";
        } else if (numero.matches("^50[0-9]{14,17}$")) {
            return "Aura";
        } else {
            return "Desconhecida";
        }
    }

    public static String descobrirBandeira(String numeroCartao) {
        return validarCartao(numeroCartao);
    }
}
