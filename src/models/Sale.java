package models;

public class Sale {

    private Customer customer;
    private Vehicle vehicle;
    private Trip trip;

    public void finalizarSale(Customer customer, Vehicle vehicle, Trip trip){

        System.out.println("Processando dados do cliente ...");
        System.out.println(customer.toString());

        System.out.println("Processando dados do transporte ...");
        System.out.println(vehicle.toString());

        System.out.println("Processando dados da viagem ...");
        System.out.println(trip.toString());

        System.out.println("A compra da passagem de " +customer.getName() + " para " +trip.getLocal()+ " com data de saida para " + trip.getDataTripIda() + "foi finalizada com sucesso.\nValor: " +trip.getValueTrip());

    }

    public void cancelarSale(Customer customer, Trip trip){
        System.out.println("Cancelando a compra da passagem do cliente "+ customer.getName() +" para " +  trip.getLocal());
        System.out.println("Compra cancelada com sucesso!!");
    }

}
