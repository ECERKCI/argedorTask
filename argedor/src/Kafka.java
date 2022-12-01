public class Kafka {
    customer customer =  new customer();

    public void sendMessage(String message)
    {
        if(!customer.sendMessage(message))
            System.out.println("Tüm threadlar dolu veri boşta kaldı : "+ message);
    }



}
