import java.util.Scanner;
import device.Iphone;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Iphone iphone = new Iphone();

        System.out.println("Select the application");
        System.out.println("1 - Browser");
        System.out.println("2 - Call");
        System.out.println("3 - Music");

        int option = input.nextInt();

        switch (option) {
            case 1:
                runSafariApp(iphone);
                break;
            case 2:
                runPhoneApp(iphone);
                break;
            case 3:
                runMusicApp(iphone);
                break;
            default:
                break;
        }

        input.close();
    }

    static void runSafariApp(Iphone browser) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Open Browser");
        System.out.println("2 - New Tab");
        System.out.println("3 - Update Page");

        int opt = scan.nextInt();

        switch (opt) {
            case 1:
                System.out.print("URL:");
                String url = scan.next();
                browser.toShowPage(url);
                break;
            case 2:
                browser.toAddNewTab();
                break;
            case 3:
                browser.toUpdatePage();
                break;
            default:
                break;
        }

        scan.close();
    }

    static void runPhoneApp(Iphone phone) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Call");
        System.out.println("2 - Answer Call");
        System.out.println("3 - Voice Mail");

        int opt = scan.nextInt();

        switch (opt) {
            case 1:
                System.out.print("Phone Number:");
                String number = scan.next();
                phone.toCall(number);
                break;
            case 2:
                phone.toAnswerCall();
                break;
            case 3:
                phone.toStartVoiceMail();
                break;
            default:
                break;
        }

        scan.close();
    }

    static void runMusicApp(Iphone ipod) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Play");
        System.out.println("2 - Pause");
        System.out.println("3 - Select Music");

        int opt = scan.nextInt();

        switch (opt) {
            case 1:
                ipod.toPlay();
                break;
            case 2:
                ipod.toPause();
                break;
            case 3:
                System.out.println("Select the music:");
                System.out.println("1 - Cry for Help (Rick Astley)");
                System.out.println("2 - You Make Me Feel Brand New (Simple Red)");
                System.out.println("3 - Head Over Heels (Tears For Fears)");
                System.out.println("4 - Ordinary World (Duran Duran)");
                System.out.println("5 - Black (Pearl Jam)");
                System.out.println("6 - Holy In My Soul (Aerosmith)");

                int op = scan.nextInt();

                switch (op) {
                    case 1:
                        ipod.toSelectMusic("Cry for Help (Rick Astley)");
                        break;
                    case 2:
                        ipod.toSelectMusic("You Make Me Feel Brand New (Simple Red)");
                        break;
                    case 3:
                        ipod.toSelectMusic("Head Over Heels (Tears For Fears)");
                        break;
                    case 4:
                        ipod.toSelectMusic("Ordinary World (Duran Duran)");
                        break;
                    case 5:
                        ipod.toSelectMusic("Black (Pearl Jam)");
                        break;
                    case 6:
                        ipod.toSelectMusic("Holy In My Soul (Aerosmith)");
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

        scan.close();
    }
}
