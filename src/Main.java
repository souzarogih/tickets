import models.Customer;
import models.Sale;
import models.Trip;
import models.Vehicle;
import models.utils.GenerateRandom;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Random ran = new Random();
        int randomNumber = ran.nextInt();

        System.out.println("Bem vindo - Sistema de Passagens\n");

        System.out.println("===Informe os dados do passageiro===");
        System.out.print("Nome: ");
        String nomePassageiro = sc.nextLine();

        System.out.print("Documento de identificação: ");
        int docNumberPassageiro = sc.nextInt();

        Customer customer1 = new Customer();
        customer1.setId(randomNumber);
        customer1.setName(nomePassageiro);
        customer1.setDoc_number(docNumberPassageiro);

        System.out.println("===Dados do cliente===");
        System.out.println(customer1);

        Vehicle vehicle = new Vehicle();
        System.out.println("Selecione o veiculo de sua preferencia");
        System.out.println("1 - [onibus - 20 lugares] \n2 - [van - 8 lugares] \n3 - [carro - 4 lugares]");

        int numero = sc.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Configurando onibus...");
                vehicle.setName("onibus");
                vehicle.setQtd_lugares(20);
                break;
            case 2:
                System.out.println("O número escolhido foi: 2.");
                vehicle.setName("van");
                vehicle.setQtd_lugares(8);
                break;
            case 3:
                System.out.println("O número escolhido foi: 3.");
                vehicle.setName("carro");
                vehicle.setQtd_lugares(4);
                break;
            default:
                System.out.println("O número escolhido é inválido! Digite um número entre 1 a 3.");
        }

        System.out.println("====Resumo da passagem====");
        System.out.println("Dados do cliente: " + customer1);
        System.out.println("Dados do veiculo: " + vehicle);
        System.out.println();

        Trip trip = new Trip();

        System.out.println("===Informe o local da viagem===");
        sc.nextLine();
        System.out.print("Local: ");
        String localTrip = sc.nextLine();
        trip.setLocal(localTrip);

        System.out.print("Data de partida: ");
        String dataIdaTrip = sc.nextLine();
        trip.setDataTripIda(dataIdaTrip);

        System.out.print("Data de volta: ");
        String dataVoltaTrip = sc.nextLine();
        trip.setDataTripVolta(dataVoltaTrip);

        GenerateRandom generateRandom = new GenerateRandom();
        trip.setValueTrip(generateRandom.generateNow());

        System.out.println();

        System.out.println("==Finalizando a passagem solicitada==");
        System.out.println("====Resumo da passagem====");
        System.out.println("Dados do cliente: " + customer1);
        System.out.println("Dados do veiculo: " + vehicle);
        System.out.println("Dados da viagem: " + trip);

        Sale sale = new Sale();
        System.out.println("\nDeseja confirmar a compra? 1 - Sim / 2 - Não");
        int finalizar = sc.nextInt();
        if(finalizar == 1){
            sale.finalizarSale(customer1, vehicle,trip);
        }else if(finalizar == 2){
            sale.cancelarSale(customer1, trip);
        }else {
            System.out.println("Não foi possível identificar a opção: "+finalizar);
        }

    }
}