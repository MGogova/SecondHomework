public class HomeworkSecond {
    public static void main(String[] args) {
        // 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = "My name is <myName>";

        String myName  = name.replace("<myName>", scanner.nextLine());
        System.out.println(myName);

        // 2

        System.out.println("Enter first value :");
        String firstValue = scanner.nextLine();
        System.out.println("Enter second value :");
        String secondValue = scanner.nextLine();
        String result = String.valueOf((firstValue.equals(secondValue)));
        System.out.println(result);

        //3

        String count = ("What are you doing?");

        String split [] = count.split(" ");

        System.out.println(split.length+ " "+ "words");
        // 4

        String one = "I";
        String two = "love";
        String three = "dogs.";
        System.out.println(one + " "+ two + " " + three);


    }
}


}
