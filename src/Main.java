public class Main {
    public static void main(String[] args) {
        String[] cardNumbers = {
                "4111111111111111", // Visa
                "5500000000000004", // MasterCard
                "340000000000009",  // American Express
                "6011000000000004", // Discover
                "30000000000004",   // Diners Club
                "3530111333300000", // JCB
                "6504850000000000", // Elo
                "201400000000009",  // EnRoute
                "8699123456789012", // Voyager
                "5078601870000127980", // Aura
                "1234567890123456"  // Desconhecida
        };

        for (String number : cardNumbers) {
            String bandeira = Validador.descobrirBandeira(number);
            System.out.println("Card: " + number + " | Bandeira: " + bandeira);
        }
    }
}