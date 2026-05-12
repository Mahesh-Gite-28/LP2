import java.util.Scanner;

public class HealthcareChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Healthcare Chatbot -----");

        while(true) {

            System.out.print("Enter your symptom: ");
            String symptom = sc.nextLine().toLowerCase();

            if(symptom.equals("fever")) {

                System.out.println("Bot: You may have viral infection. Take rest and drink water.");

            }

            else if(symptom.equals("cold")) {

                System.out.println("Bot: You may have common cold. Drink hot fluids.");

            }

            else if(symptom.equals("cough")) {

                System.out.println("Bot: Avoid cold drinks and take proper medication.");

            }

            else if(symptom.equals("headache")) {

                System.out.println("Bot: Take proper sleep and stay hydrated.");

            }

            else if(symptom.equals("bye")) {

                System.out.println("Bot: Thank you! Stay healthy.");
                break;

            }

            else {

                System.out.println("Bot: Sorry, symptom not recognized.");

            }

        }

        sc.close();

    }

}