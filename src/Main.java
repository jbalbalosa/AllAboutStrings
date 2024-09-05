public class Main {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t   \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World %d %n", helloWorld.indexOf("World"));
        System.out.printf("index of l %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of l %d %n", helloWorld.indexOf('l',3));
        System.out.printf("index of l %d %n", helloWorld.lastIndexOf('l',8));

        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower)){
            System.out.println("Value match exactly");
        }

        if(helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Value match exactly");
        }

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3,5));
        String newDate = String.join("/", "25","11","1982");
        System.out.println("newDate = " + newDate);
        System.out.println("ABC\n".repeat(5));

    }
    public static void printInformation(String string){

        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()){
            System.out.println("String is empty");
            return;
        }
        if(string.isBlank()){
            System.out.println("String is blank");
        }
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length -1));

    }
    }
}
